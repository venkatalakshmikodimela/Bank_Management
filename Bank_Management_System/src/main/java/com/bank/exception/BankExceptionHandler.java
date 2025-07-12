package com.bank.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;



@ControllerAdvice
public class BankExceptionHandler 
{
	//@ResponseBody
	@ExceptionHandler(UserDataException.class)
	public String userRelatedExceptionHandler(UserDataException cd,Model model)
	{
		String exceptionmsg =cd.getExceptionmsg();
		model.addAttribute("exceptionmsg",exceptionmsg);
		System.out.println("UserDataException Handled");
		return "UserRegistration";
	}
	
	@ExceptionHandler(InvalidAmountException.class)
	public String invalidAmountRelatedException(InvalidAmountException iae,Model model)
	{
		String exceptionmsg = iae.getExeception();
		model.addAttribute("exceptionmsg",exceptionmsg);
		System.out.println("Msg");
		return "forward:/bank/creditpage";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@ExceptionHandler(ClassNotFoundException.class)
//	public String classNotFoundRelatedExceptionHandler(ClassNotFoundException bd)
//	{
//		System.out.println("User data Exception Handled");
//		
//		return bd.getMessage();
//	}
}