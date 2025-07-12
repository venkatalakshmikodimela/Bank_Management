package com.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankUserDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String username;
	private String emailid;
	private long aadharnumber;
	private long mobilenumber;
	private String gender;
	private String address;
	private double amount;
	private int accountnumber;
	private int pinnumber;
	private String status;
	
	public BankUserDetails() 
	{
		
	}

	public BankUserDetails(int userid, String username, String emailid, long aadharnumber, long mobilenumber,
			String gender, String address, double amount, int accountnumber, int pinnumber, String status) {
		super();
		this.userid = userid;
		this.username = username;
		this.emailid = emailid;
		this.aadharnumber = aadharnumber;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
		this.amount = amount;
		this.accountnumber = accountnumber;
		this.pinnumber = pinnumber;
		this.status = status;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public long getAadharnumber() {
		return aadharnumber;
	}

	public void setAadharnumber(long aadharnumber) {
		this.aadharnumber = aadharnumber;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getPinnumber() {
		return pinnumber;
	}

	public void setPinnumber(int pinnumber) {
		this.pinnumber = pinnumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BankUserDetails [userid=" + userid + ", username=" + username + ", emailid=" + emailid
				+ ", aadharnumber=" + aadharnumber + ", mobilenumber=" + mobilenumber + ", gender=" + gender
				+ ", address=" + address + ", amount=" + amount + ", accountnumber=" + accountnumber + ", pinnumber="
				+ pinnumber + ", status=" + status + "]";
	}



	
}
