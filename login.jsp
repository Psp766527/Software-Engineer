<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
	<form action="loginRegister" method="post">

		<table
			style="background-size: cover; background-color: blue; margine-left: 40px; margine-left: 20px; margine-top: 100px;">
			<tr>
				<td><h2 style="color: yellow;">Login Page</h2></td>
			</tr>
			<tr>
				<td>UserName :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="password1"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="login"></td>
				<td><a href="registration.jsp">Registration</a></td>
			</tr>
			<tr>
				<td><h3 style="color: red;">${message}</h3><h3 style="color:green;">${successMessage}</h3></td>
			</tr>

		</table>
	</form>
</body>
</html>