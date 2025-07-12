<%@page import="com.bank.entity.BankUserDetails"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Update User Details</h4>
	 <% BankUserDetails bankUserDetails= (BankUserDetails) request.getAttribute("userdetails"); %>
	  
	 <form action="updateuserdetails">
	 <input value=<%=bankUserDetails.getUserid() %> name="id" hidden="true">
	 <br>
	 <input value=<%=bankUserDetails.getUsername() %> name="name">
	 <br>
	 <input value=<%=bankUserDetails.getEmailid() %> name="emailid">
	 <br>
	<input value=<%=bankUserDetails.getMobilenumber() %> name="mobilenumber">
	 <br>
	 <input value=<%=bankUserDetails.getAddress() %> name="address">
	 <br>
	 <input type="submit">
	 
	 </form>
</body>
</html>