package com.pratik.irda.entities;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


@Entity
@Table(name="paymentOfClaims")
public class PaymentOfClaims {
	@Id
	private int reportId;
	
//	@Min(value = 0, message="The value must be positive")
	@Positive
	@NotNull
	private int payment;
	private String month;
	private int year;
	
	public PaymentOfClaims(int reportId, int payment, String month, int year) {
		super();
		this.reportId = reportId;
		this.payment = payment;
		this.month = month;
		this.year = year;
	}
	public PaymentOfClaims() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PaymentOfClaims [reportId=" + reportId + ", payment=" + payment + ", month=" + month + ", year=" + year
				+ "]";
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getPayment() {
		return payment;
	}
	public void setPayment(int payment) {
		this.payment = payment;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
