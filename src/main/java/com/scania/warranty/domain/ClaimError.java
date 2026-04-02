/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "HSG73PF")
@IdClass(ClaimErrorId.class)
public class ClaimError {

    @Id
    @Column(name = "G73000", length = 3, nullable = false)
    private String g73000; // @rpg-trace: schema

    @Id
    @Column(name = "G73010", length = 5, nullable = false)
    private String g73010; // @rpg-trace: schema

    @Id
    @Column(name = "G73020", length = 8, nullable = false)
    private String g73020; // @rpg-trace: schema

    @Id
    @Column(name = "G73030", length = 5, nullable = false)
    private String g73030; // @rpg-trace: schema

    @Id
    @Column(name = "G73040", length = 1, nullable = false)
    private String g73040; // @rpg-trace: schema

    @Id
    @Column(name = "G73050", length = 8, nullable = false)
    private String g73050; // @rpg-trace: schema

    @Id
    @Column(name = "G73060", length = 2, nullable = false)
    private String g73060; // @rpg-trace: schema

    @Column(name = "G73065", length = 2, nullable = false)
    private String g73065; // @rpg-trace: schema

    @Column(name = "G73070", length = 18, nullable = false)
    private String g73070; // @rpg-trace: schema

    @Column(name = "G73080", length = 2, nullable = false)
    private String g73080; // @rpg-trace: schema

    @Column(name = "G73090", length = 2, nullable = false)
    private String g73090; // @rpg-trace: schema

    @Column(name = "G73100", length = 2, nullable = false)
    private String g73100; // @rpg-trace: schema

    @Column(name = "G73110", length = 2, nullable = false)
    private String g73110; // @rpg-trace: schema

    @Column(name = "G73120", length = 65, nullable = false)
    private String g73120; // @rpg-trace: schema

    @Column(name = "G73130", length = 65, nullable = false)
    private String g73130; // @rpg-trace: schema

    @Column(name = "G73140", length = 2, nullable = false)
    private String g73140; // @rpg-trace: schema

    @Column(name = "G73150", length = 2, nullable = false)
    private String g73150; // @rpg-trace: schema

    @Column(name = "G73160", precision = 4, scale = 0, nullable = false)
    private BigDecimal g73160; // @rpg-trace: schema

    @Column(name = "G73170", precision = 8, scale = 0, nullable = false)
    private BigDecimal g73170; // @rpg-trace: schema

    @Column(name = "G73180", precision = 3, scale = 0, nullable = false)
    private BigDecimal g73180; // @rpg-trace: schema

    @Column(name = "G73190", precision = 3, scale = 0, nullable = false)
    private BigDecimal g73190; // @rpg-trace: schema

    @Column(name = "G73200", precision = 3, scale = 0, nullable = false)
    private BigDecimal g73200; // @rpg-trace: schema

    @Column(name = "G73210", precision = 11, scale = 2, nullable = false)
    private BigDecimal g73210; // @rpg-trace: schema

    @Column(name = "G73220", precision = 11, scale = 2, nullable = false)
    private BigDecimal g73220; // @rpg-trace: schema

    @Column(name = "G73230", precision = 11, scale = 2, nullable = false)
    private BigDecimal g73230; // @rpg-trace: schema

    @Column(name = "G73240", precision = 1, scale = 0, nullable = false)
    private BigDecimal g73240; // @rpg-trace: schema

    @Column(name = "G73250", precision = 8, scale = 0, nullable = false)
    private BigDecimal g73250; // @rpg-trace: schema

    @Column(name = "G73260", precision = 3, scale = 0, nullable = false)
    private BigDecimal g73260; // @rpg-trace: schema

    @Column(name = "G73270", precision = 6, scale = 0, nullable = false)
    private BigDecimal g73270; // @rpg-trace: schema

    @Column(name = "G73280", length = 8, nullable = false)
    private String g73280; // @rpg-trace: schema

    @Column(name = "G73285", length = 20, nullable = false)
    private String g73285; // @rpg-trace: schema

    @Column(name = "G73290", precision = 2, scale = 0, nullable = false)
    private BigDecimal g73290; // @rpg-trace: schema

    @Column(name = "G73300", precision = 2, scale = 0, nullable = false)
    private BigDecimal g73300; // @rpg-trace: schema

    @Column(name = "G73310", precision = 2, scale = 0, nullable = false)
    private BigDecimal g73310; // @rpg-trace: schema

    @Column(name = "G73320", length = 65, nullable = false)
    private String g73320; // @rpg-trace: schema

    @Column(name = "G73330", length = 65, nullable = false)
    private String g73330; // @rpg-trace: schema

    @Column(name = "G73340", length = 2, nullable = false)
    private String g73340; // @rpg-trace: schema

    @Column(name = "G73350", length = 1, nullable = false)
    private String g73350; // @rpg-trace: schema

    @Column(name = "G73360", length = 5, nullable = false)
    private String g73360; // @rpg-trace: schema

    @Column(name = "G73370", length = 5, nullable = false)
    private String g73370; // @rpg-trace: schema

    @Column(name = "G73380", length = 5, nullable = false)
    private String g73380; // @rpg-trace: schema

    @Column(name = "G73390", length = 5, nullable = false)
    private String g73390; // @rpg-trace: schema

    @Column(name = "G73400", length = 5, nullable = false)
    private String g73400; // @rpg-trace: schema

    @Column(name = "G73410", length = 5, nullable = false)
    private String g73410; // @rpg-trace: schema

    @Column(name = "G73420", length = 2, nullable = false)
    private String g73420; // @rpg-trace: schema

    @Column(name = "G73430", length = 2, nullable = false)
    private String g73430; // @rpg-trace: schema

