package com.pratik.irda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IrdaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(IrdaApplication.class, args);
//		PaymentOfClaimsRepo py =ctx.getBean(PaymentOfClaimsRepo.class);
//
//		PaymentOfClaims pay = new PaymentOfClaims();//creating a object of a new claim
//		pay.setReportId(12);
//		pay.setPayment(2000);
//		pay.setMonth("November");
//		pay.setYear(2001);
//		PaymentOfClaims pay1 = py.save(pay);
//		System.out.println(pay1);

	}

}
