<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>CustomerLoginPage</h4>
	<form action="customerlogin">
		<input placeholder="Enter User Mobilenumber Or Accountnumber" name="mobilenumber">
		<br>
		<input type="submit" value="Login">
	</form>
	<% String msg = (String) request.getAttribute("customerloginexceptionmsg"); %>
		<% if(msg!=null) {%>
		<%=msg %>
		<% }%>
</body>
</html>