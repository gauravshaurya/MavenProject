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
<hr/>		
<fieldset>
		<legend>Address Details</legend>
        <form action=address method="post" >
            <table>
            	<tr>
                    <td>House No:</td>
                    <td><input type="text" name="hno" required/></td>
                </tr>
             	<tr>
                    <td>Address Line1:</td>
                    <td><input type="text" name="addressline1"  required/></td>
                </tr>
                <tr>
                    <td>Address Line2:</td>
                    <td><input type="text" name="addressline2"  required/></td>
                </tr>
                <tr>
                    <td>City :</td>
                    <td><input type="text" name="city" size="15" required/></td>
                </tr>
                <tr>
                    <td>State:</td>
                 	<td><input type="text" name="state" size="15" required/></td>
                </tr>
                <tr>
                    <td>Pincode:</td>
                    <td><input type="text" name="pincode" size="15" required/></td>
                </tr>
                <tr>
                    <td><button type="submit" value="address">Add Address</button></td>
                </tr>
        
            </table>
        </form>
        </fieldset>
</body>
</html>