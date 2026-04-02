/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

public enum ClaimStatus {
    PENDING("00"),
    MINIMUM("05"),
    REJECTED("11"),
    APPROVED("20"),
    EXCLUDED("99");

    private final String code;

    ClaimStatus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static ClaimStatus fromCode(String code) {
        if (code == null) return PENDING;
        for (ClaimStatus s : values()) {
            if (s.code.equals(code.trim())) return s;
        }
        return PENDING;
    }
}