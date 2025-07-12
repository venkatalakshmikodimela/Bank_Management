package com.bank.DTO;

public class AdminDetailsDTO 
{
	private String emailid;
	private String password;
	private String role;
	
	
	public AdminDetailsDTO()
	{
		
	}


	public AdminDetailsDTO(String emailid, String password, String role) {
		super();
		this.emailid = emailid;
		this.password = password;
		this.role = role;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "AdminDetailsDTO [emailid=" + emailid + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
