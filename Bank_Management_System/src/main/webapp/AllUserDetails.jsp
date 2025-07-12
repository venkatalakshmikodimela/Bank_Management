<%@page import="com.bank.entity.BankUserDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h4>All User Details</h4>	
		<form action="allUserDetails"></form>
		<% List<BankUserDetails> list = (List<BankUserDetails>) request.getAttribute("Listofuserdetails");%>
		<%=list %>
		
		<span>Total User Count : <%=list.size() %></span>
		<form action="filteruser">
		<input placeholder="Search by Using Name or Emailid" name="username">
		<button type="submit">Submit</button>
		</form>
		<table border="1">
		<tr>
		<th>UserName</th>
		<th>User Emailid</th>
		<th>User Mobile number</th>
		<th>User Aadhar number</th>
		<th>User Address</th>
		<th>Gender</th>
		</tr>
		
		<%for(BankUserDetails bankUserDetails:list){ %>
		
		<tr>
		<td><%=bankUserDetails.getUsername() %></td>
		<td><%=bankUserDetails.getEmailid() %></td>
		<td><%=bankUserDetails.getMobilenumber() %></td>
		<td><%=bankUserDetails.getAadharnumber() %></td>
		<td><%=bankUserDetails.getAddress() %></td>
		<td><%=bankUserDetails.getGender() %></td>
		<td><button>Delete</button></td>
		
		<td><form action="updateuserbyusingid">
		<input value=<%=bankUserDetails.getUserid() %> hidden="true" name="id">
		<button type="submit">Update</button></form>
		</td>
		</tr>
		
		<%} %>
		
		</table>
</body>
</html>