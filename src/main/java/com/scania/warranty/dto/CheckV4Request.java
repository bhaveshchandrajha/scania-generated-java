/**
 * Data transfer object for API or display.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1983}.
 */

package com.scania.warranty.dto;

import java.time.LocalDate;

public record CheckV4Request(
    String hauptgruppe, // AHK040 - main group
    String nebengruppe, // AHK050 - sub group
    LocalDate referenceDate // date to check against EPA_DATV
) {}