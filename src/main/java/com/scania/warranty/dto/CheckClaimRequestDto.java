/**
 * Data transfer object for API or display.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1919}.
 */

package com.scania.warranty.dto;

public record CheckClaimRequestDto(
    String g73000,    // company code
    String g73050,    // claim identifier
    String g73060,    // claim type
    String g73280,    // validation field 1
    String g73360,    // validation field 2 (error category)
    String g73370,    // validation field 3
    String g73380,    // validation field 4
    String g73390,    // validation field 5
    String g73400,    // validation field 6
    String g73410,    // validation field 7
    String g73070     // validation field 8
) {} // @rpg-trace: n1919