package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.DAO.AdminDAO;
import com.bank.DTO.AdminDetailsDTO;
import com.bank.entity.AdminUserDetails;
import com.bank.exception.AdminDataException;
import com.bank.exception.AdminLoginException;
import com.bank.exception.UserDataException;

@Service
public class AdminService 
{
	@Autowired
	AdminDAO adminDAO;
	
	public boolean AdminRegistration(AdminDetailsDTO adminDetailsDTO)
	{
		
		if(adminDetailsDTO.getEmailid().contains("@gmail.com"))
		{
			
		}
		else
		{
			throw new AdminDataException("Invalid Emailid");
		}

		
		AdminUserDetails adminUserDetails = new AdminUserDetails();
		
		adminUserDetails.setEmailid(adminDetailsDTO.getEmailid());
		adminUserDetails.setPassword(adminDetailsDTO.getPassword());
		adminUserDetails.setRole(adminDetailsDTO.getRole());
		AdminUserDetails details = adminDAO.insertAdminDetails(adminUserDetails);
		if(details!=null)
		{
			return true;
		}
		else
		{
			throw new AdminDataException("Invalid details");
		}
	}
	public boolean adminLogin(String emailid)
	{
		if(adminDAO.getAdminDetailsByUsingEmailid(emailid))
		{
		return false;
		}
		else
		{
			throw new AdminLoginException("Invalid emailid");
		}
	}
	
}
