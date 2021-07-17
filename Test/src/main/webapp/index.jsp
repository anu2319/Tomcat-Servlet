<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="styles.css">
</head>
<style>
@charset "ISO-8859-1";

body
{
	font-family: Arial, Helvetica, sans-serif;
	font-size: 11pt;
	margin-left: 2em;
	margin-right: 2em;
}
h1
{
	color: blue;
}
label
{
	float: left;
	width: 6em;
	margin-bottom: 0.5em;
}
input[type="text"],input[type="email"],input[type="password"]
{
	width: 15em;
	margin-left: 0.5em;
	margin-bottom: 0.5em;
}
br
{
	clear: both;
}
#submit
{
	margin-left: 0.5em;
}
</style>
<body>
	<h1>email list </h1>
	<p>To Join our email list, enter your name, email and password.</p>
	
	<form action="SignIn" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>	
			<tr>
				<td></td>
				<td><input type="submit" value="login"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>
	