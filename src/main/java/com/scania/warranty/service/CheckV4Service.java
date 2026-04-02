/**
 * Application service implementing warranty claim business logic.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1983}.
 */

package com.scania.warranty.service;

import com.scania.warranty.domain.CheckV4Result;
import com.scania.warranty.domain.ExtendedPartAgreement;
import com.scania.warranty.domain.InvoiceHeader;
import com.scania.warranty.dto.CheckV4Request;
import com.scania.warranty.dto.CheckV4Response;
import com.scania.warranty.repository.ExtendedPartAgreementRepository;
import com.scania.warranty.repository.InvoiceHeaderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CheckV4Service {

    private static final Logger log = LoggerFactory.getLogger(CheckV4Service.class);

    private final InvoiceHeaderRepository invoiceHeaderRepository;
    private final ExtendedPartAgreementRepository extendedPartAgreementRepository;

    @Autowired
    public CheckV4Service(InvoiceHeaderRepository invoiceHeaderRepository,
                          ExtendedPartAgreementRepository extendedPartAgreementRepository) {
        this.invoiceHeaderRepository = invoiceHeaderRepository;
        this.extendedPartAgreementRepository = extendedPartAgreementRepository;
    }

    /**
     * CheckV4 procedure: Validates whether an extended part agreement (HSEPAF) exists
     * for the given invoice header's hauptgruppe/nebengruppe combination, and checks
     * date validity against EPA_DATV.
     *
     * RPG logic flow:
     * 1. MONITOR block wraps entire procedure
     * 2. Early return if precondition not met (e.g. %FOUND check)
     * 3. CHAIN to HSAHKPF to retrieve invoice header
     * 4. If found, extract AHK040 (hauptgruppe) and AHK050 (nebengruppe)
     * 5. SETLL on HSEPAF with hauptgruppe + nebengruppe
     * 6. DOW loop reading HSEPAF records matching hauptgruppe + nebengruppe
     * 7. Inside loop: IF EPA_DATV meets date condition, RETURN valid
     * 8. ONERROR: handle exceptions gracefully
     * 9. Final RETURN
     *
     * @param rechNr the invoice number to look up
     * @param referenceDate the date to compare against EPA_DATV
     * @return CheckV4Response indicating validity and whether EPA was found
     */
    public CheckV4Response checkV4(String rechNr, LocalDate referenceDate) {
        try { // @rpg-trace: n1985
            if (rechNr == null || rechNr.isBlank()) { // @rpg-trace: n1987
                log.debug("CheckV4: rechNr is blank, returning NOT_APPLICABLE"); // @rpg-trace: n1988
                return new CheckV4Response(CheckV4Result.NOT_APPLICABLE, false); // @rpg-trace: n1989
            }

            Optional<InvoiceHeader> invoiceHeaderOpt = invoiceHeaderRepository.findByRechNr(rechNr); // @rpg-trace: n1991

            if (!invoiceHeaderOpt.isPresent()) { // @rpg-trace: n1992
                log.debug("CheckV4: InvoiceHeader not found for rechNr={}", rechNr);
                return new CheckV4Response(CheckV4Result.NOT_APPLICABLE, false); // @rpg-trace: n2008
            }

            InvoiceHeader invoiceHeader = invoiceHeaderOpt.get();

            String hauptgruppe = invoiceHeader.getHauptgruppe(); // @rpg-trace: n1994
            String nebengruppe = invoiceHeader.getNebengruppe(); // @rpg-trace: n1995

            if (hauptgruppe == null || hauptgruppe.isBlank()) { // @rpg-trace: n1994
                log.debug("CheckV4: hauptgruppe is blank for rechNr={}, returning NOT_APPLICABLE", rechNr);
                return new CheckV4Response(CheckV4Result.NOT_APPLICABLE, false);
            }

            List<ExtendedPartAgreement> epaRecords = extendedPartAgreementRepository
                .findByHauptgruppeAndNebengruppe(hauptgruppe, nebengruppe); // @rpg-trace: n1996

            for (ExtendedPartAgreement epa : epaRecords) { // @rpg-trace: n1997
                boolean matchesKey = hauptgruppe.equals(epa.getHauptgruppe())
                    && (nebengruppe == null || nebengruppe.equals(epa.getNebengruppe())); // @rpg-trace: n1998

                if (!matchesKey) { // @rpg-trace: n1999
                    break; // DOW condition no longer met, exit loop
                }

                LocalDate epaDatv = epa.getDatumVon(); // @rpg-trace: n2001

                if (epaDatv != null && !referenceDate.isBefore(epaDatv)) { // @rpg-trace: n2001
                    log.debug("CheckV4: Found valid EPA for hauptgruppe={}, nebengruppe={}, epaDatv={}", // @rpg-trace: n2002
                        hauptgruppe, nebengruppe, epaDatv);
                    return new CheckV4Response(CheckV4Result.VALID, true); // @rpg-trace: n2002
                }
            }

            log.debug("CheckV4: No valid EPA found for hauptgruppe={}, nebengruppe={}", hauptgruppe, nebengruppe);
            return new CheckV4Response(CheckV4Result.INVALID, false); // @rpg-trace: n2008

        } catch (Exception e) { // @rpg-trace: n2006
            log.error("CheckV4: Error during V4 check for rechNr={}: {}", rechNr, e.getMessage(), e);
            return new CheckV4Response(CheckV4Result.INVALID, false); // @rpg-trace: n2006
        }
    }
}