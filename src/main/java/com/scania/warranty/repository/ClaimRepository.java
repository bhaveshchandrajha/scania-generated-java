/**
 * Spring Data JPA repository for warranty claim data access.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n404}.
 */

package com.scania.warranty.repository;

import com.scania.warranty.domain.Claim;
import com.scania.warranty.domain.ClaimId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, ClaimId> {

    @Query("SELECT c FROM Claim c WHERE c.g71000 = :kzl AND c.g71050 >= :datauf " +
           "ORDER BY c.g71050 ASC, c.g71060 ASC")
    List<Claim> findByKzlAndDateAfter(@Param("kzl") String kzl, @Param("datauf") String datauf); // @rpg-trace: n429

    @Query("SELECT c FROM Claim c WHERE c.g71000 = :kzl AND c.g71050 <= :datauf " +
           "ORDER BY c.g71050 DESC, c.g71060 DESC")
    List<Claim> findByKzlAndDateBefore(@Param("kzl") String kzl, @Param("datauf") String datauf); // @rpg-trace: n433

    Optional<Claim> findByG71000AndG71050AndG71060(String g71000, String g71050, String g71060); // @rpg-trace: n653

    @Query("SELECT c FROM Claim c WHERE c.g71000 = :kzl AND c.g71010 = :rechNr " +
           "AND c.g71020 = :rechDatum AND c.g71030 = :claimNr AND c.g71040 = :art " +
           "ORDER BY c.g71050, c.g71060")
    List<Claim> findByKeySub(@Param("kzl") String kzl, @Param("rechNr") String rechNr,
                             @Param("rechDatum") String rechDatum, @Param("claimNr") String claimNr,
                             @Param("art") String art); // @rpg-trace: n586

    @Query("SELECT MAX(c.g71080) FROM Claim c WHERE c.g71000 = :kzl")
    Optional<BigDecimal> findMaxClaimNumber(@Param("kzl") String kzl); // @rpg-trace: n1096
}