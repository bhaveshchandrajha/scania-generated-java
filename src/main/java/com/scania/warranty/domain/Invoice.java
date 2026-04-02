/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "HSAHKLF3")
@IdClass(InvoiceId.class)
public class Invoice {

    @Id
    @Column(name = "AHK000", length = 3, nullable = false)
    private String ahk000; // @rpg-trace: schema

    @Column(name = "AHK010", length = 5, nullable = false)
    private String ahk010; // @rpg-trace: schema

    @Column(name = "AHK015", length = 10, nullable = false)
    private String ahk015; // @rpg-trace: schema

    @Column(name = "AHK020", length = 8, nullable = false)
    private String ahk020; // @rpg-trace: schema

    @Column(name = "AHK030", length = 1, nullable = false)
    private String ahk030; // @rpg-trace: schema

    @Id
    @Column(name = "AHK040", length = 5, nullable = false)
    private String ahk040; // @rpg-trace: schema

    @Id
    @Column(name = "AHK050", length = 1, nullable = false)
    private String ahk050; // @rpg-trace: schema

    @Id
    @Column(name = "AHK060", length = 1, nullable = false)
    private String ahk060; // @rpg-trace: schema

    @Id
    @Column(name = "AHK070", length = 2, nullable = false)
    private String ahk070; // @rpg-trace: schema

    @Id
    @Column(name = "AHK080", length = 8, nullable = false)
    private String ahk080; // @rpg-trace: schema

    @Column(name = "AHK090", length = 40, nullable = false)
    private String ahk090; // @rpg-trace: schema

    @Column(name = "AHK100", length = 5, nullable = false)
    private String ahk100; // @rpg-trace: schema

    @Column(name = "AHK105", length = 5, nullable = false)
    private String ahk105; // @rpg-trace: schema

    @Column(name = "AHK106", length = 8, nullable = false)
    private String ahk106; // @rpg-trace: schema

    @Column(name = "AHK107", length = 5, nullable = false)
    private String ahk107; // @rpg-trace: schema

    @Column(name = "AHK108", length = 8, nullable = false)
    private String ahk108; // @rpg-trace: schema

    @Column(name = "AHK110", length = 1, nullable = false)
    private String ahk110; // @rpg-trace: schema

    @Column(name = "AHK120", length = 1, nullable = false)
    private String ahk120; // @rpg-trace: schema

