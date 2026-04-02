/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class LaborId implements Serializable {
    private String ahw000;
    private String ahw010;
    private String ahw020;
    private String ahw030;
    private String ahw040;
    private String ahw050;
    private String ahw060;
    private String ahw070;
    private String ahw080;
    private BigDecimal ahw085;
    private String ahw090;
    private BigDecimal ahw093;
    private BigDecimal ahw095;
    private String ahw100;
    private String ahw110;

    public LaborId() {}

    public String getAhw000() { return ahw000; }
    public void setAhw000(String v) { this.ahw000 = v; }
    public String getAhw010() { return ahw010; }
    public void setAhw010(String v) { this.ahw010 = v; }
    public String getAhw020() { return ahw020; }
    public void setAhw020(String v) { this.ahw020 = v; }
    public String getAhw030() { return ahw030; }
    public void setAhw030(String v) { this.ahw030 = v; }
    public String getAhw040() { return ahw040; }
    public void setAhw040(String v) { this.ahw040 = v; }
    public String getAhw050() { return ahw050; }
    public void setAhw050(String v) { this.ahw050 = v; }
    public String getAhw060() { return ahw060; }
    public void setAhw060(String v) { this.ahw060 = v; }
    public String getAhw070() { return ahw070; }
    public void setAhw070(String v) { this.ahw070 = v; }
    public String getAhw080() { return ahw080; }
    public void setAhw080(String v) { this.ahw080 = v; }
    public BigDecimal getAhw085() { return ahw085; }
    public void setAhw085(BigDecimal v) { this.ahw085 = v; }
    public String getAhw090() { return ahw090; }
    public void setAhw090(String v) { this.ahw090 = v; }
    public BigDecimal getAhw093() { return ahw093; }
    public void setAhw093(BigDecimal v) { this.ahw093 = v; }
    public BigDecimal getAhw095() { return ahw095; }
    public void setAhw095(BigDecimal v) { this.ahw095 = v; }
    public String getAhw100() { return ahw100; }
    public void setAhw100(String v) { this.ahw100 = v; }
    public String getAhw110() { return ahw110; }
    public void setAhw110(String v) { this.ahw110 = v; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaborId that = (LaborId) o;
        return Objects.equals(ahw000, that.ahw000) && Objects.equals(ahw010, that.ahw010) &&
               Objects.equals(ahw020, that.ahw020) && Objects.equals(ahw030, that.ahw030) &&
               Objects.equals(ahw040, that.ahw040) && Objects.equals(ahw050, that.ahw050) &&
               Objects.equals(ahw060, that.ahw060) && Objects.equals(ahw070, that.ahw070) &&
               Objects.equals(ahw080, that.ahw080) && Objects.equals(ahw085, that.ahw085) &&
               Objects.equals(ahw090, that.ahw090) && Objects.equals(ahw093, that.ahw093) &&
               Objects.equals(ahw095, that.ahw095) && Objects.equals(ahw100, that.ahw100) &&
               Objects.equals(ahw110, that.ahw110);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ahw000, ahw010, ahw020, ahw030, ahw040, ahw050, ahw060, ahw070,
                           ahw080, ahw085, ahw090, ahw093, ahw095, ahw100, ahw110);
    }
}