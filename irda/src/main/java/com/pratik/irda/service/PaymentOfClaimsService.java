package com.pratik.irda.service;

import com.pratik.irda.entities.PaymentOfClaims;
import com.pratik.irda.repo.ClaimStatusRepo;
import com.pratik.irda.repo.PaymentOfClaimsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentOfClaimsService {

    @Autowired
    PaymentOfClaimsRepo  paymentOfClaimsRepo;
    public PaymentOfClaims getPaymentOfClaims(String month,int year)
    {
        PaymentOfClaims paymentOfClaims= paymentOfClaimsRepo.findPaymentOfClaimsByMonthAndYear(month,year);
        if(paymentOfClaims!=null)
        {
            return paymentOfClaims;
        }
        else
        {
            throw  new RuntimeException("No data present with:"+month+"and year:"+year);
        }
    }

}
