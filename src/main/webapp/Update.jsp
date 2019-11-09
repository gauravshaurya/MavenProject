<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<h1 align="center">Registration Form</h1>
<hr/>		
<fieldset>
        <form action="update" method="post" >
            <table>
            
            	<tr>
                    <td>User ID:</td>
                    <td><input type="number" name="userId" value="${obj.userId}" readonly="true" /></td>
                </tr>
            	<tr>
                    <td>Email ID:</td>
                    <td><input type="email" name="email" value="${obj.email}" /></td>
                </tr>
             	<tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstname" size="15" value="${obj.firstName}"/></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastname" size="15" value="${obj.lastName}"/></td>
                </tr>
                <tr>
                    <td>Gender :</td>
                     <td><input type="text" name="gender" size="15" value="${obj.gender}"/></td>
                </tr>
                <tr>
                    <td>City:</td>
                   	<td><input type="text" name="city" size="15" value="${obj.city}"/></td>
                </tr>
                <tr>
                    <td>Role:</td>
                    <td><input type="text" name="role" size="15" value="${obj.role }"/></td>
                </tr>
                
                <tr>
                    <td><input type="submit" value="Update"/></td>
                </tr>
        
            </table>
        </form>
        </fieldset>
</body>
</html>