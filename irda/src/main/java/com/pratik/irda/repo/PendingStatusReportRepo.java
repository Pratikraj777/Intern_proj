package com.pratik.irda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.irda.entities.PendingStatusReport;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PendingStatusReportRepo extends JpaRepository<PendingStatusReport, Integer> {
    @Query("select p from PendingStatusReport p where p.month= :mon and p.year= :year")
    List<PendingStatusReport> getPendingStatusReportByByMonthAndYear(@Param("mon") String month, @Param("year") int year);
}

