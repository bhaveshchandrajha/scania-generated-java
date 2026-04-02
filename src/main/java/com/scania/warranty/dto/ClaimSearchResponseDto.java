/**
 * Data transfer object for API or display.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.dto;

import java.util.List;

public record ClaimSearchResponseDto(
    List<ClaimListItemDto> claims,
    int totalCount,
    int pageNumber,
    int pageSize,
    String filterDescription,
    String sortDescription,
    String statusText,
    String operationText
) {} // @rpg-trace: n436