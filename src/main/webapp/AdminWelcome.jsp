<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<div align="right">
				Welcome ${sessionScope.uObj.firstName} ${uObj.lastName}
		</div>
		<div align="center">
			<h1>Welcome Admin</h1>
			<a href="ViewProfile.jsp">View Profile</a><br/>
			<a href="Address.jsp">Add Address</a><br/>
			<a href="ViewAddresses.jsp">View Addresses</a><br/>
			<a href="viewAllUsers">View All Users</a><br/>
			<a href="">Change Password</a><br/>
			<a href="">Logout</a>
		</div>
	</body>
</html>