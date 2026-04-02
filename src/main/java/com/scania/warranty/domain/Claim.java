/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "HSG71LF2")
@IdClass(ClaimId.class)
public class Claim {

    @Id
    @Column(name = "G71000", length = 3, nullable = false)
    private String g71000; // @rpg-trace: schema

    @Column(name = "G71010", length = 5, nullable = false)
    private String g71010; // @rpg-trace: schema

    @Column(name = "G71020", length = 8, nullable = false)
    private String g71020; // @rpg-trace: schema

    @Column(name = "G71030", length = 5, nullable = false)
    private String g71030; // @rpg-trace: schema

    @Column(name = "G71040", length = 1, nullable = false)
    private String g71040; // @rpg-trace: schema

    @Id
    @Column(name = "G71050", length = 8, nullable = false)
    private String g71050; // @rpg-trace: schema

    @Id
    @Column(name = "G71060", length = 7, nullable = false)
    private String g71060; // @rpg-trace: schema

    @Column(name = "G71070", length = 10, nullable = false)
    private String g71070; // @rpg-trace: schema

    @Column(name = "G71080", precision = 8, scale = 0, nullable = false)
    private BigDecimal g71080; // @rpg-trace: schema

    @Column(name = "G71090", precision = 8, scale = 0, nullable = false)
    private BigDecimal g71090; // @rpg-trace: schema

    @Column(name = "G71100", precision = 3, scale = 0, nullable = false)
    private BigDecimal g71100; // @rpg-trace: schema

    @Column(name = "G71110", precision = 1, scale = 0, nullable = false)
    private BigDecimal g71110; // @rpg-trace: schema

    @Column(name = "G71120", length = 1, nullable = false)
    private String g71120; // @rpg-trace: schema

    @Column(name = "G71130", length = 1, nullable = false)
    private String g71130; // @rpg-trace: schema

    @Column(name = "G71140", length = 6, nullable = false)
    private String g71140; // @rpg-trace: schema

    @Column(name = "G71150", length = 30, nullable = false)
    private String g71150; // @rpg-trace: schema

    @Column(name = "G71160", length = 8, nullable = false)
    private String g71160; // @rpg-trace: schema

    @Column(name = "G71170", precision = 2, scale = 0, nullable = false)
    private BigDecimal g71170; // @rpg-trace: schema

    @Column(name = "G71180", precision = 2, scale = 0, nullable = false)
    private BigDecimal g71180; // @rpg-trace: schema

    @Column(name = "G71190", length = 1, nullable = false)
    private String g71190; // @rpg-trace: schema

    @Column(name = "G71200", length = 10, nullable = false)
    private String g71200; // @rpg-trace: schema

    public Claim() {}

    public String getG71000() { return g71000; }
    public void setG71000(String v) { this.g71000 = v; }
    public String getG71010() { return g71010; }
    public void setG71010(String v) { this.g71010 = v; }
    public String getG71020() { return g71020; }
    public void setG71020(String v) { this.g71020 = v; }
    public String getG71030() { return g71030; }
    public void setG71030(String v) { this.g71030 = v; }
    public String getG71040() { return g71040; }
    public void setG71040(String v) { this.g71040 = v; }
    public String getG71050() { return g71050; }
    public void setG71050(String v) { this.g71050 = v; }
    public String getG71060() { return g71060; }
    public void setG71060(String v) { this.g71060 = v; }
    public String getG71070() { return g71070; }
    public void setG71070(String v) { this.g71070 = v; }
    public BigDecimal getG71080() { return g71080; }
    public void setG71080(BigDecimal v) { this.g71080 = v; }
    public BigDecimal getG71090() { return g71090; }
    public void setG71090(BigDecimal v) { this.g71090 = v; }
    public BigDecimal getG71100() { return g71100; }
    public void setG71100(BigDecimal v) { this.g71100 = v; }
    public BigDecimal getG71110() { return g71110; }
    public void setG71110(BigDecimal v) { this.g71110 = v; }
    public String getG71120() { return g71120; }
    public void setG71120(String v) { this.g71120 = v; }
    public String getG71130() { return g71130; }
    public void setG71130(String v) { this.g71130 = v; }
    public String getG71140() { return g71140; }
    public void setG71140(String v) { this.g71140 = v; }
    public String getG71150() { return g71150; }
    public void setG71150(String v) { this.g71150 = v; }
    public String getG71160() { return g71160; }
    public void setG71160(String v) { this.g71160 = v; }
    public BigDecimal getG71170() { return g71170; }
    public void setG71170(BigDecimal v) { this.g71170 = v; }
    public BigDecimal getG71180() { return g71180; }
    public void setG71180(BigDecimal v) { this.g71180 = v; }
    public String getG71190() { return g71190; }
    public void setG71190(String v) { this.g71190 = v; }
    public String getG71200() { return g71200; }
    public void setG71200(String v) { this.g71200 = v; }
}