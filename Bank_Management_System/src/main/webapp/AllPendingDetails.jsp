<%@page import="java.lang.Character.Subset"%>
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
	<h2>All Pending Details</h2>
	<form action="filteruser"></form>
		<% List<BankUserDetails> list = (List<BankUserDetails>) request.getAttribute("allPendingDetails");%>	
		<%=list %>
	
	<span>Total User Count : <%=list.size() %></span>
		<form action="filterpendingdetais">
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
		<td><%String mb = bankUserDetails.getMobilenumber()+""; %>
		<%=mb.substring(0,3)+"****"+mb.subSequence(9, 10) %></td>
		<%String aa = bankUserDetails.getAadharnumber()+""; %>
		<td><%=aa.subSequence(0,3)+"*******"+aa.subSequence(9, 12) %></td>
		<td><%=bankUserDetails.getAddress() %></td>
		<td><%=bankUserDetails.getGender() %></td>
		<td><button>Delete</button></td>
		
			<td><form action="acceptpendingdetails">
		<input value=<%=bankUserDetails.getUserid() %> hidden="true" name="id">
		<button type="submit">accept</button></form>
		</td>
		
		<td><form action="updateuserbyusingid">
		<input value=<%=bankUserDetails.getUserid() %> hidden="true" name="id">
		<button type="submit">reject</button></form>
		</td>
		
		</tr>
		</table>
		<%} %>
	</table>
</body>
</html>