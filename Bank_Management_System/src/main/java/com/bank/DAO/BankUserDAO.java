package com.bank.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bank.DTO.UserDetails;
import com.bank.entity.BankUserDetails;
import com.bank.repository.BankUserRepository;
@Repository
public class BankUserDAO
{
	@Autowired
	private BankUserRepository bankUserReposiroty;
	
	public BankUserDetails insertBankUserDetails(BankUserDetails bankUserDetails)
	{
		BankUserDetails save = bankUserReposiroty.save(bankUserDetails);
		System.out.println(bankUserReposiroty.getClass());
		return save;
	}
	public List<BankUserDetails> getALlUserDetails()
	{
		return bankUserReposiroty.findAll();
	}
	
	public boolean removeBankUserDetailsByUsingId(int id)
	{
		bankUserReposiroty.deleteById(id);
		return true;
	}

	public BankUserDetails getUserDetailsByUsingId(int userid)
	{
		Optional<BankUserDetails> byid = bankUserReposiroty.findById(userid);
			BankUserDetails bankUserDetails = byid.get();
			return bankUserDetails;
	}
	
	public BankUserDetails UpdateUserDetails(BankUserDetails bankUserDetails)
	{
		return bankUserReposiroty.save(bankUserDetails);
	}
	
	
	public List<BankUserDetails> getUserDetailsByUsingName(String username) 
	{
		return bankUserReposiroty.findByUsernameOrEmailid(username,username);
		
	}
	
	public List<BankUserDetails> selectAllPendingDetails()
	{
		return bankUserReposiroty.findByStatus("Pending");
	}
	
	
	public BankUserDetails getUserDetailsByUsingPINNumber(int pin)
	{
		return bankUserReposiroty.findByPinnumber(pin);
	}
	
		
	public BankUserDetails selectBankUserDetailsByUsingAccountNumberOrMobileNumber(long accountnumberORmobilenumber)
	{
		return  bankUserReposiroty.findAccountnumber(accountnumberORmobilenumber, accountnumberORmobilenumber);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}







//save.findbyId, findby















