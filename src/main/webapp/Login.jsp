<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login PAge</title>
</head>
<body>
 <div align="center">
	
		<form action="login" method="post">
			<fieldset>
				<legend>Login Form</legend>
				<table>
					<tr>
						<td>User Id :</td>
						<td><input type="text" name="userId"/>
					</tr>
					<tr>
						<td>Password : </td>
						<td><input type="password" name="password"/>
					</tr>
					<tr>
						<td></td>
						<td>
						<input type="submit" value="Login"/>
						</td>
					</tr>
				</table>
			</fieldset>
		</form>
		
	</div>
</body>
</html>