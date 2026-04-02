/**
 * Spring Data JPA repository for warranty claim data access.
 * <p>
 * Generated from RPG: unit {@code HS1210}, node {@code n1983}.
 */

package com.scania.warranty.repository;

import com.scania.warranty.domain.ExtendedPartAgreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExtendedPartAgreementRepository extends JpaRepository<ExtendedPartAgreement, String> {

    @Query("SELECT e FROM ExtendedPartAgreement e WHERE e.hauptgruppe = :hauptgruppe AND e.nebengruppe = :nebengruppe ORDER BY e.datumVon")
    List<ExtendedPartAgreement> findByHauptgruppeAndNebengruppe(
        @Param("hauptgruppe") String hauptgruppe,
        @Param("nebengruppe") String nebengruppe
    ); // @rpg-trace: n1996
}