<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>AdminLogin</h4>
	<form action="adminlogin">
		<input placeholder="Enter admin Emailid" name="emailid">
		<br>
		<input type="submit" value="Login">
	
	<% String msg = (String) request.getAttribute("adminloginexceptionmsg"); %>
		<% if(msg!=null) {%>
		<%=msg %>
		<% }%>
		</form>
</body>
</html>