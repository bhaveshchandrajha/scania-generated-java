/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

public enum SortDirection {
    ASCENDING("Auf"),
    DESCENDING("Ab");

    private final String label;

    SortDirection(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}