package com.cg.CreditCard.entity;

import java.time.LocalDate;

public class Statement {
	
	private long statementId;
	private double dueAmount;
	private LocalDate billingDate;
	private LocalDate dueDate;
	private Customer customer;
	
	public Statement(long statementId, double dueAmount, LocalDate billingDate, LocalDate dueDate, Customer customer) {
		super();
		this.statementId = statementId;
		this.dueAmount = dueAmount;
		this.billingDate = billingDate;
		this.dueDate = dueDate;
		this.customer = customer;
	}

	public long getStatementId() {
		return statementId;
	}

	public void setStatementId(long statementId) {
		this.statementId = statementId;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Statement [statementId=" + statementId + ", dueAmount=" + dueAmount + ", billingDate=" + billingDate
				+ ", dueDate=" + dueDate + ", customer=" + customer + "]";
	}
	
}
