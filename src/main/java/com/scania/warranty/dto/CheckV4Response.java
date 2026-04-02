/**
 * Data transfer object for API or display.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1983}.
 */

package com.scania.warranty.dto;

import com.scania.warranty.domain.CheckV4Result;

public record CheckV4Response(
    CheckV4Result result,
    boolean extendedPartAgreementFound
) {}