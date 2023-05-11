package com.pratik.irda.repo;

import com.pratik.irda.entities.ClaimStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClaimStatusRepo extends JpaRepository<ClaimStatus,Long> {
    @Query("select c from ClaimStatus c ")
    ClaimStatus findClaimStatus();
}
