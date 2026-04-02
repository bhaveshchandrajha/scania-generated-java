/**
 * Spring Data JPA repository for warranty claim data access.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1919}.
 */

package com.scania.warranty.repository;

import com.scania.warranty.domain.Hsgpspf;
import com.scania.warranty.domain.HsgpspfId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HsgpspfRepository extends JpaRepository<Hsgpspf, HsgpspfId> {

    // SETLL + DOW READE on HSGPSPF by key (GPS000, GPS010) - reads all records matching partial key
    // @rpg-trace: n1958
    @Query("SELECT h FROM Hsgpspf h WHERE h.gps000 = :gps000 AND h.gps010 = :gps010 ORDER BY h.gps020, h.gps030, h.gps035, h.gps040")
    List<Hsgpspf> findByGps000AndGps010(
        @Param("gps000") String gps000,
        @Param("gps010") String gps010
    );
}