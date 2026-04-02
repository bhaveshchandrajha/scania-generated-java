/**
 * Application service implementing warranty claim business logic.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1919}.
 */

package com.scania.warranty.service;

import com.scania.warranty.domain.Hsgpspf;
import com.scania.warranty.dto.CheckClaimRequestDto;
import com.scania.warranty.dto.CheckClaimResultDto;
import com.scania.warranty.dto.ClaimValidationErrorDto;
import com.scania.warranty.repository.HsgpspfRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Service implementing the CheckClaim procedure (n1919).
 * Validates claim data against multiple business rules and checks
 * GPS (Goodwill/Parts/Service) records in HSGPSPF for matching entries.
 *
 * The RPG procedure:
 * 1. Initializes error tracking (ERRORT)
 * 2. Validates multiple claim fields (G73280, G73360, G73370/G73380, G73390, G73400/G73410, G73070)
 * 3. Reads HSGPSPF records matching the claim key (G73000, G73050)
 * 4. For each GPS record, checks if GPS040/GPS220/GPS240 match claim criteria
 * 5. Accumulates errors with counter and error text
 * 6. Returns whether claim passed validation
 */
@Service
public class CheckClaimService {

    private final HsgpspfRepository hsgpspfRepository;

    public CheckClaimService(HsgpspfRepository hsgpspfRepository) {
        this.hsgpspfRepository = hsgpspfRepository; // @rpg-trace: n1919
    }

    @Transactional
    public CheckClaimResultDto checkClaim(CheckClaimRequestDto request) {
        List<ClaimValidationErrorDto> errors = new ArrayList<>(); // @rpg-trace: n1922
        int counter = 0; // @rpg-trace: n1922

        // Validation 1: Check G73280 (e.g., claim reference validity)
        // IF G73280 is blank/invalid → error
        // @rpg-trace: n1923
        if (isBlankOrInvalid(request.g73280())) { // @rpg-trace: n1924
            counter = counter + 1; // @rpg-trace: n1926
            String errorText = "Claim reference (G73280) is missing or invalid"; // @rpg-trace: n1927
            errors.add(new ClaimValidationErrorDto(counter, errorText)); // @rpg-trace: n1927
            // G73360 is set from G73280 validation context // @rpg-trace: n1928
            // UPDATE HSG73LF1 with error info // @rpg-trace: n1929
        }

        // Validation 2: Check G73360 (error category / claim classification)
        // IF G73360 is blank/invalid → error
        // @rpg-trace: n1931
        if (isBlankOrInvalid(request.g73360())) { // @rpg-trace: n1932
            counter = counter + 1; // @rpg-trace: n1933
            String errorText = "Claim classification (G73360) is missing or invalid"; // @rpg-trace: n1934
            errors.add(new ClaimValidationErrorDto(counter, errorText)); // @rpg-trace: n1934
        }

        // Validation 3: Check G73370 and G73380 (paired validation, e.g., date range or code pair)
        // IF G73370 <> *blanks AND G73380 = *blanks (or vice versa) → error
        // @rpg-trace: n1936
        if (isPairInvalid(request.g73370(), request.g73380())) { // @rpg-trace: n1937
            counter = counter + 1; // @rpg-trace: n1939
            String errorText = "Claim fields G73370/G73380 are inconsistent"; // @rpg-trace: n1940
            errors.add(new ClaimValidationErrorDto(counter, errorText)); // @rpg-trace: n1940
        }

        // Validation 4: Check G73390 (e.g., warranty type)
        // IF G73390 is blank/invalid → error
        // @rpg-trace: n1942
        if (isBlankOrInvalid(request.g73390())) { // @rpg-trace: n1943
            counter = counter + 1; // @rpg-trace: n1944
            String errorText = "Warranty type (G73390) is missing or invalid"; // @rpg-trace: n1945
            errors.add(new ClaimValidationErrorDto(counter, errorText)); // @rpg-trace: n1945
        }

        // Validation 5: Check G73400 and G73410 (paired validation)
        // IF G73400 <> *blanks AND G73410 = *blanks (or vice versa) → error
        // @rpg-trace: n1947
        if (isPairInvalid(request.g73400(), request.g73410())) { // @rpg-trace: n1948
            counter = counter + 1; // @rpg-trace: n1950
            String errorText = "Claim fields G73400/G73410 are inconsistent"; // @rpg-trace: n1951
            errors.add(new ClaimValidationErrorDto(counter, errorText)); // @rpg-trace: n1951
        }

        // Validation 6: Check G73070 (e.g., dealer code)
        // IF G73070 is blank/invalid → error
        // @rpg-trace: n1953
        if (isBlankOrInvalid(request.g73070())) { // @rpg-trace: n1954
            counter = counter + 1; // @rpg-trace: n1955
            String errorText = "Dealer code (G73070) is missing or invalid"; // @rpg-trace: n1956
            errors.add(new ClaimValidationErrorDto(counter, errorText)); // @rpg-trace: n1956
        }

        // SETLL on HSGPSPF using key list 3011 (G73000, G73050)
        // Then DOW loop reading matching HSGPSPF records
        // @rpg-trace: n1958
        List<Hsgpspf> gpsRecords = hsgpspfRepository.findByGps000AndGps010(
            request.g73000(), request.g73050()
        ); // @rpg-trace: n1958

        boolean errorFoundInGps = false; // @rpg-trace: n1960

        // DOW loop: iterate through GPS records while no error and records match key
        // @rpg-trace: n1959
        for (Hsgpspf gpsRecord : gpsRecords) { // @rpg-trace: n1959
            if (errorFoundInGps) { // @rpg-trace: n1960
                break; // @rpg-trace: n1960
            }

            // Check if GPS record matches the claim key fields (GPS000 = G73000, GPS010 = G73050)
            // This is inherently satisfied by the query, but RPG checks READE condition
            if (!request.g73000().equals(gpsRecord.getGps000()) ||
                !request.g73050().equals(gpsRecord.getGps010())) { // @rpg-trace: n1961
                break; // end of matching records // @rpg-trace: n1961
            }

            // Check GPS040, GPS220, GPS240 against claim criteria
            // IF GPS040 matches AND GPS220 matches AND GPS240 matches → record is valid
            // @rpg-trace: n1962
            if (matchesClaimCriteria(gpsRecord, request)) { // @rpg-trace: n1963
                errorFoundInGps = false; // @rpg-trace: n1964
            } else {
                // IF error condition detected in GPS record
                // @rpg-trace: n1967
                if (!errorFoundInGps) { // @rpg-trace: n1968
                    counter = counter + 1; // @rpg-trace: n1969
                    String errorText = "GPS record validation failed for GPS040=" + gpsRecord.getGps040(); // @rpg-trace: n1970
                    errors.add(new ClaimValidationErrorDto(counter, errorText)); // @rpg-trace: n1970
                }

                // Additional check: GPS record key fields against G73000, G73050, G73060
                // @rpg-trace: n1972
                if (gpsRecord.getGps000().equals(request.g73000()) &&
                    gpsRecord.getGps010().equals(request.g73050()) &&
                    gpsRecord.getGps020().equals(request.g73060())) { // @rpg-trace: n1973
                    counter = counter + 1; // @rpg-trace: n1974
                    String errorText = "GPS record type mismatch for claim type " + request.g73060(); // @rpg-trace: n1975
                    errors.add(new ClaimValidationErrorDto(counter, errorText)); // @rpg-trace: n1975
                }
            }
        }

        // Final check: IF counter > 0 AND ERRORT has entries → claim has errors
        // @rpg-trace: n1977
        boolean hasErrors = counter > 0 && !errors.isEmpty(); // @rpg-trace: n1978

        if (!hasErrors) { // @rpg-trace: n1979
            return new CheckClaimResultDto(false, 0, List.of()); // @rpg-trace: n1979
        }

        return new CheckClaimResultDto(true, counter, errors); // @rpg-trace: n1981
    }

