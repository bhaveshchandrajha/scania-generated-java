/**
 * Domain entity or value object for the warranty claims model.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.domain;

public record ClaimSearchCriteria(
    String kzl,
    String branch,
    String comp,
    String vBranch,
    String date,
    int days,
    String filter,
    String filterArt,
    String status,
    String filpkz,
    String splitt,
    String art,
    String neuwt,
    String neu4,
    String fgnr,
    String fgnr17,
    String claimNr,
    String datauf,
    String lista,
    String listb,
    String anzdru,
    String parm5
) {
    public ClaimSearchCriteria {
        if (kzl == null) kzl = "";
        if (branch == null) branch = "";
        if (comp == null) comp = "";
        if (vBranch == null) vBranch = "";
        if (date == null) date = "";
        if (filter == null) filter = "";
        if (filterArt == null) filterArt = "";
        if (status == null) status = "";
        if (filpkz == null) filpkz = "";
        if (splitt == null) splitt = "";
        if (art == null) art = "";
        if (neuwt == null) neuwt = "";
        if (neu4 == null) neu4 = "";
        if (fgnr == null) fgnr = "";
        if (fgnr17 == null) fgnr17 = "";
        if (claimNr == null) claimNr = "";
        if (datauf == null) datauf = "";
        if (lista == null) lista = "";
        if (listb == null) listb = "";
        if (anzdru == null) anzdru = "";
        if (parm5 == null) parm5 = "";
    }
}