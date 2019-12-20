<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegistrationPage</title>
</head>
<body>
	<form action="LoginRegister" method="post">
		<table style="background-color:blue;">
			<tr>
				<td><h2 style="color: yellow;">Registration Page</h2></td>
			</tr>
			<tr>
				<td>UserId :</td>
				<td><input type="text" name="UserName"></td>
			</tr>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="Name"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="password1"></td>
			</tr>
			<tr>
				<td>Re-type-Password :</td>
				<td><input type="text" name="password2"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="submit" value="Register"></td>
			</tr>
		</table>
	</form>

</body>
</html>