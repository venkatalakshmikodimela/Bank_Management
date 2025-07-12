package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.entity.AdminUserDetails;

public interface AdminReposiroty extends JpaRepository<AdminUserDetails, String>
{
	
}
