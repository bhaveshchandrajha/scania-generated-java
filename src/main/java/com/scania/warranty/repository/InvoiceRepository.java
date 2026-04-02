/**
 * Spring Data JPA repository for warranty claim data access.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.repository;

import com.scania.warranty.domain.Invoice;
import com.scania.warranty.domain.InvoiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, InvoiceId> {

    @Query("SELECT i FROM Invoice i WHERE i.ahk000 = :kzl AND i.ahk040 = :rechNr " +
           "AND i.ahk050 = :art AND i.ahk060 = :neuwt AND i.ahk070 = :splitt AND i.ahk080 = :datauf " +
           "ORDER BY i.ahk000, i.ahk040, i.ahk050, i.ahk060, i.ahk070, i.ahk080")
    List<Invoice> findByKeyAhk(@Param("kzl") String kzl, @Param("rechNr") String rechNr,
                               @Param("art") String art, @Param("neuwt") String neuwt,
                               @Param("splitt") String splitt, @Param("datauf") String datauf); // @rpg-trace: n974

    @Query("SELECT i FROM Invoice i WHERE i.ahk000 = :kzl AND i.ahk010 = :rechNr AND i.ahk020 = :rechDatum " +
           "ORDER BY i.ahk040, i.ahk050, i.ahk060, i.ahk070, i.ahk080")
    List<Invoice> findByKey03(@Param("kzl") String kzl, @Param("rechNr") String rechNr,
                              @Param("rechDatum") String rechDatum); // @rpg-trace: n794

    @Query("SELECT i FROM Invoice i WHERE i.ahk000 = :kzl AND i.ahk040 = :rechNr " +
           "AND i.ahk060 >= :repDate ORDER BY i.ahk060, i.ahk070, i.ahk080")
    List<Invoice> findByKeyWithDateFilter(@Param("kzl") String kzl, @Param("rechNr") String rechNr,
                                          @Param("repDate") String repDate); // @rpg-trace: n747

    Optional<Invoice> findByAhk000AndAhk040AndAhk050AndAhk060AndAhk070AndAhk080(
        String ahk000, String ahk040, String ahk050, String ahk060, String ahk070, String ahk080); // @rpg-trace: n983
}