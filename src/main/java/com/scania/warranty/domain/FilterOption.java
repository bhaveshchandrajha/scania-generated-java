/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

public enum FilterOption {
    NONE(""),
    BY_STATUS("S"),
    BY_DEALER("D"),
    BY_VEHICLE("V"),
    BY_CLAIM("C");

    private final String code;

    FilterOption(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static FilterOption fromCode(String code) {
        if (code == null) return NONE;
        for (FilterOption f : values()) {
            if (f.code.equals(code.trim())) return f;
        }
        return NONE;
    }
}