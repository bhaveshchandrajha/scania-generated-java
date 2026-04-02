/**
 * REST controller for warranty claim APIs.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1919}.
 */

package com.scania.warranty.web;

import com.scania.warranty.dto.CheckClaimRequestDto;
import com.scania.warranty.dto.CheckClaimResultDto;
import com.scania.warranty.service.CheckClaimService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/claims")
public class CheckClaimController {

    private final CheckClaimService checkClaimService;

    public CheckClaimController(CheckClaimService checkClaimService) {
        this.checkClaimService = checkClaimService; // @rpg-trace: n1919
    }

    @PostMapping("/check")
    public ResponseEntity<CheckClaimResultDto> checkClaim(@RequestBody CheckClaimRequestDto request) {
        CheckClaimResultDto result = checkClaimService.checkClaim(request); // @rpg-trace: n1919
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result); // @rpg-trace: n1981
        }
        return ResponseEntity.ok(result); // @rpg-trace: n1979
    }
}