/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import java.io.Serializable;
import java.util.Objects;

public class InvoiceId implements Serializable {
    private String ahk000;
    private String ahk040;
    private String ahk050;
    private String ahk060;
    private String ahk070;
    private String ahk080;

    public InvoiceId() {}

    public InvoiceId(String ahk000, String ahk040, String ahk050, String ahk060, String ahk070, String ahk080) {
        this.ahk000 = ahk000;
        this.ahk040 = ahk040;
        this.ahk050 = ahk050;
        this.ahk060 = ahk060;
        this.ahk070 = ahk070;
        this.ahk080 = ahk080;
    }

    public String getAhk000() { return ahk000; }
    public void setAhk000(String v) { this.ahk000 = v; }
    public String getAhk040() { return ahk040; }
    public void setAhk040(String v) { this.ahk040 = v; }
    public String getAhk050() { return ahk050; }
    public void setAhk050(String v) { this.ahk050 = v; }
    public String getAhk060() { return ahk060; }
    public void setAhk060(String v) { this.ahk060 = v; }
    public String getAhk070() { return ahk070; }
    public void setAhk070(String v) { this.ahk070 = v; }
    public String getAhk080() { return ahk080; }
    public void setAhk080(String v) { this.ahk080 = v; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceId that = (InvoiceId) o;
        return Objects.equals(ahk000, that.ahk000) && Objects.equals(ahk040, that.ahk040) &&
               Objects.equals(ahk050, that.ahk050) && Objects.equals(ahk060, that.ahk060) &&
               Objects.equals(ahk070, that.ahk070) && Objects.equals(ahk080, that.ahk080);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ahk000, ahk040, ahk050, ahk060, ahk070, ahk080);
    }
}