package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bank.DTO.UserDetails;
import com.bank.entity.BankUserDetails;
import com.bank.service.UserService;

@Controller
public class BankController 
{
	@Autowired
	private UserService userService;
	@RequestMapping("/registrationPage")
	public String userRegistrationPage()
	{	
		System.out.println("UserRegistrationPage method is called");
		return "UserRegistration";
	}
	
	@RequestMapping("/registrationrequest")
	public String registrationRequest(UserDetails userDetails)
	{
		userService.UserRegistration(userDetails);
		
		return "redirect:/bank/userloginpage";
	}
	
	@RequestMapping("/userloginpage")
	public String userLoginPage()
	{
		return "UserLogin";
	}
	
	
	
	
	@RequestMapping("/alluserdetails")
	public String getAllBankUserDetails(Model model)
	{
		List<BankUserDetails> list = userService.SelectAllUserDetails();
		model.addAttribute("Listofuserdetails",list);
		return "AllUserDetails";
	}
	
	
	@ResponseBody
	@RequestMapping("/deleteuserdetails")
	public String deleteBankUsderDetails(int userid)
	{
		System.out.println(userid);
		userService.deleteUserDetails(userid);
		return "redirect:/bank/allUserDetails";
	}
	
	@RequestMapping("/updateuserdetailsbyusingid")
	public String updateUserDetailsByUsingId(@RequestParam("id") int userid, Model model )
	{
		BankUserDetails bankUserDetails = userService.updateUserDetailsByUsingId(userid);
		model.addAttribute("bankUserDetails",bankUserDetails);
		return "UpdateUserDetails";
	}

	
	@RequestMapping("/updateuserdetails")
	public String getUpdatedDetailsRequest(UserDetails userDetails)
	{
		System.out.println(userDetails);
		userService.updateUserDetails(userDetails);
		return "redirect:/bank/allBankUserDetails";
	}
	
	@RequestMapping("/filteruser")
	public String filterUserDetailsByUsingName(String username,Model model)
	{
		//System.out.println(username);
		List<BankUserDetails> list = userService.filterUserByUsingName(username);
		System.out.println(list);
		model.addAttribute("listofbankuserdetails", list);
		return "AllUserDetails";
	}
	
	
	@RequestMapping("/allpendingdetails")
	public String allUserPendingDetails(Model model)
	{
		List<BankUserDetails> allPendingDetails = userService.getAllPendingDetails();
		System.out.println(allPendingDetails);
		model.addAttribute("allPendingDetails",allPendingDetails);
		return "AllPendingDetails";
	}
	
	@RequestMapping("/filterpendingdetais")
	public String filterPendingUserDetailsByUsingNameOrEmailid(String username,Model model)
	{
		List<BankUserDetails> listoffilterpendingdetails = userService.filterPendingUserByUsingName(username);
		model.addAttribute("allpendingdetails",listoffilterpendingdetails);
		return "AllUserDetails";
	}
	
	@RequestMapping("/acceptpendingdetails")
	public void acceptPendingDetails(int id)
	{
		BankUserDetails bankUserDetails = userService.acceptPendingDetails(id);
		System.out.println(bankUserDetails);
	}
	
	@RequestMapping("/creditpage")
	public String getCreditPage()
	{
		return "CreditAmount";
	}
	
	@RequestMapping("/useroperationpage")
	public String UserOperationPage()
	{
		return "UserOperation";
	}
	
	@RequestMapping("/creditrequest")
	public String getCreditRequest(double amount, int pinnumber)
	{
		boolean status = userService.creditOperation(amount, pinnumber);
		if(status) 
		{
			return "redirect:/bank/useroperationpage";
		}
		return null;
		
	}
	
	
	
	
	
	
}
