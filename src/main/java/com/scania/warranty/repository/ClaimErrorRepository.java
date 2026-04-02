/**
 * Spring Data JPA repository for warranty claim data access.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.repository;

import com.scania.warranty.domain.ClaimError;
import com.scania.warranty.domain.ClaimErrorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClaimErrorRepository extends JpaRepository<ClaimError, ClaimErrorId> {

    @Query("SELECT e FROM ClaimError e WHERE e.g73000 = :kzl AND e.g73010 = :rechNr " +
           "AND e.g73020 = :rechDatum AND e.g73030 = :claimNr AND e.g73040 = :art " +
           "AND e.g73050 = :datauf ORDER BY e.g73060")
    List<ClaimError> findByKeyG73(@Param("kzl") String kzl, @Param("rechNr") String rechNr,
                                  @Param("rechDatum") String rechDatum, @Param("claimNr") String claimNr,
                                  @Param("art") String art, @Param("datauf") String datauf); // @rpg-trace: n452

    Optional<ClaimError> findByG73000AndG73010AndG73020AndG73030AndG73040AndG73050AndG73060(
        String g73000, String g73010, String g73020, String g73030, String g73040,
        String g73050, String g73060); // @rpg-trace: n1547

    void deleteByG73000AndG73010AndG73020AndG73030AndG73040AndG73050AndG73060(
        String g73000, String g73010, String g73020, String g73030, String g73040,
        String g73050, String g73060); // @rpg-trace: n593
}