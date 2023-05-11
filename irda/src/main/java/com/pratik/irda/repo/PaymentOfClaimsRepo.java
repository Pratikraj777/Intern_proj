package com.pratik.irda.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.irda.entities.PaymentOfClaims;


public interface PaymentOfClaimsRepo extends JpaRepository<PaymentOfClaims, Integer>{
	
    PaymentOfClaims findPaymentOfClaimsByMonthAndYear(String month,int year);
}
