package com.student.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentDetails;
import com.student.repository.StudentRepository;

@Repository
public class StudentDAO
{
	@Autowired
	 private StudentRepository studentRepository;
	public StudentDetails insertStudentDetailsObject(StudentDetails studentDetails)
	{
		return studentRepository.save(studentDetails);
	}
	
	public List<StudentDetails> getAllStudentDetails()
	{
		return studentRepository.findAll();
	}
	
	public StudentDetails getStudentDetailsByUsingMobileNumber(long mobilenumber)
	{
		return studentRepository.findByMobilenumber(mobilenumber);
	}
	
	public void deleteStudentDetails(StudentDetails studentDetails)
	{
		studentRepository.delete(studentDetails);
	}
	
	public int deleteStudentDetailsByUsingMobileNumber(long mobilenumber)
	{
		return studentRepository.removeByMobilenumber(mobilenumber);
	}
	
	
	public List<StudentDetails> getStudentDetailsbyUsingNameOrEmailOrGender(String filterdata)
	{
		return studentRepository .selectStudnetDetailsByUsingNameOrEmailOrGender(filterdata);
	
	}
}
