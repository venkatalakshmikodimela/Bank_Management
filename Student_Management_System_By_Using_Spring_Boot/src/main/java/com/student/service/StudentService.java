package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.DAO.StudentDAO;
import com.student.DTO.StudentDTO;
import com.student.config.EmailConfiguration;
import com.student.entity.StudentDetails;

@Service
public class StudentService {

	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	EmailConfiguration emailConfiguration;
	
	public void studentRegistration(StudentDTO studentDTO)
	{
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setName(studentDTO.getName());
		studentDetails.setEmailid(studentDTO.getEmailid());
		studentDetails.setMobilenumber(studentDTO.getMobilenumber());
		studentDetails.setGender(studentDTO.getGender());
		StudentDetails details = studentDAO.insertStudentDetailsObject(studentDetails);
		if(details.getId()>0)
		{
			System.out.println("Inserted");
			
			emailConfiguration.sendTextMsg(details.getEmailid(), "Student Registration", details.getName()+"Thank You For Registration");
		}
		else
		{
			//throw new Exception
		}
	}

	public List<StudentDetails> getAllStudents()
	{
		List<StudentDetails> list = studentDAO.getAllStudentDetails();
		if(list.size()>0)
		{
			return list;
		}
		else
		{
			
		}
		return null;
			
	}
	
	public boolean deleteStudentDetails(long mobilenumber)
	{
		int mobilenumber2 = studentDAO.deleteStudentDetailsByUsingMobileNumber(mobilenumber);
		if(mobilenumber2!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public List<StudentDetails> filterStudentDetails(String filterdata)
	{
	  List<StudentDetails> list = studentDAO.getStudentDetailsbyUsingNameOrEmailOrGender(filterdata);
	  if(list.size()!=0)
	  {
		  return list;
	  }
	  else
	  {
		  return null;
	  }
	}
}