    @Column(name = "G73440", length = 5, nullable = false)
    private String g73440; // @rpg-trace: schema

    @Column(name = "G73450", length = 2, nullable = false)
    private String g73450; // @rpg-trace: schema

    @Column(name = "G73460", length = 5, nullable = false)
    private String g73460; // @rpg-trace: schema

    @Column(name = "G73470", length = 2, nullable = false)
    private String g73470; // @rpg-trace: schema

    @Column(name = "G73480", length = 5, nullable = false)
    private String g73480; // @rpg-trace: schema

    @Column(name = "G73490", length = 2, nullable = false)
    private String g73490; // @rpg-trace: schema

    @Column(name = "G73500", length = 5, nullable = false)
    private String g73500; // @rpg-trace: schema

    public ClaimError() {}

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
    public String getG73065() { return g73065; }
    public void setG73065(String v) { this.g73065 = v; }
    public String getG73070() { return g73070; }
    public void setG73070(String v) { this.g73070 = v; }
    public String getG73080() { return g73080; }
    public void setG73080(String v) { this.g73080 = v; }
    public String getG73090() { return g73090; }
    public void setG73090(String v) { this.g73090 = v; }
    public String getG73100() { return g73100; }
    public void setG73100(String v) { this.g73100 = v; }
    public String getG73110() { return g73110; }
    public void setG73110(String v) { this.g73110 = v; }
    public String getG73120() { return g73120; }
    public void setG73120(String v) { this.g73120 = v; }
    public String getG73130() { return g73130; }
    public void setG73130(String v) { this.g73130 = v; }
    public String getG73140() { return g73140; }
    public void setG73140(String v) { this.g73140 = v; }
    public String getG73150() { return g73150; }
    public void setG73150(String v) { this.g73150 = v; }
    public BigDecimal getG73160() { return g73160; }
    public void setG73160(BigDecimal v) { this.g73160 = v; }
    public BigDecimal getG73170() { return g73170; }
    public void setG73170(BigDecimal v) { this.g73170 = v; }
    public BigDecimal getG73180() { return g73180; }
    public void setG73180(BigDecimal v) { this.g73180 = v; }
    public BigDecimal getG73190() { return g73190; }
    public void setG73190(BigDecimal v) { this.g73190 = v; }
    public BigDecimal getG73200() { return g73200; }
    public void setG73200(BigDecimal v) { this.g73200 = v; }
    public BigDecimal getG73210() { return g73210; }
    public void setG73210(BigDecimal v) { this.g73210 = v; }
    public BigDecimal getG73220() { return g73220; }
    public void setG73220(BigDecimal v) { this.g73220 = v; }
    public BigDecimal getG73230() { return g73230; }
    public void setG73230(BigDecimal v) { this.g73230 = v; }
    public BigDecimal getG73240() { return g73240; }
    public void setG73240(BigDecimal v) { this.g73240 = v; }
    public BigDecimal getG73250() { return g73250; }
    public void setG73250(BigDecimal v) { this.g73250 = v; }
    public BigDecimal getG73260() { return g73260; }
    public void setG73260(BigDecimal v) { this.g73260 = v; }
    public BigDecimal getG73270() { return g73270; }
    public void setG73270(BigDecimal v) { this.g73270 = v; }
    public String getG73280() { return g73280; }
    public void setG73280(String v) { this.g73280 = v; }
    public String getG73285() { return g73285; }
    public void setG73285(String v) { this.g73285 = v; }
    public BigDecimal getG73290() { return g73290; }
    public void setG73290(BigDecimal v) { this.g73290 = v; }
    public BigDecimal getG73300() { return g73300; }
    public void setG73300(BigDecimal v) { this.g73300 = v; }
    public BigDecimal getG73310() { return g73310; }
    public void setG73310(BigDecimal v) { this.g73310 = v; }
    public String getG73320() { return g73320; }
    public void setG73320(String v) { this.g73320 = v; }
    public String getG73330() { return g73330; }
    public void setG73330(String v) { this.g73330 = v; }
    public String getG73340() { return g73340; }
    public void setG73340(String v) { this.g73340 = v; }
    public String getG73350() { return g73350; }
    public void setG73350(String v) { this.g73350 = v; }
    public String getG73360() { return g73360; }
    public void setG73360(String v) { this.g73360 = v; }
    public String getG73370() { return g73370; }
    public void setG73370(String v) { this.g73370 = v; }
    public String getG73380() { return g73380; }
    public void setG73380(String v) { this.g73380 = v; }
    public String getG73390() { return g73390; }
    public void setG73390(String v) { this.g73390 = v; }
    public String getG73400() { return g73400; }
    public void setG73400(String v) { this.g73400 = v; }
    public String getG73410() { return g73410; }
    public void setG73410(String v) { this.g73410 = v; }
    public String getG73420() { return g73420; }
    public void setG73420(String v) { this.g73420 = v; }
    public String getG73430() { return g73430; }
    public void setG73430(String v) { this.g73430 = v; }
    public String getG73440() { return g73440; }
    public void setG73440(String v) { this.g73440 = v; }
    public String getG73450() { return g73450; }
    public void setG73450(String v) { this.g73450 = v; }
    public String getG73460() { return g73460; }
    public void setG73460(String v) { this.g73460 = v; }
    public String getG73470() { return g73470; }
    public void setG73470(String v) { this.g73470 = v; }
    public String getG73480() { return g73480; }
    public void setG73480(String v) { this.g73480 = v; }
    public String getG73490() { return g73490; }
    public void setG73490(String v) { this.g73490 = v; }
    public String getG73500() { return g73500; }
    public void setG73500(String v) { this.g73500 = v; }
}