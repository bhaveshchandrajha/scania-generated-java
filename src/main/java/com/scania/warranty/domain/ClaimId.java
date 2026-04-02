/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import java.io.Serializable;
import java.util.Objects;

public class ClaimId implements Serializable {
    private String g71000;
    private String g71050;
    private String g71060;

    public ClaimId() {}

    public ClaimId(String g71000, String g71050, String g71060) {
        this.g71000 = g71000;
        this.g71050 = g71050;
        this.g71060 = g71060;
    }

    public String getG71000() { return g71000; }
    public void setG71000(String v) { this.g71000 = v; }
    public String getG71050() { return g71050; }
    public void setG71050(String v) { this.g71050 = v; }
    public String getG71060() { return g71060; }
    public void setG71060(String v) { this.g71060 = v; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClaimId that = (ClaimId) o;
        return Objects.equals(g71000, that.g71000) && Objects.equals(g71050, that.g71050) &&
               Objects.equals(g71060, that.g71060);
    }

    @Override
    public int hashCode() {
        return Objects.hash(g71000, g71050, g71060);
    }
}