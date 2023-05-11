package com.pratik.irda.controller;

import com.pratik.irda.entities.PaymentOfClaims;
import com.pratik.irda.entities.PendingStatusReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pratik.irda.repo.PendingStatusReportRepo;
import com.pratik.irda.service.PaymentOfClaimsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class PendingStatusReportController {
	
	@Autowired
	private PendingStatusReportRepo pendingRepo;
	
	@GetMapping("/irda/paymentStatus/report/<month>/<year> ")
	public List<PendingStatusReport> getPaymentStatus(@PathVariable String month, @PathVariable int year)
	{
		return  null;
	}
	@GetMapping("/irda/paymentStatus/pull/<month>/<year> ")
	public PaymentOfClaims addPaymentStatus(@PathVariable String month, @PathVariable int year, @RequestBody PendingStatusReport report)
	{
//		try {
//			return  PaymentOfClaimsService.getPaymentOfClaims(month,year);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		};
		return null;
	}
	
	


}
