/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "HSAHWPF")
@IdClass(LaborId.class)
public class Labor {

    @Id
    @Column(name = "AHW000", length = 3, nullable = false)
    private String ahw000; // @rpg-trace: schema

    @Id
    @Column(name = "AHW010", length = 5, nullable = false)
    private String ahw010; // @rpg-trace: schema

    @Column(name = "AHW015", length = 10, nullable = false)
    private String ahw015; // @rpg-trace: schema

    @Id
    @Column(name = "AHW020", length = 8, nullable = false)
    private String ahw020; // @rpg-trace: schema

    @Id
    @Column(name = "AHW030", length = 1, nullable = false)
    private String ahw030; // @rpg-trace: schema

    @Id
    @Column(name = "AHW040", length = 5, nullable = false)
    private String ahw040; // @rpg-trace: schema

    @Id
    @Column(name = "AHW050", length = 1, nullable = false)
    private String ahw050; // @rpg-trace: schema

    @Id
    @Column(name = "AHW060", length = 1, nullable = false)
    private String ahw060; // @rpg-trace: schema

    @Id
    @Column(name = "AHW070", length = 2, nullable = false)
    private String ahw070; // @rpg-trace: schema

    @Column(name = "AHW075", precision = 3, scale = 0, nullable = false)
    private BigDecimal ahw075; // @rpg-trace: schema

    @Id
    @Column(name = "AHW080", length = 2, nullable = false)
    private String ahw080; // @rpg-trace: schema

    @Id
    @Column(name = "AHW085", precision = 3, scale = 0, nullable = false)
    private BigDecimal ahw085; // @rpg-trace: schema

    @Id
    @Column(name = "AHW090", length = 8, nullable = false)
    private String ahw090; // @rpg-trace: schema

    @Id
    @Column(name = "AHW093", precision = 3, scale = 0, nullable = false)
    private BigDecimal ahw093; // @rpg-trace: schema

    @Id
    @Column(name = "AHW095", precision = 3, scale = 0, nullable = false)
    private BigDecimal ahw095; // @rpg-trace: schema

    @Id
    @Column(name = "AHW100", length = 8, nullable = false)
    private String ahw100; // @rpg-trace: schema

    @Id
    @Column(name = "AHW110", length = 3, nullable = false)
    private String ahw110; // @rpg-trace: schema

    @Column(name = "AHW120", length = 40, nullable = false)
    private String ahw120; // @rpg-trace: schema