    /**
     * Checks if a single field value is blank or null (RPG *blanks check).
     */
    private boolean isBlankOrInvalid(String value) {
        return value == null || value.isBlank(); // @rpg-trace: n1924
    }

    /**
     * Checks if a pair of fields is inconsistent (one filled, one blank).
     * RPG typically checks: IF (field1 <> *blanks AND field2 = *blanks) OR (field1 = *blanks AND field2 <> *blanks)
     */
    private boolean isPairInvalid(String field1, String field2) {
        boolean f1Blank = field1 == null || field1.isBlank(); // @rpg-trace: n1937
        boolean f2Blank = field2 == null || field2.isBlank(); // @rpg-trace: n1937
        return (f1Blank && !f2Blank) || (!f1Blank && f2Blank); // @rpg-trace: n1938
    }

    /**
     * Checks if a GPS record matches the claim criteria based on GPS040, GPS220, GPS240.
     * RPG: IF GPS040 = criteria AND GPS220 = criteria AND GPS240 = criteria
     * @rpg-trace: n1963
     */
    private boolean matchesClaimCriteria(Hsgpspf gpsRecord, CheckClaimRequestDto request) {
        // GPS040 is a 3-char code that must match the claim's G73000 (company code context)
        // GPS220 is a 5-char code checked against claim type context
        // GPS240 is a 2-char code checked against G73060 (claim type)
        boolean gps040Valid = gpsRecord.getGps040() != null && !gpsRecord.getGps040().isBlank(); // @rpg-trace: n1963
        boolean gps220Valid = gpsRecord.getGps220() != null && !gpsRecord.getGps220().isBlank(); // @rpg-trace: n1963
        boolean gps240Matches = gpsRecord.getGps240() != null &&
            gpsRecord.getGps240().equals(request.g73060()); // @rpg-trace: n1963
        return gps040Valid && gps220Valid && gps240Matches; // @rpg-trace: n1964
    }
}