/**
 * Data transfer object for API or display.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.dto;

import java.math.BigDecimal;

public record ClaimListItemDto(
    String kzl,
    String rechNr,
    String rechDatum,
    String claimNr,
    String art,
    String datauf,
    String claimCode,
    String claimDescription,
    String status,
    String dmcCode,
    int errorCount,
    String color,
    BigDecimal claimNumber,
    String fgnr
) {} // @rpg-trace: n471