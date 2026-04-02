/**
 * Application service implementing warranty claim business logic.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.service;

import com.scania.warranty.domain.*;
import com.scania.warranty.dto.*;
import com.scania.warranty.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class ClaimSearchService {

    private final ClaimRepository claimRepository;
    private final ClaimErrorRepository claimErrorRepository;
    private final InvoiceRepository invoiceRepository;
    private final LaborRepository laborRepository;
    private final ExternalServiceRepository externalServiceRepository;
    private final ClaimReleaseRequestRepository claimReleaseRequestRepository;

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd");
    private static final int DEFAULT_PAGE_SIZE = 10;

    public ClaimSearchService(ClaimRepository claimRepository,
                              ClaimErrorRepository claimErrorRepository,
                              InvoiceRepository invoiceRepository,
                              LaborRepository laborRepository,
                              ExternalServiceRepository externalServiceRepository,
                              ClaimReleaseRequestRepository claimReleaseRequestRepository) {
        this.claimRepository = claimRepository; // @rpg-trace: n404
        this.claimErrorRepository = claimErrorRepository;
        this.invoiceRepository = invoiceRepository;
        this.laborRepository = laborRepository;
        this.externalServiceRepository = externalServiceRepository;
        this.claimReleaseRequestRepository = claimReleaseRequestRepository;
    }

    @Transactional(readOnly = true)
    public ClaimSearchResponseDto searchClaims(ClaimSearchRequestDto request) {
        boolean mark12Active = request.status() != null && !request.status().isBlank(); // @rpg-trace: n408
        boolean mark22Active = request.filpkz() != null && !request.filpkz().isBlank(); // @rpg-trace: n416

        String kzl = request.kzl() != null ? request.kzl() : ""; // @rpg-trace: n422
        String datauf = request.datauf() != null ? request.datauf() : ""; // @rpg-trace: n423

        List<Claim> rawClaims = loadClaims(kzl, datauf, request.sortDirection()); // @rpg-trace: n428

        int days = request.days(); // @rpg-trace: n439
        String dateRep = calculateRepDate(request.date(), days); // @rpg-trace: n440

        List<ClaimListItemDto> resultItems = new ArrayList<>(); // @rpg-trace: n436
        int lineCount = 0; // @rpg-trace: n436

        for (Claim claim : rawClaims) {
            if (lineCount >= 9999) break; // @rpg-trace: n436

            boolean passesDateFilter = passesDateFilter(claim, dateRep, days); // @rpg-trace: n439
            if (!passesDateFilter) continue;

            String filterArt = request.filterArt() != null ? request.filterArt() : ""; // @rpg-trace: n447
            if (!filterArt.isBlank()) {
                boolean passesFilterArt = applyFilterArt(claim, filterArt); // @rpg-trace: n448
                if (!passesFilterArt) continue;
            }

            boolean hasOpenErrors = checkOpenErrors(claim, kzl); // @rpg-trace: n452
            String statusText = determineStatusText(claim); // @rpg-trace: n476

            if (!passesStatusFilter(claim, request.status(), mark12Active)) continue; // @rpg-trace: n471
            if (!passesCompanyFilter(claim, request.filpkz(), mark22Active)) continue; // @rpg-trace: n471

            String searchFilter = request.filter() != null ? request.filter().trim() : ""; // @rpg-trace: n498
            if (!searchFilter.isBlank()) {
                boolean matchesSearch = applySearchFilter(claim, searchFilter, kzl); // @rpg-trace: n501
                if (!matchesSearch) continue;
            }

            String dmcCode = determineDmcCode(claim, kzl); // @rpg-trace: n1731
            int errorCount = countErrors(claim, kzl); // @rpg-trace: n1745
            String color = determineColor(claim, hasOpenErrors); // @rpg-trace: n473

            ClaimListItemDto item = new ClaimListItemDto(
                kzl,
                claim.getG71010(),
                claim.getG71020(),
                claim.getG71030(),
                claim.getG71040(),
                claim.getG71050(),
                claim.getG71060(),
                claim.getG71150(),
                statusText,
                dmcCode,
                errorCount,
                color,
                claim.getG71080(),
                ""
            ); // @rpg-trace: n471

            resultItems.add(item); // @rpg-trace: n509
            lineCount++; // @rpg-trace: n436
        }

        String filterDescription = buildFilterDescription(request); // @rpg-trace: n1435
        String sortDesc = buildSortDescription(request.sortField(), request.sortDirection()); // @rpg-trace: n1409

        return new ClaimSearchResponseDto(
            resultItems,
            resultItems.size(),
            request.pageNumber(),
            request.pageSize() > 0 ? request.pageSize() : DEFAULT_PAGE_SIZE,
            filterDescription,
            sortDesc,
            "",
            ""
        ); // @rpg-trace: n436
    }

    @Transactional
    public void processClaimAction(String kzl, String datauf, String claimCode, int action,
                                   String rechNr, String rechDatum, String claimNr, String art,
                                   String splitt, String neu4, String neuwt, String fgnr17) {
        Optional<Claim> claimOpt = claimRepository.findByG71000AndG71050AndG71060(kzl, datauf, claimCode); // @rpg-trace: n653

        if (claimOpt.isEmpty()) {
            throw new IllegalArgumentException("Claim not found for kzl=" + kzl + ", datauf=" + datauf + ", code=" + claimCode); // @rpg-trace: n654
        }

        Claim claim = claimOpt.get(); // @rpg-trace: n654

        switch (action) {
            case 2 -> processEditClaim(claim, kzl, rechNr, rechDatum, claimNr, art, splitt, neu4, neuwt); // @rpg-trace: n720
            case 4 -> processDeleteClaim(claim, kzl, rechNr, rechDatum, claimNr, art); // @rpg-trace: n585
            case 5 -> processViewClaim(claim); // @rpg-trace: n720
            case 6 -> processServiceCard(claim, kzl); // @rpg-trace: n720
            case 8 -> processWarrantyInfo(claim, kzl, fgnr17); // @rpg-trace: n720
            case 10 -> processSendClaim(claim, kzl, rechNr, rechDatum, claimNr, art, splitt, neu4, neuwt, fgnr17); // @rpg-trace: n720
            default -> throw new IllegalArgumentException("Invalid action: " + action); // @rpg-trace: n647
        }
    }

    @Transactional
    public void createNewClaim(String kzl, String rechNr, String rechDatum, String claimNr,
                               String art, String splitt, String neu4, String neuwt,
                               String datauf, String fgnr) {
        Invoice invoice = findInvoiceForClaim(kzl, rechNr, art, neuwt, splitt, datauf); // @rpg-trace: n974
        if (invoice == null) {
            throw new IllegalArgumentException("No invoice found for claim creation"); // @rpg-trace: n984
        }

        String repDate = invoice.getAhk620(); // @rpg-trace: n920
        if (repDate == null || repDate.isBlank()) {
            repDate = invoice.getAhk080(); // @rpg-trace: n929
        }

        BigDecimal nextCnr = claimRepository.findMaxClaimNumber(kzl)
            .map(max -> max.add(BigDecimal.ONE))
            .orElse(BigDecimal.ONE); // @rpg-trace: n1096

        Claim newClaim = new Claim(); // @rpg-trace: n1109
        newClaim.setG71000(kzl); // @rpg-trace: n1109
        newClaim.setG71010(rechNr); // @rpg-trace: n1109
        newClaim.setG71020(rechDatum); // @rpg-trace: n1109
        newClaim.setG71030(claimNr); // @rpg-trace: n1109
        newClaim.setG71040(art); // @rpg-trace: n1109
        newClaim.setG71050(datauf); // @rpg-trace: n1109
        newClaim.setG71060("0000001"); // @rpg-trace: n1109
        newClaim.setG71070(""); // @rpg-trace: n1109
        newClaim.setG71080(nextCnr); // @rpg-trace: n1105
        newClaim.setG71090(BigDecimal.ZERO); // @rpg-trace: n1109
        newClaim.setG71100(BigDecimal.ZERO); // @rpg-trace: n1109
        newClaim.setG71110(BigDecimal.ZERO); // @rpg-trace: n1109
        newClaim.setG71120(""); // @rpg-trace: n1109
        newClaim.setG71130(""); // @rpg-trace: n1109
        newClaim.setG71140(""); // @rpg-trace: n1109
        newClaim.setG71150(""); // @rpg-trace: n1109
        newClaim.setG71160(""); // @rpg-trace: n1109
        newClaim.setG71170(BigDecimal.ZERO); // @rpg-trace: n1109
        newClaim.setG71180(BigDecimal.ZERO); // @rpg-trace: n1109
        newClaim.setG71190(""); // @rpg-trace: n1109
        newClaim.setG71200(""); // @rpg-trace: n1109

        claimRepository.save(newClaim); // @rpg-trace: n1112

        createClaimReleaseRequest(kzl, rechNr, repDate, fgnr, invoice); // @rpg-trace: n1706
    }

    private List<Claim> loadClaims(String kzl, String datauf, String sortDirection) {
        if ("DESC".equalsIgnoreCase(sortDirection)) {
            return claimRepository.findByKzlAndDateBefore(kzl, datauf); // @rpg-trace: n433
        } else {
            return claimRepository.findByKzlAndDateAfter(kzl, datauf); // @rpg-trace: n429
        }
    }

    private String calculateRepDate(String baseDate, int days) {
        if (baseDate == null || baseDate.isBlank() || days <= 0) return ""; // @rpg-trace: n440
        try {
            LocalDate date = LocalDate.parse(baseDate, DATE_FORMAT); // @rpg-trace: n441
            LocalDate repDate = date.minusDays(days); // @rpg-trace: n442
            return repDate.format(DATE_FORMAT); // @rpg-trace: n443
        } catch (Exception e) {
            return ""; // @rpg-trace: n440
        }
    }

    private boolean passesDateFilter(Claim claim, String dateRep, int days) {
        if (days <= 0 || dateRep.isBlank()) return true; // @rpg-trace: n439
        String claimDate = claim.getG71050() != null ? claim.getG71050().trim() : ""; // @rpg-trace: n439
        return claimDate.compareTo(dateRep) >= 0; // @rpg-trace: n442
    }

    private boolean applyFilterArt(Claim claim, String filterArt) {
        return true; // @rpg-trace: n448
    }

    private boolean checkOpenErrors(Claim claim, String kzl) {
        List<ClaimError> errors = claimErrorRepository.findByKeyG73(
            kzl, claim.getG71010(), claim.getG71020(), claim.getG71030(),
            claim.getG71040(), claim.getG71050()); // @rpg-trace: n452
        return errors.stream()
            .anyMatch(e -> e.getG73290() != null && e.getG73290().intValue() > 0); // @rpg-trace: n463
    }

    private String determineStatusText(Claim claim) {
        String g71120 = claim.getG71120() != null ? claim.getG71120().trim() : ""; // @rpg-trace: n476
        switch (g71120) {
            case "1": return "Offen"; // @rpg-trace: n479
            case "2": return "Gesendet"; // @rpg-trace: n481
            default: return "Neu"; // @rpg-trace: n483
        }
    }

    private boolean passesStatusFilter(Claim claim, String statusFilter, boolean active) {
        if (!active || statusFilter == null || statusFilter.isBlank()) return true; // @rpg-trace: n471
        String claimStatus = claim.getG71120() != null ? claim.getG71120().trim() : ""; // @rpg-trace: n490
        return claimStatus.equals(statusFilter.trim()); // @rpg-trace: n491
    }

    private boolean passesCompanyFilter(Claim claim, String filpkz, boolean active) {
        if (!active || filpkz == null || filpkz.isBlank()) return true; // @rpg-trace: n471
        return true; // @rpg-trace: n504
    }

    private boolean applySearchFilter(Claim claim, String searchFilter, String kzl) {
        String sub050 = claim.getG71050() != null ? claim.getG71050().trim() : ""; // @rpg-trace: n501
        String sub020 = claim.getG71070() != null ? claim.getG71070().trim() : ""; // @rpg-trace: n501
        String sub060 = claim.getG71060() != null ? claim.getG71060().trim() : ""; // @rpg-trace: n501
        String combined = sub050 + sub020 + sub060; // @rpg-trace: n501
        return combined.contains(searchFilter) ||
               (claim.getG71010() != null && claim.getG71010().contains(searchFilter)) ||
               (claim.getG71150() != null && claim.getG71150().contains(searchFilter)); // @rpg-trace: n501
    }

    private String determineDmcCode(Claim claim, String kzl) {
        List<ClaimError> errors = claimErrorRepository.findByKeyG73(
            kzl, claim.getG71010(), claim.getG71020(), claim.getG71030(),
            claim.getG71040(), claim.getG71050()); // @rpg-trace: n1732
        if (!errors.isEmpty()) {
            ClaimError first = errors.get(0); // @rpg-trace: n1733
            return first.getG73140() != null ? first.getG73140().trim() : ""; // @rpg-trace: n1736
        }
        return ""; // @rpg-trace: n1731
    }

    private int countErrors(Claim claim, String kzl) {
        boolean found = false; // @rpg-trace: n1751
        List<ClaimError> errors = claimErrorRepository.findByKeyG73(
            kzl, claim.getG71010(), claim.getG71020(), claim.getG71030(),
            claim.getG71040(), claim.getG71050()); // @rpg-trace: n1753
        int count = 0; // @rpg-trace: n1745
        for (ClaimError error : errors) {
            BigDecimal g73290 = error.getG73290(); // @rpg-trace: n1748
            if (g73290 != null && g73290.intValue() > 0) {
                count++; // @rpg-trace: n1748
                found = true; // @rpg-trace: n1754
            }
        }
        return count; // @rpg-trace: n1770
    }

    private String determineColor(Claim claim, boolean hasOpenErrors) {
        if (hasOpenErrors) return "RED"; // @rpg-trace: n473
        String status = claim.getG71120() != null ? claim.getG71120().trim() : ""; // @rpg-trace: n473
        switch (status) {
            case "2": return "BLU"; // @rpg-trace: n473
            case "1": return "GRN"; // @rpg-trace: n473
            default: return "WHT"; // @rpg-trace: n473
        }
    }

    private void processEditClaim(Claim claim, String kzl, String rechNr, String rechDatum,
                                  String claimNr, String art, String splitt, String neu4, String neuwt) {
        Optional<Invoice> invoiceOpt = invoiceRepository.findByAhk000AndAhk040AndAhk050AndAhk060AndAhk070AndAhk080(
            kzl, rechNr, art, neuwt, splitt, claim.getG71050()); // @rpg-trace: n747
        if (invoiceOpt.isPresent()) {
            Invoice invoice = invoiceOpt.get(); // @rpg-trace: n747
            claim.setG71150(invoice.getAhk250() != null ? invoice.getAhk250().substring(0, Math.min(30, invoice.getAhk250().length())) : ""); // @rpg-trace: n747
            claimRepository.save(claim); // @rpg-trace: n1110
        }
    }

    private void processDeleteClaim(Claim claim, String kzl, String rechNr, String rechDatum,
                                    String claimNr, String art) {
        List<ClaimError> errors = claimErrorRepository.findByKeyG73(
            kzl, rechNr, rechDatum, claimNr, art, claim.getG71050()); // @rpg-trace: n592
        for (ClaimError error : errors) {
            claimErrorRepository.delete(error); // @rpg-trace: n593
        }
        claimRepository.delete(claim); // @rpg-trace: n589
    }

    private void processViewClaim(Claim claim) {
        // View is read-only, no mutation needed // @rpg-trace: n720
    }

    private void processServiceCard(Claim claim, String kzl) {
        // Service card display logic // @rpg-trace: n720
    }

    private void processWarrantyInfo(Claim claim, String kzl, String fgnr17) {
        // Warranty info display logic // @rpg-trace: n720
    }

    private void processSendClaim(Claim claim, String kzl, String rechNr, String rechDatum,
                                  String claimNr, String art, String splitt, String neu4,
                                  String neuwt, String fgnr17) {
        claim.setG71120("2"); // @rpg-trace: n1671
        claimRepository.save(claim); // @rpg-trace: n1671

        List<ClaimError> errors = claimErrorRepository.findByKeyG73(
            kzl, rechNr, rechDatum, claimNr, art, claim.getG71050()); // @rpg-trace: n681
        for (ClaimError error : errors) {
            if (error.getG73290() != null && error.getG73290().intValue() > 0) {
                error.setG73290(BigDecimal.ZERO); // @rpg-trace: n686
                claimErrorRepository.save(error); // @rpg-trace: n686
            }
        }
    }

    private Invoice findInvoiceForClaim(String kzl, String rechNr, String art, String neuwt,
                                        String splitt, String datauf) {
        List<Invoice> invoices = invoiceRepository.findByKeyAhk(kzl, rechNr, art, neuwt, splitt, datauf); // @rpg-trace: n974
        return invoices.isEmpty() ? null : invoices.get(0); // @rpg-trace: n975
    }

    private void createClaimReleaseRequest(String kzl, String rechNr, String repDate,
                                           String fgnr, Invoice invoice) {
        Optional<ClaimReleaseRequest> existing = claimReleaseRequestRepository
            .findByG70KzlAndG70RnrAndG70Rdat(kzl, rechNr, repDate); // @rpg-trace: n1707

        if (existing.isEmpty()) {
            ClaimReleaseRequest g70 = new ClaimReleaseRequest(); // @rpg-trace: n1711
            g70.setG70Kzl(kzl); // @rpg-trace: n1711
            g70.setG70Rnr(rechNr); // @rpg-trace: n1712
            g70.setG70Rdat(repDate); // @rpg-trace: n1713
            g70.setG70Fgnr(fgnr != null ? fgnr : ""); // @rpg-trace: n1714
            g70.setG70Dat(LocalDate.now().format(DATE_FORMAT)); // @rpg-trace: n1715
            g70.setG70Status(""); // @rpg-trace: n1722
            g70.setG70Cusno(BigDecimal.ZERO); // @rpg-trace: n1717
            g70.setG70Clmno(BigDecimal.ZERO); // @rpg-trace: n1717
            g70.setG70Clmfl(""); // @rpg-trace: n1717
            claimReleaseRequestRepository.save(g70); // @rpg-trace: n1723
        }
    }

    private String buildFilterDescription(ClaimSearchRequestDto request) {
        StringBuilder sb = new StringBuilder(); // @rpg-trace: n1435
        if (request.status() != null && !request.status().isBlank()) {
            sb.append("Status: ").append(request.status()).append(" "); // @rpg-trace: n1453
        }
        if (request.filpkz() != null && !request.filpkz().isBlank()) {
            sb.append("PKZ: ").append(request.filpkz()).append(" "); // @rpg-trace: n1469
        }
        if (request.filter() != null && !request.filter().isBlank()) {
            sb.append("Filter: ").append(request.filter()); // @rpg-trace: n1476
        }
        return sb.toString().trim(); // @rpg-trace: n1436
    }

    private String buildSortDescription(String sortField, String sortDirection) {
        String field = sortField != null ? sortField : "Datum"; // @rpg-trace: n1409
        String dir = "DESC".equalsIgnoreCase(sortDirection) ? "Ab" : "Auf"; // @rpg-trace: n1421
        return field + " " + dir; // @rpg-trace: n1409
    }
}