package com.Workshop.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LoanApplicationModel")
public class LoanApplicationModel {

	@Id
	@GeneratedValue
	@Column(name="LoanId")
	private int loanId;
	@Override
	public String toString() {
		return "LoanApplicationModel [loanId=" + loanId + ", loantype=" + loantype + ", applicantName=" + applicantName
				+ ", applicantAddress=" + applicantAddress + ", applicantMobile=" + applicantMobile + ", applicantEmail="
				+ applicantEmail + ", applicantAadhaar=" + applicantAadhaar + ", applicantPan=" + applicantPan
				+ ", applicantSalary=" + applicantSalary + ", loanAmountRequired=" + loanAmountRequired
				+ ", loanRepaymentMonths=" + loanRepaymentMonths + "]";
	}
	public LoanApplicationModel() {
		super();
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
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
	public String getApplicantAadhaar() {
		return applicantAadhaar;
	}
	public void setApplicantAadhaar(String applicantAadhaar) {
		this.applicantAadhaar = applicantAadhaar;
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
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	@Column(name="LoanType")
	private String loantype;
	@Column(name="ApplicantName")
	private String applicantName;;
	@Column(name="ApplicantAddress")
	private String applicantAddress;
	@Column(name="ApplicantMobile")
	private String applicantMobile;
	@Column(name="ApplicantEmail")
	private String applicantEmail;
	@Column(name="ApplicantAadhaar")
	private String applicantAadhaar;
	@Column(name="ApplicantPan")
	private String applicantPan;
	@Column(name="ApplicantSalary")
	private String applicantSalary;
	@Column(name="LoanAmountRequired")
	private String loanAmountRequired;
	@Column(name="LoanRepaymentMonths")
	private String loanRepaymentMonths;
}
