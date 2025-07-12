package com.bank.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionid;
	private double trasactionamount;
	private LocalDate transactiondate;
	private LocalTime transactiontime;
	private String transactionType;
	private long accountnumber;
	private double balanceamount;
	
	
	public TransactionDetails() 
	{
		super();
	}


	public TransactionDetails(int transactionid, double trasactionamount, LocalDate transactiondate,
			LocalTime transactiontime, String transactionType, long accountnumber, double balanceamount) {
		super();
		this.transactionid = transactionid;
		this.trasactionamount = trasactionamount;
		this.transactiondate = transactiondate;
		this.transactiontime = transactiontime;
		this.transactionType = transactionType;
		this.accountnumber = accountnumber;
		this.balanceamount = balanceamount;
	}


	public int getTransactionid() {
		return transactionid;
	}


	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}


	public double getTrasactionamount() {
		return trasactionamount;
	}


	public void setTrasactionamount(double trasactionamount) {
		this.trasactionamount = trasactionamount;
	}


	public LocalDate getTransactiondate() {
		return transactiondate;
	}


	public void setTransactiondate(LocalDate transactiondate) {
		this.transactiondate = transactiondate;
	}


	public LocalTime getTransactiontime() {
		return transactiontime;
	}


	public void setTransactiontime(LocalTime transactiontime) {
		this.transactiontime = transactiontime;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public long getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}


	public double getBalanceamount() {
		return balanceamount;
	}


	public void setBalanceamount(double balanceamount) {
		this.balanceamount = balanceamount;
	}


	@Override
	public String toString() {
		return "TransactionDetails [transactionid=" + transactionid + ", trasactionamount=" + trasactionamount
				+ ", transactiondate=" + transactiondate + ", transactiontime=" + transactiontime + ", transactionType="
				+ transactionType + ", accountnumber=" + accountnumber + ", balanceamount=" + balanceamount + "]";
	}
	
	
}