    @Column(name = "AHW129", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw129; // @rpg-trace: schema

    @Column(name = "AHW130", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw130; // @rpg-trace: schema

    @Column(name = "AHW131", precision = 5, scale = 0, nullable = false)
    private BigDecimal ahw131; // @rpg-trace: schema

    @Column(name = "AHW132", precision = 5, scale = 0, nullable = false)
    private BigDecimal ahw132; // @rpg-trace: schema

    @Column(name = "AHW133", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw133; // @rpg-trace: schema

    @Column(name = "AHW134", length = 1, nullable = false)
    private String ahw134; // @rpg-trace: schema

    @Column(name = "AHW140", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw140; // @rpg-trace: schema

    @Column(name = "AHW150", length = 3, nullable = false)
    private String ahw150; // @rpg-trace: schema

    @Column(name = "AHW159", length = 2, nullable = false)
    private String ahw159; // @rpg-trace: schema

    @Column(name = "AHW160", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw160; // @rpg-trace: schema

    @Column(name = "AHW170", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw170; // @rpg-trace: schema

    @Column(name = "AHW180", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw180; // @rpg-trace: schema

    @Column(name = "AHW190", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw190; // @rpg-trace: schema

    @Column(name = "AHW200", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw200; // @rpg-trace: schema

    @Column(name = "AHW210", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw210; // @rpg-trace: schema

    @Column(name = "AHW220", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw220; // @rpg-trace: schema

    @Column(name = "AHW230", length = 1, nullable = false)
    private String ahw230; // @rpg-trace: schema

    @Column(name = "AHW240", length = 1, nullable = false)
    private String ahw240; // @rpg-trace: schema

    @Column(name = "AHW250", length = 1, nullable = false)
    private String ahw250; // @rpg-trace: schema

    @Column(name = "AHW255", length = 3, nullable = false)
    private String ahw255; // @rpg-trace: schema

    @Column(name = "AHW260", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw260; // @rpg-trace: schema

    @Column(name = "AHW270", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw270; // @rpg-trace: schema

    @Column(name = "AHW280", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw280; // @rpg-trace: schema

    @Column(name = "AHW290", length = 1, nullable = false)
    private String ahw290; // @rpg-trace: schema

    @Column(name = "AHW300", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw300; // @rpg-trace: schema

    @Column(name = "AHW310", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw310; // @rpg-trace: schema

    @Column(name = "AHW320", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahw320; // @rpg-trace: schema

    @Column(name = "AHW330", length = 20, nullable = false)
    private String ahw330; // @rpg-trace: schema

    @Column(name = "AHW340", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahw340; // @rpg-trace: schema

    @Column(name = "AHW350", length = 500, nullable = false)
    private String ahw350; // @rpg-trace: schema

    @Column(name = "AHW360", length = 2000, nullable = false)
    private String ahw360; // @rpg-trace: schema

    @Column(name = "AHW370", length = 2000, nullable = false)
    private String ahw370; // @rpg-trace: schema

    public Labor() {}

    public String getAhw000() { return ahw000; }
    public void setAhw000(String v) { this.ahw000 = v; }
    public String getAhw010() { return ahw010; }
    public void setAhw010(String v) { this.ahw010 = v; }
    public String getAhw015() { return ahw015; }
    public void setAhw015(String v) { this.ahw015 = v; }
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
    public BigDecimal getAhw075() { return ahw075; }
    public void setAhw075(BigDecimal v) { this.ahw075 = v; }
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
    public String getAhw120() { return ahw120; }
    public void setAhw120(String v) { this.ahw120 = v; }
    public BigDecimal getAhw129() { return ahw129; }
    public void setAhw129(BigDecimal v) { this.ahw129 = v; }
    public BigDecimal getAhw130() { return ahw130; }
    public void setAhw130(BigDecimal v) { this.ahw130 = v; }
    public BigDecimal getAhw131() { return ahw131; }
    public void setAhw131(BigDecimal v) { this.ahw131 = v; }
    public BigDecimal getAhw132() { return ahw132; }
    public void setAhw132(BigDecimal v) { this.ahw132 = v; }
    public BigDecimal getAhw133() { return ahw133; }
    public void setAhw133(BigDecimal v) { this.ahw133 = v; }
    public String getAhw134() { return ahw134; }
    public void setAhw134(String v) { this.ahw134 = v; }
    public BigDecimal getAhw140() { return ahw140; }
    public void setAhw140(BigDecimal v) { this.ahw140 = v; }
    public String getAhw150() { return ahw150; }
    public void setAhw150(String v) { this.ahw150 = v; }
    public String getAhw159() { return ahw159; }
    public void setAhw159(String v) { this.ahw159 = v; }
    public BigDecimal getAhw160() { return ahw160; }
    public void setAhw160(BigDecimal v) { this.ahw160 = v; }
    public BigDecimal getAhw170() { return ahw170; }
    public void setAhw170(BigDecimal v) { this.ahw170 = v; }
    public BigDecimal getAhw180() { return ahw180; }
    public void setAhw180(BigDecimal v) { this.ahw180 = v; }
    public BigDecimal getAhw190() { return ahw190; }
    public void setAhw190(BigDecimal v) { this.ahw190 = v; }
    public BigDecimal getAhw200() { return ahw200; }
    public void setAhw200(BigDecimal v) { this.ahw200 = v; }
    public BigDecimal getAhw210() { return ahw210; }
    public void setAhw210(BigDecimal v) { this.ahw210 = v; }
    public BigDecimal getAhw220() { return ahw220; }
    public void setAhw220(BigDecimal v) { this.ahw220 = v; }
    public String getAhw230() { return ahw230; }
    public void setAhw230(String v) { this.ahw230 = v; }
    public String getAhw240() { return ahw240; }
    public void setAhw240(String v) { this.ahw240 = v; }
    public String getAhw250() { return ahw250; }
    public void setAhw250(String v) { this.ahw250 = v; }
    public String getAhw255() { return ahw255; }
    public void setAhw255(String v) { this.ahw255 = v; }
    public BigDecimal getAhw260() { return ahw260; }
    public void setAhw260(BigDecimal v) { this.ahw260 = v; }
    public BigDecimal getAhw270() { return ahw270; }
    public void setAhw270(BigDecimal v) { this.ahw270 = v; }
    public BigDecimal getAhw280() { return ahw280; }
    public void setAhw280(BigDecimal v) { this.ahw280 = v; }
    public String getAhw290() { return ahw290; }
    public void setAhw290(String v) { this.ahw290 = v; }
    public BigDecimal getAhw300() { return ahw300; }
    public void setAhw300(BigDecimal v) { this.ahw300 = v; }
    public BigDecimal getAhw310() { return ahw310; }
    public void setAhw310(BigDecimal v) { this.ahw310 = v; }
    public BigDecimal getAhw320() { return ahw320; }
    public void setAhw320(BigDecimal v) { this.ahw320 = v; }
    public String getAhw330() { return ahw330; }
    public void setAhw330(String v) { this.ahw330 = v; }
    public BigDecimal getAhw340() { return ahw340; }
    public void setAhw340(BigDecimal v) { this.ahw340 = v; }
    public String getAhw350() { return ahw350; }
    public void setAhw350(String v) { this.ahw350 = v; }
    public String getAhw360() { return ahw360; }
    public void setAhw360(String v) { this.ahw360 = v; }
    public String getAhw370() { return ahw370; }
    public void setAhw370(String v) { this.ahw370 = v; }
}