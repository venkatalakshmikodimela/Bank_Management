package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.DTO.AdminDetailsDTO;
import com.bank.DTO.UserDetails;
import com.bank.service.AdminService;
@Controller
public class AdminController 
{
	@Autowired
	AdminService adminService;

	@RequestMapping("/admin")
	public String adminRegistrationPage()
	{	
		System.out.println("AdminRegistrationPage method is called");
		return "AdminRegistration";
	}
	
	@RequestMapping("/adminregistrationrequest")
	public String adminRegistrationRequest(AdminDetailsDTO adminDetailsDTO)
	{
		if(adminService.AdminRegistration(adminDetailsDTO))
		{
			return "AdminLogin";
		}
		return null;
	}
	
	@RequestMapping("/adminloginpage")
	public String adminLoginPage()
	{
		return "AdminLogin";
	}
	
	
	@ResponseBody
	@RequestMapping("/adminlogin")
	public String adminLoginRequest(@RequestParam("emailid") String emailid)
	{
		if(adminService.adminLogin(emailid))
		{
			return "AdminOperations";
		}
		return null;
	}
}
