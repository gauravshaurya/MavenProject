<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <form action=update method="post" >
            <table>
            	<tr>
                    <td>Email ID:</td>
                    <td><input type="email" name=email required/></td>
                </tr>
             	<tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstname" size="15" required/></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastname" size="15" required/></td>
                </tr>
                <tr>
                    <td>Gender :</td>
                    <td>
                    <input type="radio" name="gender" value="M" />Male
                    <input type="radio" name="gender" value="F" />Female
                    </td>
                </tr>
                <tr>
                    <td>City:</td>
                   	<td>
                   	<select name="city">
                   		  <option value="none">--select your city--</option>
			  			  <option value="Noida">Noida</option>
						  <option value="New Delhi">New Delhi</option>
						  <option value="Gurgaon">Gurgaon</option>
						  <option value="Ghaziabad">Ghaziabad</option>
						  <option value="Greater Noida">Greater Noida</option>
					</select>
					</td>
                </tr>
                <tr>
                    <td>Role:</td>
                    <td><input type="text" name="role" size="15" required/></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="password" size="15" required/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="register"/>Update</td>
                </tr>
        
            </table>
        </form>
        </fieldset>
</body>
</html>