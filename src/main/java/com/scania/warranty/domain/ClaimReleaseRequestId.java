/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import java.io.Serializable;
import java.util.Objects;

public class ClaimReleaseRequestId implements Serializable {
    private String g70Kzl;
    private String g70Rnr;
    private String g70Rdat;

    public ClaimReleaseRequestId() {}

    public ClaimReleaseRequestId(String g70Kzl, String g70Rnr, String g70Rdat) {
        this.g70Kzl = g70Kzl;
        this.g70Rnr = g70Rnr;
        this.g70Rdat = g70Rdat;
    }

    public String getG70Kzl() { return g70Kzl; }
    public void setG70Kzl(String v) { this.g70Kzl = v; }
    public String getG70Rnr() { return g70Rnr; }
    public void setG70Rnr(String v) { this.g70Rnr = v; }
    public String getG70Rdat() { return g70Rdat; }
    public void setG70Rdat(String v) { this.g70Rdat = v; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClaimReleaseRequestId that = (ClaimReleaseRequestId) o;
        return Objects.equals(g70Kzl, that.g70Kzl) && Objects.equals(g70Rnr, that.g70Rnr) &&
               Objects.equals(g70Rdat, that.g70Rdat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(g70Kzl, g70Rnr, g70Rdat);
    }
}