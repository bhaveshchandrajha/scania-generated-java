/**
 * Data transfer object for API or display.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.dto;

public record ClaimSearchRequestDto(
    String kzl,
    String branch,
    String comp,
    String vBranch,
    String date,
    int days,
    String filter,
    String filterArt,
    String status,
    String filpkz,
    String splitt,
    String art,
    String neuwt,
    String neu4,
    String fgnr,
    String fgnr17,
    String claimNr,
    String datauf,
    String lista,
    String listb,
    String anzdru,
    String parm5,
    String sortField,
    String sortDirection,
    int pageSize,
    int pageNumber
) {} // @rpg-trace: n404