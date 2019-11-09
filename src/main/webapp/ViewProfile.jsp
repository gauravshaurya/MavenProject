<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>View Profile Page</title>
</head>
<body>
	<div align="right">
		Welcome ${sessionScope.uObj.firstName} ${uObj.lastName}
	</div>
	<hr/>
	<div align="center">
		<table border="1">
			<tr>
				<td>User Id:</td>
				<td>${uObj.userId}</td>
			<tr>
				<td>First Name:</td>
				<td>${uObj.firstName}</td>
			</tr>	
			<tr>	
				<td>Last Name:</td>
				<td>${uObj.lastName}</td>
			</tr>
			<tr>	
				<td>Gender:</td>
				<td>${uObj.gender}</td>
			</tr>	
			<tr>	
				<td>City:</td>
				<td>${uObj.city}</td>
			</tr>	
			<tr>	
				<td>Role:</td>
				<td>${uObj.role}</td>
			</tr>	
		</table>
		
	</div>
</body>
</html>