package com.student.controller;

import java.lang.annotation.Retention;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.DAO.StudentDAO;
import com.student.DTO.StudentDTO;
import com.student.config.EmailConfiguration;
import com.student.entity.StudentDetails;
import com.student.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController 
{

   // private final EmailConfiguration emailConfiguration;
	@Autowired
	public StudentService studentService;
	
	
	@RequestMapping("/studentregistrationpage")
	public String studentRegistrationPage()
	{
		return "StudentRegistration";
	}
	
	@ResponseBody
	@RequestMapping("/studentRegistraion")
	public StudentDTO studentRegistration(StudentDTO studentDTO)
	{
		studentService.studentRegistration(studentDTO);
		return studentDTO;
	}
	
	@RequestMapping("/getallstudents")
	public String getAllStudentDetails(Model model)
	{
		List<StudentDetails> allStudents = studentService.getAllStudents();
		model.addAttribute("allStudents",allStudents);
		return "DisplayAllStudentDetails";
	}
	
	
	@RequestMapping("/deletestudentdetails")
	public  String deleteStudentDetails(long mobilenumber)
	{
		if(studentService.deleteStudentDetails(mobilenumber))
		{
		return "redirect:/student/getallstudentdetails";
		}
		else
		{
			return null;
		}
	}
	
	
	
	@RequestMapping("/filterstudentdata")
	public String filterStudentDetailsByusingNameOrGender(String filterdata,Model model)
	{
		List<StudentDetails> filter = studentService.filterStudentDetails(filterdata);
		model.addAttribute("filterdata",filter);
		return "DisplayAllStudentDetails";
	}
}
