<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="registrationrequest">
	 <h1 style="color: darkblue;font-family: cursive;">User Registration</h1>
		<input placeholder="Enter USer Name" name="name">
		<br>
		<input placeholder="Enter User Emailid" name="emailid">
		<br>
		<input placeholder="Enter User Aadhar Number" name="aadharnumber">
		<br>
		<input placeholder="Enter User Mobile Number" name="mobilenumber">
		<br>
		<input placeholder="Enter User Gender" name="gender">
		<br>
		<input placeholder="Enter User Address" name="address">
		<br>
		<input placeholder="Enter User Amount" name="amount">
		<br>
		<input type="submit" value="Registration">
		</form>
		<%String msg = (String) request.getAttribute("exceptionmsg"); %>
		<%=msg %>
		</center>
</body>
</html>