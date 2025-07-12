<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% String msg = (String) request.getAttribute("exceptionmsg") ;%>
	<form action="creditrequest">
	<input placeholder="Enter amount" name="amount">
	<br>
	<input placeholder="Enter pin" name = "pinnumber">
	<br>
	<input type="submit">
	</form>
	<%if(msg!=null) {%>
	<%=msg %>
	<%} %>
</body>
</html>