package com.example.connectivity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoanApplicationModel {
	@Id
	private int LoanId;
	private String LoanType;
	private String applicantName;
	private String applicantAddress;
	private String applicantMobile;
	private String applicantEmail;
	private String applicantAadhar;
	private String applicantPan;
	private String applicantSalary;
	private String LoanAmountRequired;
	private String LoanRepaymentMonths;
	public int getLoanId() {
		return LoanId;
	}
	public void setLoanId(int loanId) {
		LoanId = loanId;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantAddress() {
		return applicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}
	public String getApplicantMobile() {
		return applicantMobile;
	}
	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantAadhar() {
		return applicantAadhar;
	}
	public void setApplicantAadhar(String applicantAadhar) {
		this.applicantAadhar = applicantAadhar;
	}
	public String getApplicantPan() {
		return applicantPan;
	}
	public void setApplicantPan(String applicantPan) {
		this.applicantPan = applicantPan;
	}
	public String getApplicantSalary() {
		return applicantSalary;
	}
	public void setApplicantSalary(String applicantSalary) {
		this.applicantSalary = applicantSalary;
	}
	public String getLoanAmountRequired() {
		return LoanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		LoanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return LoanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		LoanRepaymentMonths = loanRepaymentMonths;
	}
}
