/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1919}.
 */

package com.scania.warranty.domain;

public record ClaimCheckError(
    int counter,
    String errorText
) {} // @rpg-trace: n1922