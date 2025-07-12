package com.bank.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdminDataExceptionHandler
{
	@ExceptionHandler(AdminDataException.class)
	public String adminDataRelatedExceptionHandler(AdminDataException ade,Model model)
	{
		String exceptionmsg =ade.getExceptionmsg();
		model.addAttribute("adminexceptionmsg",exceptionmsg);
		return "AdminRegistration";
	}
	@ExceptionHandler(AdminLoginException.class)
	public String adminInvalidDataExceptionHandler(AdminLoginException ale,Model model)
	{
		String exceptionmsg = ale.getExceptionmsg();
		model.addAttribute("adminloginexceptionmsg",exceptionmsg);
		System.out.println("AdminLoginException Handled");
		return "AdminLogin";
	}
}
