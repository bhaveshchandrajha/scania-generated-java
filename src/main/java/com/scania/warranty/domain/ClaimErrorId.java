/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import java.io.Serializable;
import java.util.Objects;

public class ClaimErrorId implements Serializable {
    private String g73000;
    private String g73010;
    private String g73020;
    private String g73030;
    private String g73040;
    private String g73050;
    private String g73060;

    public ClaimErrorId() {}

    public ClaimErrorId(String g73000, String g73010, String g73020, String g73030,
                        String g73040, String g73050, String g73060) {
        this.g73000 = g73000;
        this.g73010 = g73010;
        this.g73020 = g73020;
        this.g73030 = g73030;
        this.g73040 = g73040;
        this.g73050 = g73050;
        this.g73060 = g73060;
    }

    public String getG73000() { return g73000; }
    public void setG73000(String v) { this.g73000 = v; }
    public String getG73010() { return g73010; }
    public void setG73010(String v) { this.g73010 = v; }
    public String getG73020() { return g73020; }
    public void setG73020(String v) { this.g73020 = v; }
    public String getG73030() { return g73030; }
    public void setG73030(String v) { this.g73030 = v; }
    public String getG73040() { return g73040; }
    public void setG73040(String v) { this.g73040 = v; }
    public String getG73050() { return g73050; }
    public void setG73050(String v) { this.g73050 = v; }
    public String getG73060() { return g73060; }
    public void setG73060(String v) { this.g73060 = v; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClaimErrorId that = (ClaimErrorId) o;
        return Objects.equals(g73000, that.g73000) && Objects.equals(g73010, that.g73010) &&
               Objects.equals(g73020, that.g73020) && Objects.equals(g73030, that.g73030) &&
               Objects.equals(g73040, that.g73040) && Objects.equals(g73050, that.g73050) &&
               Objects.equals(g73060, that.g73060);
    }

    @Override
    public int hashCode() {
        return Objects.hash(g73000, g73010, g73020, g73030, g73040, g73050, g73060);
    }
}