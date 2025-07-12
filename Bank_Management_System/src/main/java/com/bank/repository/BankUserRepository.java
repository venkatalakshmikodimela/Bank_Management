package com.bank.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.DTO.UserDetails;
import com.bank.entity.BankUserDetails;

public interface BankUserRepository extends JpaRepository<BankUserDetails, Integer>
{
  List<BankUserDetails>	findByUsername(String username);
  List<BankUserDetails> findByUsernameOrEmailid(String username,String emailid);  List<BankUserDetails> findByStatus(String status);
  BankUserDetails findAccountnumber(long accountnumber,long mobilenumber);
  BankUserDetails findByPinnumber(int pinnumber);

}