    @Column(name = "AHK130", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahk130; // @rpg-trace: schema

    @Column(name = "AHK140", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahk140; // @rpg-trace: schema

    @Column(name = "AHK150", length = 2, nullable = false)
    private String ahk150; // @rpg-trace: schema

    @Column(name = "AHK160", length = 5, nullable = false)
    private String ahk160; // @rpg-trace: schema

    @Column(name = "AHK170", length = 5, nullable = false)
    private String ahk170; // @rpg-trace: schema

    @Column(name = "AHK180", length = 6, nullable = false)
    private String ahk180; // @rpg-trace: schema

    @Column(name = "AHK190", length = 6, nullable = false)
    private String ahk190; // @rpg-trace: schema

    @Column(name = "AHK200", length = 6, nullable = false)
    private String ahk200; // @rpg-trace: schema

    @Column(name = "AHK205", length = 6, nullable = false)
    private String ahk205; // @rpg-trace: schema

    @Column(name = "AHK210", length = 7, nullable = false)
    private String ahk210; // @rpg-trace: schema

    @Column(name = "AHK220", length = 5, nullable = false)
    private String ahk220; // @rpg-trace: schema

    @Column(name = "AHK221", length = 10, nullable = false)
    private String ahk221; // @rpg-trace: schema

    @Column(name = "AHK222", length = 3, nullable = false)
    private String ahk222; // @rpg-trace: schema

    @Column(name = "AHK223", length = 10, nullable = false)
    private String ahk223; // @rpg-trace: schema

    @Column(name = "AHK224", length = 10, nullable = false)
    private String ahk224; // @rpg-trace: schema

    @Column(name = "AHK225", length = 20, nullable = false)
    private String ahk225; // @rpg-trace: schema

    @Column(name = "AHK226", length = 3, nullable = false)
    private String ahk226; // @rpg-trace: schema

    @Column(name = "AHK230", length = 6, nullable = false)
    private String ahk230; // @rpg-trace: schema

    @Column(name = "AHK240", length = 1, nullable = false)
    private String ahk240; // @rpg-trace: schema

    @Column(name = "AHK250", length = 30, nullable = false)
    private String ahk250; // @rpg-trace: schema

    @Column(name = "AHK260", length = 25, nullable = false)
    private String ahk260; // @rpg-trace: schema

    @Column(name = "AHK270", length = 5, nullable = false)
    private String ahk270; // @rpg-trace: schema

    @Column(name = "AHK280", length = 25, nullable = false)
    private String ahk280; // @rpg-trace: schema

    @Column(name = "AHK290", length = 3, nullable = false)
    private String ahk290; // @rpg-trace: schema

    @Column(name = "AHK300", length = 5, nullable = false)
    private String ahk300; // @rpg-trace: schema

    @Column(name = "AHK310", length = 20, nullable = false)
    private String ahk310; // @rpg-trace: schema

    @Column(name = "AHK320", length = 17, nullable = false)
    private String ahk320; // @rpg-trace: schema

    @Column(name = "AHK325", length = 20, nullable = false)
    private String ahk325; // @rpg-trace: schema

    @Column(name = "AHK330", length = 1, nullable = false)
    private String ahk330; // @rpg-trace: schema

    @Column(name = "AHK340", length = 1, nullable = false)
    private String ahk340; // @rpg-trace: schema

    @Column(name = "AHK350", length = 1, nullable = false)
    private String ahk350; // @rpg-trace: schema

    @Column(name = "AHK360", length = 3, nullable = false)
    private String ahk360; // @rpg-trace: schema

    @Column(name = "AHK370", length = 6, nullable = false)
    private String ahk370; // @rpg-trace: schema

    @Column(name = "AHK380", length = 1, nullable = false)
    private String ahk380; // @rpg-trace: schema

    @Column(name = "AHK390", length = 30, nullable = false)
    private String ahk390; // @rpg-trace: schema

    @Column(name = "AHK400", length = 25, nullable = false)
    private String ahk400; // @rpg-trace: schema

    @Column(name = "AHK410", length = 5, nullable = false)
    private String ahk410; // @rpg-trace: schema

    @Column(name = "AHK420", length = 25, nullable = false)
    private String ahk420; // @rpg-trace: schema

    @Column(name = "AHK430", length = 3, nullable = false)
    private String ahk430; // @rpg-trace: schema

    @Column(name = "AHK440", length = 5, nullable = false)
    private String ahk440; // @rpg-trace: schema

    @Column(name = "AHK450", length = 20, nullable = false)
    private String ahk450; // @rpg-trace: schema

    @Column(name = "AHK460", length = 17, nullable = false)
    private String ahk460; // @rpg-trace: schema

    @Column(name = "AHK470", length = 1, nullable = false)
    private String ahk470; // @rpg-trace: schema

    @Column(name = "AHK480", length = 1, nullable = false)
    private String ahk480; // @rpg-trace: schema

    @Column(name = "AHK490", length = 1, nullable = false)
    private String ahk490; // @rpg-trace: schema

    @Column(name = "AHK500", length = 3, nullable = false)
    private String ahk500; // @rpg-trace: schema

    @Column(name = "AHK505", length = 20, nullable = false)
    private String ahk505; // @rpg-trace: schema

    @Column(name = "AHK510", length = 17, nullable = false)
    private String ahk510; // @rpg-trace: schema

    @Column(name = "AHK520", length = 12, nullable = false)
    private String ahk520; // @rpg-trace: schema

    @Column(name = "AHK530", length = 15, nullable = false)
    private String ahk530; // @rpg-trace: schema

    @Column(name = "AHK540", length = 4, nullable = false)
    private String ahk540; // @rpg-trace: schema

    @Column(name = "AHK550", length = 8, nullable = false)
    private String ahk550; // @rpg-trace: schema

    @Column(name = "AHK560", length = 3, nullable = false)
    private String ahk560; // @rpg-trace: schema

    @Column(name = "AHK570", length = 6, nullable = false)
    private String ahk570; // @rpg-trace: schema

    @Column(name = "AHK580", length = 8, nullable = false)
    private String ahk580; // @rpg-trace: schema

    @Column(name = "AHK590", length = 6, nullable = false)
    private String ahk590; // @rpg-trace: schema

    @Column(name = "AHK595", length = 8, nullable = false)
    private String ahk595; // @rpg-trace: schema

    @Column(name = "AHK600", length = 8, nullable = false)
    private String ahk600; // @rpg-trace: schema

    @Column(name = "AHK610", length = 6, nullable = false)
    private String ahk610; // @rpg-trace: schema

    @Column(name = "AHK620", length = 8, nullable = false)
    private String ahk620; // @rpg-trace: schema

    @Column(name = "AHK625", length = 4, nullable = false)
    private String ahk625; // @rpg-trace: schema

    @Column(name = "AHK630", length = 8, nullable = false)
    private String ahk630; // @rpg-trace: schema

    @Column(name = "AHK640", length = 4, nullable = false)
    private String ahk640; // @rpg-trace: schema

    @Column(name = "AHK650", length = 20, nullable = false)
    private String ahk650; // @rpg-trace: schema

    @Column(name = "AHK660", length = 3, nullable = false)
    private String ahk660; // @rpg-trace: schema

    @Column(name = "AHK670", length = 3, nullable = false)
    private String ahk670; // @rpg-trace: schema

    @Column(name = "AHK680", length = 3, nullable = false)
    private String ahk680; // @rpg-trace: schema

    @Column(name = "AHK690", length = 10, nullable = false)
    private String ahk690; // @rpg-trace: schema

    @Column(name = "AHK691", length = 20, nullable = false)
    private String ahk691; // @rpg-trace: schema

    @Column(name = "AHK699", length = 10, nullable = false)
    private String ahk699; // @rpg-trace: schema

    @Column(name = "AHK700", length = 10, nullable = false)
    private String ahk700; // @rpg-trace: schema

    @Column(name = "AHK710", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahk710; // @rpg-trace: schema

    @Column(name = "AHK720", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahk720; // @rpg-trace: schema

    @Column(name = "AHK730", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahk730; // @rpg-trace: schema

    @Column(name = "AHK740", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahk740; // @rpg-trace: schema

    @Column(name = "AHK750", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahk750; // @rpg-trace: schema

    @Column(name = "AHK760", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahk760; // @rpg-trace: schema

    @Column(name = "AHK770", length = 1, nullable = false)
    private String ahk770; // @rpg-trace: schema

    @Column(name = "AHK775", length = 1, nullable = false)
    private String ahk775; // @rpg-trace: schema

    @Column(name = "AHK780", length = 1, nullable = false)
    private String ahk780; // @rpg-trace: schema

    @Column(name = "AHK790", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahk790; // @rpg-trace: schema

    @Column(name = "AHK800", precision = 9, scale = 2, nullable = false)
    private BigDecimal ahk800; // @rpg-trace: schema

    @Column(name = "AHK810", length = 8, nullable = false)
    private String ahk810; // @rpg-trace: schema

    @Column(name = "AHK815", precision = 9, scale = 0, nullable = false)
    private BigDecimal ahk815; // @rpg-trace: schema

    @Column(name = "AHK820", precision = 2, scale = 0, nullable = false)
    private BigDecimal ahk820; // @rpg-trace: schema

    @Column(name = "AHK830", precision = 2, scale = 0, nullable = false)
    private BigDecimal ahk830; // @rpg-trace: schema

    @Column(name = "AHK840", precision = 3, scale = 0, nullable = false)
    private BigDecimal ahk840; // @rpg-trace: schema

    @Column(name = "AHK845", precision = 3, scale = 0, nullable = false)
    private BigDecimal ahk845; // @rpg-trace: schema

    @Column(name = "AHK850", precision = 6, scale = 0, nullable = false)
    private BigDecimal ahk850; // @rpg-trace: schema

    @Column(name = "AHK855", length = 10, nullable = false)
    private String ahk855; // @rpg-trace: schema

    @Column(name = "AHK860", length = 2, nullable = false)
    private String ahk860; // @rpg-trace: schema

    @Column(name = "AHK870", length = 2, nullable = false)
    private String ahk870; // @rpg-trace: schema

    @Column(name = "AHK880", length = 1, nullable = false)
    private String ahk880; // @rpg-trace: schema

    @Column(name = "AHK890", precision = 5, scale = 2, nullable = false)
    private BigDecimal ahk890; // @rpg-trace: schema

    @Column(name = "AHK900", length = 15, nullable = false)
    private String ahk900; // @rpg-trace: schema

    @Column(name = "AHK901", length = 8, nullable = false)
    private String ahk901; // @rpg-trace: schema

    @Column(name = "AHK910", length = 15, nullable = false)
    private String ahk910; // @rpg-trace: schema

    @Column(name = "AHK920", precision = 5, scale = 0, nullable = false)
    private BigDecimal ahk920; // @rpg-trace: schema

    @Column(name = "AHK930", length = 3, nullable = false)
    private String ahk930; // @rpg-trace: schema

    @Column(name = "AHK940", length = 40, nullable = false)
    private String ahk940; // @rpg-trace: schema

    @Column(name = "AHK950", length = 20, nullable = false)
    private String ahk950; // @rpg-trace: schema

    @Column(name = "AHK960", length = 20, nullable = false)
    private String ahk960; // @rpg-trace: schema

    @Column(name = "AHK970", length = 20, nullable = false)
    private String ahk970; // @rpg-trace: schema

    @Column(name = "AHK980", length = 20, nullable = false)
    private String ahk980; // @rpg-trace: schema

    @Column(name = "AHK990", length = 20, nullable = false)
    private String ahk990; // @rpg-trace: schema

    @Column(name = "AHK1000", length = 20, nullable = false)
    private String ahk1000; // @rpg-trace: schema

    @Column(name = "AHK1010", length = 20, nullable = false)
    private String ahk1010; // @rpg-trace: schema

    @Column(name = "AHK1020", length = 20, nullable = false)
    private String ahk1020; // @rpg-trace: schema

    @Column(name = "AHK1030", length = 20, nullable = false)
    private String ahk1030; // @rpg-trace: schema

    @Column(name = "AHK1040", length = 20, nullable = false)
    private String ahk1040; // @rpg-trace: schema

    @Column(name = "AHK1050", length = 20, nullable = false)
    private String ahk1050; // @rpg-trace: schema

    @Column(name = "AHK1060", length = 10, nullable = false)
    private String ahk1060; // @rpg-trace: schema

    @Column(name = "AHK1070", length = 1, nullable = false)
    private String ahk1070; // @rpg-trace: schema

    @Column(name = "AHK1080", length = 5, nullable = false)
    private String ahk1080; // @rpg-trace: schema

    @Column(name = "AHK1100", length = 200, nullable = false)
    private String ahk1100; // @rpg-trace: schema

    @Column(name = "AHK1110", length = 200, nullable = false)
    private String ahk1110; // @rpg-trace: schema

    public Invoice() {}

    public String getAhk000() { return ahk000; }
    public void setAhk000(String v) { this.ahk000 = v; }
    public String getAhk010() { return ahk010; }
    public void setAhk010(String v) { this.ahk010 = v; }
    public String getAhk015() { return ahk015; }
    public void setAhk015(String v) { this.ahk015 = v; }
    public String getAhk020() { return ahk020; }
    public void setAhk020(String v) { this.ahk020 = v; }
    public String getAhk030() { return ahk030; }
    public void setAhk030(String v) { this.ahk030 = v; }
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
    public String getAhk090() { return ahk090; }
    public void setAhk090(String v) { this.ahk090 = v; }
    public String getAhk100() { return ahk100; }
    public void setAhk100(String v) { this.ahk100 = v; }
    public String getAhk105() { return ahk105; }
    public void setAhk105(String v) { this.ahk105 = v; }
    public String getAhk106() { return ahk106; }
    public void setAhk106(String v) { this.ahk106 = v; }
    public String getAhk107() { return ahk107; }
    public void setAhk107(String v) { this.ahk107 = v; }
    public String getAhk108() { return ahk108; }
    public void setAhk108(String v) { this.ahk108 = v; }
    public String getAhk110() { return ahk110; }
    public void setAhk110(String v) { this.ahk110 = v; }
    public String getAhk120() { return ahk120; }
    public void setAhk120(String v) { this.ahk120 = v; }
    public BigDecimal getAhk130() { return ahk130; }
    public void setAhk130(BigDecimal v) { this.ahk130 = v; }
    public BigDecimal getAhk140() { return ahk140; }
    public void setAhk140(BigDecimal v) { this.ahk140 = v; }
    public String getAhk150() { return ahk150; }
    public void setAhk150(String v) { this.ahk150 = v; }
    public String getAhk160() { return ahk160; }
    public void setAhk160(String v) { this.ahk160 = v; }
    public String getAhk170() { return ahk170; }
    public void setAhk170(String v) { this.ahk170 = v; }
    public String getAhk180() { return ahk180; }
    public void setAhk180(String v) { this.ahk180 = v; }
    public String getAhk190() { return ahk190; }
    public void setAhk190(String v) { this.ahk190 = v; }
    public String getAhk200() { return ahk200; }
    public void setAhk200(String v) { this.ahk200 = v; }
    public String getAhk205() { return ahk205; }
    public void setAhk205(String v) { this.ahk205 = v; }
    public String getAhk210() { return ahk210; }
    public void setAhk210(String v) { this.ahk210 = v; }
    public String getAhk220() { return ahk220; }
    public void setAhk220(String v) { this.ahk220 = v; }
    public String getAhk221() { return ahk221; }
    public void setAhk221(String v) { this.ahk221 = v; }
    public String getAhk222() { return ahk222; }
    public void setAhk222(String v) { this.ahk222 = v; }
    public String getAhk223() { return ahk223; }
    public void setAhk223(String v) { this.ahk223 = v; }
    public String getAhk224() { return ahk224; }
    public void setAhk224(String v) { this.ahk224 = v; }
    public String getAhk225() { return ahk225; }
    public void setAhk225(String v) { this.ahk225 = v; }
    public String getAhk226() { return ahk226; }
    public void setAhk226(String v) { this.ahk226 = v; }
    public String getAhk230() { return ahk230; }
    public void setAhk230(String v) { this.ahk230 = v; }
    public String getAhk240() { return ahk240; }
    public void setAhk240(String v) { this.ahk240 = v; }
    public String getAhk250() { return ahk250; }
    public void setAhk250(String v) { this.ahk250 = v; }
    public String getAhk260() { return ahk260; }
    public void setAhk260(String v) { this.ahk260 = v; }
    public String getAhk270() { return ahk270; }
    public void setAhk270(String v) { this.ahk270 = v; }
    public String getAhk280() { return ahk280; }
    public void setAhk280(String v) { this.ahk280 = v; }
    public String getAhk290() { return ahk290; }
    public void setAhk290(String v) { this.ahk290 = v; }
    public String getAhk300() { return ahk300; }
    public void setAhk300(String v) { this.ahk300 = v; }
    public String getAhk310() { return ahk310; }
    public void setAhk310(String v) { this.ahk310 = v; }
    public String getAhk320() { return ahk320; }
    public void setAhk320(String v) { this.ahk320 = v; }
    public String getAhk325() { return ahk325; }
    public void setAhk325(String v) { this.ahk325 = v; }
    public String getAhk330() { return ahk330; }
    public void setAhk330(String v) { this.ahk330 = v; }
    public String getAhk340() { return ahk340; }
    public void setAhk340(String v) { this.ahk340 = v; }
    public String getAhk350() { return ahk350; }
    public void setAhk350(String v) { this.ahk350 = v; }
    public String getAhk360() { return ahk360; }
    public void setAhk360(String v) { this.ahk360 = v; }
    public String getAhk370() { return ahk370; }
    public void setAhk370(String v) { this.ahk370 = v; }
    public String getAhk380() { return ahk380; }
    public void setAhk380(String v) { this.ahk380 = v; }
    public String getAhk390() { return ahk390; }
    public void setAhk390(String v) { this.ahk390 = v; }
    public String getAhk400() { return ahk400; }
    public void setAhk400(String v) { this.ahk400 = v; }
    public String getAhk410() { return ahk410; }
    public void setAhk410(String v) { this.ahk410 = v; }
    public String getAhk420() { return ahk420; }
    public void setAhk420(String v) { this.ahk420 = v; }
    public String getAhk430() { return ahk430; }
    public void setAhk430(String v) { this.ahk430 = v; }
    public String getAhk440() { return ahk440; }
    public void setAhk440(String v) { this.ahk440 = v; }
    public String getAhk450() { return ahk450; }
    public void setAhk450(String v) { this.ahk450 = v; }
    public String getAhk460() { return ahk460; }
    public void setAhk460(String v) { this.ahk460 = v; }
    public String getAhk470() { return ahk470; }
    public void setAhk470(String v) { this.ahk470 = v; }
    public String getAhk480() { return ahk480; }
    public void setAhk480(String v) { this.ahk480 = v; }
    public String getAhk490() { return ahk490; }
    public void setAhk490(String v) { this.ahk490 = v; }
    public String getAhk500() { return ahk500; }
    public void setAhk500(String v) { this.ahk500 = v; }
    public String getAhk505() { return ahk505; }
    public void setAhk505(String v) { this.ahk505 = v; }
    public String getAhk510() { return ahk510; }
    public void setAhk510(String v) { this.ahk510 = v; }
    public String getAhk520() { return ahk520; }
    public void setAhk520(String v) { this.ahk520 = v; }
    public String getAhk530() { return ahk530; }
    public void setAhk530(String v) { this.ahk530 = v; }
    public String getAhk540() { return ahk540; }
    public void setAhk540(String v) { this.ahk540 = v; }
    public String getAhk550() { return ahk550; }
    public void setAhk550(String v) { this.ahk550 = v; }
    public String getAhk560() { return ahk560; }
    public void setAhk560(String v) { this.ahk560 = v; }
    public String getAhk570() { return ahk570; }
    public void setAhk570(String v) { this.ahk570 = v; }
    public String getAhk580() { return ahk580; }
    public void setAhk580(String v) { this.ahk580 = v; }
    public String getAhk590() { return ahk590; }
    public void setAhk590(String v) { this.ahk590 = v; }
    public String getAhk595() { return ahk595; }
    public void setAhk595(String v) { this.ahk595 = v; }
    public String getAhk600() { return ahk600; }
    public void setAhk600(String v) { this.ahk600 = v; }
    public String getAhk610() { return ahk610; }
    public void setAhk610(String v) { this.ahk610 = v; }
    public String getAhk620() { return ahk620; }
    public void setAhk620(String v) { this.ahk620 = v; }
    public String getAhk625() { return ahk625; }
    public void setAhk625(String v) { this.ahk625 = v; }
    public String getAhk630() { return ahk630; }
    public void setAhk630(String v) { this.ahk630 = v; }
    public String getAhk640() { return ahk640; }
    public void setAhk640(String v) { this.ahk640 = v; }
    public String getAhk650() { return ahk650; }
    public void setAhk650(String v) { this.ahk650 = v; }
    public String getAhk660() { return ahk660; }
    public void setAhk660(String v) { this.ahk660 = v; }
    public String getAhk670() { return ahk670; }
    public void setAhk670(String v) { this.ahk670 = v; }
    public String getAhk680() { return ahk680; }
    public void setAhk680(String v) { this.ahk680 = v; }
    public String getAhk690() { return ahk690; }
    public void setAhk690(String v) { this.ahk690 = v; }
    public String getAhk691() { return ahk691; }
    public void setAhk691(String v) { this.ahk691 = v; }
    public String getAhk699() { return ahk699; }
    public void setAhk699(String v) { this.ahk699 = v; }
    public String getAhk700() { return ahk700; }
    public void setAhk700(String v) { this.ahk700 = v; }
    public BigDecimal getAhk710() { return ahk710; }
    public void setAhk710(BigDecimal v) { this.ahk710 = v; }
    public BigDecimal getAhk720() { return ahk720; }
    public void setAhk720(BigDecimal v) { this.ahk720 = v; }
    public BigDecimal getAhk730() { return ahk730; }
    public void setAhk730(BigDecimal v) { this.ahk730 = v; }
    public BigDecimal getAhk740() { return ahk740; }
    public void setAhk740(BigDecimal v) { this.ahk740 = v; }
    public BigDecimal getAhk750() { return ahk750; }
    public void setAhk750(BigDecimal v) { this.ahk750 = v; }
    public BigDecimal getAhk760() { return ahk760; }
    public void setAhk760(BigDecimal v) { this.ahk760 = v; }
    public String getAhk770() { return ahk770; }
    public void setAhk770(String v) { this.ahk770 = v; }
    public String getAhk775() { return ahk775; }
    public void setAhk775(String v) { this.ahk775 = v; }
    public String getAhk780() { return ahk780; }
    public void setAhk780(String v) { this.ahk780 = v; }
    public BigDecimal getAhk790() { return ahk790; }
    public void setAhk790(BigDecimal v) { this.ahk790 = v; }
    public BigDecimal getAhk800() { return ahk800; }
    public void setAhk800(BigDecimal v) { this.ahk800 = v; }
    public String getAhk810() { return ahk810; }
    public void setAhk810(String v) { this.ahk810 = v; }
    public BigDecimal getAhk815() { return ahk815; }
    public void setAhk815(BigDecimal v) { this.ahk815 = v; }
    public BigDecimal getAhk820() { return ahk820; }
    public void setAhk820(BigDecimal v) { this.ahk820 = v; }
    public BigDecimal getAhk830() { return ahk830; }
    public void setAhk830(BigDecimal v) { this.ahk830 = v; }
    public BigDecimal getAhk840() { return ahk840; }
    public void setAhk840(BigDecimal v) { this.ahk840 = v; }
    public BigDecimal getAhk845() { return ahk845; }
    public void setAhk845(BigDecimal v) { this.ahk845 = v; }
    public BigDecimal getAhk850() { return ahk850; }
    public void setAhk850(BigDecimal v) { this.ahk850 = v; }
    public String getAhk855() { return ahk855; }
    public void setAhk855(String v) { this.ahk855 = v; }
    public String getAhk860() { return ahk860; }
    public void setAhk860(String v) { this.ahk860 = v; }
    public String getAhk870() { return ahk870; }
    public void setAhk870(String v) { this.ahk870 = v; }
    public String getAhk880() { return ahk880; }
    public void setAhk880(String v) { this.ahk880 = v; }
    public BigDecimal getAhk890() { return ahk890; }
    public void setAhk890(BigDecimal v) { this.ahk890 = v; }
    public String getAhk900() { return ahk900; }
    public void setAhk900(String v) { this.ahk900 = v; }
    public String getAhk901() { return ahk901; }
    public void setAhk901(String v) { this.ahk901 = v; }
    public String getAhk910() { return ahk910; }
    public void setAhk910(String v) { this.ahk910 = v; }
    public BigDecimal getAhk920() { return ahk920; }
    public void setAhk920(BigDecimal v) { this.ahk920 = v; }
    public String getAhk930() { return ahk930; }
    public void setAhk930(String v) { this.ahk930 = v; }
    public String getAhk940() { return ahk940; }
    public void setAhk940(String v) { this.ahk940 = v; }
    public String getAhk950() { return ahk950; }
    public void setAhk950(String v) { this.ahk950 = v; }
    public String getAhk960() { return ahk960; }
    public void setAhk960(String v) { this.ahk960 = v; }
    public String getAhk970() { return ahk970; }
    public void setAhk970(String v) { this.ahk970 = v; }
    public String getAhk980() { return ahk980; }
    public void setAhk980(String v) { this.ahk980 = v; }
    public String getAhk990() { return ahk990; }
    public void setAhk990(String v) { this.ahk990 = v; }
    public String getAhk1000() { return ahk1000; }
    public void setAhk1000(String v) { this.ahk1000 = v; }
    public String getAhk1010() { return ahk1010; }
    public void setAhk1010(String v) { this.ahk1010 = v; }
    public String getAhk1020() { return ahk1020; }
    public void setAhk1020(String v) { this.ahk1020 = v; }
    public String getAhk1030() { return ahk1030; }
    public void setAhk1030(String v) { this.ahk1030 = v; }
    public String getAhk1040() { return ahk1040; }
    public void setAhk1040(String v) { this.ahk1040 = v; }
    public String getAhk1050() { return ahk1050; }
    public void setAhk1050(String v) { this.ahk1050 = v; }
    public String getAhk1060() { return ahk1060; }
    public void setAhk1060(String v) { this.ahk1060 = v; }
    public String getAhk1070() { return ahk1070; }
    public void setAhk1070(String v) { this.ahk1070 = v; }
    public String getAhk1080() { return ahk1080; }
    public void setAhk1080(String v) { this.ahk1080 = v; }
    public String getAhk1100() { return ahk1100; }
    public void setAhk1100(String v) { this.ahk1100 = v; }
    public String getAhk1110() { return ahk1110; }
    public void setAhk1110(String v) { this.ahk1110 = v; }
}