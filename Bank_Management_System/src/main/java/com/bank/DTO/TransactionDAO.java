package com.bank.DTO;

import org.springframework.data.repository.core.support.TransactionalRepositoryFactoryBeanSupport;
import org.springframework.stereotype.Repository;

import com.bank.entity.TransactionDetails;
import com.bank.repository.TransactionRepository;

@Repository
public class TransactionDAO
{
	private TransactionRepository transactionRepository;
	 public  TransactionDetails saveTransactionDetails(TransactionDetails transactionDetails)
	 {
		return transactionRepository.save(transactionDetails);
		 
	 }
}
