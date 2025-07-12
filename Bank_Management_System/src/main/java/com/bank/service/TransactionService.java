package com.bank.service;

import org.springframework.stereotype.Service;

import com.bank.DTO.TransactionDAO;
import com.bank.entity.TransactionDetails;

@Service
public class TransactionService 
{
	TransactionDAO transactionDAO;
	
     public	boolean insertTransactionDetails(TransactionDetails transactionDetails)
	{
    	 TransactionDetails details = transactionDAO.saveTransactionDetails(transactionDetails);
    	 if(details.getTransactionid()>0)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
	}
}
