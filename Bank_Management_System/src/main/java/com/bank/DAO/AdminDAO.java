package com.bank.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.entity.AdminUserDetails;
import com.bank.repository.AdminReposiroty;
import com.bank.repository.BankUserRepository;

@Repository
public class AdminDAO 
{
	@Autowired
	 private AdminReposiroty adminReposiroty;
	public AdminUserDetails insertAdminDetails(AdminUserDetails adminUserDetails)
	{
		return adminReposiroty.save(adminUserDetails);
	}
	
	public boolean getAdminDetailsByUsingEmailid(String emailid)
	{
		//Selection operation
		Optional<AdminUserDetails> byId =adminReposiroty.findById(emailid) ;
		return byId.isPresent();
	}
}
