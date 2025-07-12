package com.bank.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.DAO.BankUserDAO;
import com.bank.DTO.UserDetails;
import com.bank.entity.BankUserDetails;
import com.bank.entity.TransactionDetails;
import com.bank.exception.InvalidAmountException;
import com.bank.exception.NoDataFoundException;
import com.bank.exception.UserDataException;

@Service
public class UserService 
{
	@Autowired
	BankUserDAO bankUserDAO;
	TransactionService transactionService;
	
	public  void UserRegistration(UserDetails userDetails)
	{
		BankUserDetails bankUserDetails = new BankUserDetails();
	    
		if(userDetails.getEmailid().contains("@gmail.com"))
		{
			
		}
		else
		{
			throw new UserDataException("Invalid Emailid");
		}
		
		long aadharnumber = userDetails.getAadharnumber();
		long temp=aadharnumber;
		int count=0;
		while(temp!=0)
		{
			count++;
			temp = temp/10;
			
		}
		if(count==12)
		{
			
		}
		else
		{
			throw new UserDataException("invalid aadhar number");
		}
		
		
		long mobilenumber = userDetails.getMobilenumber();
		if(mobilenumber>=6000000000l &&  mobilenumber<=9999999999l)
		{
			
		}
		else
		{
			throw new UserDataException("Invalid mobile number");
		}
		//BankUserDetails bankUserDetails = new BankUserDetails();
		bankUserDetails.setUsername(userDetails.getName());
		bankUserDetails.setEmailid(userDetails.getEmailid());
		bankUserDetails.setAadharnumber(userDetails.getAadharnumber());
		bankUserDetails.setMobilenumber(userDetails.getMobilenumber());
		bankUserDetails.setAddress(userDetails.getAddress());
		bankUserDetails.setGender(userDetails.getGender());
		bankUserDetails.setAmount(userDetails.getAmount());
		bankUserDetails.setAccountnumber(0);
		bankUserDetails.setPinnumber(0);
		bankUserDetails.setStatus("pending");
		bankUserDAO.insertBankUserDetails(bankUserDetails);
	}
	
	public List<BankUserDetails> SelectAllUserDetails()
	{
		return bankUserDAO.getALlUserDetails();
		
	}
	
	public boolean deleteUserDetails(int userid)
	{
		return bankUserDAO.removeBankUserDetailsByUsingId(userid);
	}

	public BankUserDetails updateUserDetailsByUsingId(int userid) {
		
		return bankUserDAO.getUserDetailsByUsingId(userid);
	}
	
	public void updateUserDetails(UserDetails userDetails)
	{
		BankUserDetails bankUserDetails = updateUserDetailsByUsingId(userDetails.getId());
		bankUserDetails.setUsername(userDetails.getName());
		bankUserDetails.setEmailid(userDetails.getEmailid());
		bankUserDetails.setMobilenumber(userDetails.getMobilenumber());
		bankUserDetails.setAddress(userDetails.getAddress());
		bankUserDAO.UpdateUserDetails(bankUserDetails);
	}
	
	public List<BankUserDetails> filterUserByUsingName(String username)
	{
		return bankUserDAO.getUserDetailsByUsingName(username);
	}
	
	
	public List<BankUserDetails> getAllPendingDetails()
	{
		List<BankUserDetails> details = bankUserDAO.selectAllPendingDetails();
		if(details.size()!=0)
		{
			return details;
		}
		else
		{
			throw new UserDataException();
		}
	}
	

	public List<BankUserDetails> filterPendingUserByUsingName(String username)
	{
		List<BankUserDetails> list =  bankUserDAO.getUserDetailsByUsingName(username);
		List<BankUserDetails> listoffilterpendingdetails = list.stream()
				.filter((user) -> user.getStatus().equalsIgnoreCase("Pending"))
				.collect(Collectors.toList());
		if(listoffilterpendingdetails.size()!=0)
		{
			return listoffilterpendingdetails;
		}
		else
		{
			throw new UserDataException();
		}
	}
	
	public BankUserDetails acceptPendingDetails(int id)
	{
		Random random = new Random();
		int accountnumber = random.nextInt(10000000);
		if(accountnumber<1000000)
		{
			accountnumber+=1000000;
		}
		int pinnumber = random.nextInt(10000);
		if(pinnumber<1000)
		{
			pinnumber+=1000;
		}
		
		BankUserDetails userdetails = bankUserDAO.getUserDetailsByUsingId(id);
		userdetails.setAccountnumber(accountnumber);
		userdetails.setPinnumber(pinnumber);
		userdetails.setStatus("Accepted");
		 return bankUserDAO.UpdateUserDetails(userdetails);
	}
	
	public boolean creditOperation(double amount, int pinnumber)
	{
		if(amount>0)
		{
			BankUserDetails userDetails = bankUserDAO.getUserDetailsByUsingPINNumber(pinnumber);
			if(userDetails!=null)
			{
			double databaseamount = userDetails.getAmount();
			double totalamount = amount+databaseamount;
			userDetails.setAmount(totalamount);
			BankUserDetails bankUserDetails =  bankUserDAO.UpdateUserDetails(userDetails);
			if(bankUserDetails.getAmount()==totalamount) {
				TransactionDetails transactionDetails = new TransactionDetails();
				transactionDetails.setAccountnumber(bankUserDetails.getAccountnumber());
				transactionDetails.setBalanceamount(totalamount);
				transactionDetails.setTrasactionamount(amount);
				transactionDetails.setTransactiondate(LocalDate.now());
				transactionDetails.setTransactiontime(LocalTime.now());
				transactionDetails.setTransactionType("CREDIT");
				if(transactionService.insertTransactionDetails(transactionDetails))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		else
		{
			throw new InvalidAmountException("invalid Pin Number");
		}
		}
			else
			{
				throw new InvalidAmountException("Invalid Amount");
				
			}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
