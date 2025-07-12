package com.bank.DTO;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;


public class UserDetails
{
	private int id;
	private String name;
	private String emailid;
	private long aadharnumber;
	private long mobilenumber;
	private String gender;
	private String address;
	private double amount;	
	
	public UserDetails() {
	
	}

	public UserDetails(int id, String name, String emailid, long aadharnumber, long mobilenumber, String gender,
			String address, double amount) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.aadharnumber = aadharnumber;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.address = address;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", emailid=" + emailid + ", aadharnumber=" + aadharnumber
				+ ", mobilenumber=" + mobilenumber + ", gender=" + gender + ", address=" + address + ", amount="
				+ amount + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmailid()=" + getEmailid()
				+ ", getAadharnumber()=" + getAadharnumber() + ", getMobilenumber()=" + getMobilenumber()
				+ ", getGender()=" + getGender() + ", getAddress()=" + getAddress() + ", getAmount()=" + getAmount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	

	
}