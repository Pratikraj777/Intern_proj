package com.pratik.irda.controller;

import com.pratik.irda.entities.ClaimStatus;
import com.pratik.irda.service.ClaimStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClaimStatusController {
    @Autowired
    ClaimStatusService claimStatusService;
    @GetMapping("irda/claimStatus/{month}/{year}")
    List<ClaimStatus> getClaimStatusByMonthYear(@PathVariable String month,@PathVariable int year)
    {
        return claimStatusService.getClaimStatusByMonthYear(month,year);
    }
    
    
}
