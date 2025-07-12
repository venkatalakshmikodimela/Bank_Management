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
		<h4>Admin Registration</h4>
	<form action="adminregistrationrequest">	
		<input placeholder="Enter the emailid" name="emailid">
		<br>
		<input placeholder="Enter the password" name="password">
		<br>
		<input placeholder="Enter the role" name="role">
		<br>
		<button type="submit">Submit</button>
		</form>
		<% String msg = (String) request.getAttribute("adminexceptionmsg"); %>
		<% if(msg!=null) {%>
		<%=msg %>
		<% }%>
	</center>
</body>
</html>