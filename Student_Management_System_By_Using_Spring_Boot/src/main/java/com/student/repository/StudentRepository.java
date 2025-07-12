package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.entity.StudentDetails;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<StudentDetails,Integer>
{
	StudentDetails findByMobilenumber(long mobilenumber);
	@Transactional
	int removeByMobilenumber(long mobilenumber);
	
	//it is used to roll back the data base operations throw any exception at the database and the complete operation at the data base by handling the exception
	
	
	@Query("select student from studentDetails stundent where student.name=?1or student.emailid=?1or student.gender=?1")
	List<StudentDetails> selectStudnetDetailsByUsingNameOrEmailOrGender(String filterdata);
}
