/**
 * REST controller for warranty claim APIs.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.web;

import com.scania.warranty.dto.*;
import com.scania.warranty.service.ClaimSearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claims")
public class ClaimSearchController {

    private final ClaimSearchService claimSearchService;

    public ClaimSearchController(ClaimSearchService claimSearchService) {
        this.claimSearchService = claimSearchService; // @rpg-trace: n404
    }

    @PostMapping("/search-from-request")
    public ResponseEntity<ClaimSearchResponseDto> searchClaims(@RequestBody ClaimSearchRequestDto request) {
        ClaimSearchResponseDto response = claimSearchService.searchClaims(request); // @rpg-trace: n436
        return ResponseEntity.ok(response); // @rpg-trace: n436
    }

    @PostMapping("/action")
    public ResponseEntity<Void> processAction(
            @RequestParam String kzl,
            @RequestParam String datauf,
            @RequestParam String claimCode,
            @RequestParam int action,
            @RequestParam(defaultValue = "") String rechNr,
            @RequestParam(defaultValue = "") String rechDatum,
            @RequestParam(defaultValue = "") String claimNr,
            @RequestParam(defaultValue = "") String art,
            @RequestParam(defaultValue = "") String splitt,
            @RequestParam(defaultValue = "") String neu4,
            @RequestParam(defaultValue = "") String neuwt,
            @RequestParam(defaultValue = "") String fgnr17) {
        claimSearchService.processClaimAction(kzl, datauf, claimCode, action,
            rechNr, rechDatum, claimNr, art, splitt, neu4, neuwt, fgnr17); // @rpg-trace: n720
        return ResponseEntity.ok().build(); // @rpg-trace: n720
    }

    @PostMapping("/create-new")
    public ResponseEntity<Void> createNewClaim(
            @RequestParam String kzl,
            @RequestParam String rechNr,
            @RequestParam String rechDatum,
            @RequestParam String claimNr,
            @RequestParam String art,
            @RequestParam(defaultValue = "") String splitt,
            @RequestParam(defaultValue = "") String neu4,
            @RequestParam(defaultValue = "") String neuwt,
            @RequestParam(defaultValue = "") String datauf,
            @RequestParam(defaultValue = "") String fgnr) {
        claimSearchService.createNewClaim(kzl, rechNr, rechDatum, claimNr, art,
            splitt, neu4, neuwt, datauf, fgnr); // @rpg-trace: n836
        return ResponseEntity.ok().build(); // @rpg-trace: n836
    }
}