/**
 * Spring Data JPA repository for warranty claim data access.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.repository;

import com.scania.warranty.domain.ExternalService;
import com.scania.warranty.domain.ExternalServiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ExternalServiceRepository extends JpaRepository<ExternalService, ExternalServiceId> {

    @Query("SELECT e FROM ExternalService e WHERE e.fla000 = :kzl AND e.fla010 = :rechDatum " +
           "AND e.fla020 = :rechNr AND e.fla030 = :pz AND e.fla040 = :datauf " +
           "ORDER BY e.fla050, e.fla160, e.fla170, e.fla180, e.fla190, e.fla200")
    List<ExternalService> findByKey(@Param("kzl") String kzl, @Param("rechDatum") String rechDatum,
                                    @Param("rechNr") String rechNr, @Param("pz") BigDecimal pz,
                                    @Param("datauf") String datauf); // @rpg-trace: n1319
}