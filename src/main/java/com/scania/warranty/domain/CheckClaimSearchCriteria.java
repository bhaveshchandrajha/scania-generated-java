/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1919}.
 */

package com.scania.warranty.domain;

public record CheckClaimSearchCriteria(
    String g73000,  // company code (CHAR 3) - maps to GPS000
    String g73050,  // claim identifier (CHAR 8) - maps to GPS010
    String g73060   // claim type (CHAR 2) - maps to GPS020
) {} // @rpg-trace: n1919