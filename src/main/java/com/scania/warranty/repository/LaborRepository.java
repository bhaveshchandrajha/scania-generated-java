/**
 * Spring Data JPA repository for warranty claim data access.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.repository;

import com.scania.warranty.domain.Labor;
import com.scania.warranty.domain.LaborId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaborRepository extends JpaRepository<Labor, LaborId> {

    @Query("SELECT l FROM Labor l WHERE l.ahw000 = :kzl AND l.ahw010 = :rechNr " +
           "AND l.ahw020 = :rechDatum AND l.ahw030 = :art AND l.ahw040 = :claimNr " +
           "AND l.ahw050 = :neuwt AND l.ahw060 = :neu4 AND l.ahw070 = :splitt " +
           "ORDER BY l.ahw080, l.ahw085, l.ahw090, l.ahw093, l.ahw095, l.ahw100, l.ahw110")
    List<Labor> findByKeyAh(@Param("kzl") String kzl, @Param("rechNr") String rechNr,
                            @Param("rechDatum") String rechDatum, @Param("art") String art,
                            @Param("claimNr") String claimNr, @Param("neuwt") String neuwt,
                            @Param("neu4") String neu4, @Param("splitt") String splitt); // @rpg-trace: n1212
}