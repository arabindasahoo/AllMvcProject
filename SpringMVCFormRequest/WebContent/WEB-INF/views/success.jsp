<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<div align="center">
		<h1>Successfully Registered</h1>
		<a href="/SpringMVCFormRequest">Back</a>
		<table>
			<tr>
				<td>User Name</td>
				<td>${user.name}</td>
			</tr>

			<tr>
				<td>Email</td>
				<td>${user.email}</td>
			</tr>

			<tr>
				<td>Age</td>
				<td>${user.age}</td>
			</tr>

			<tr>
				<td>Age</td>
				<td>${user.country}</td>
			</tr>

		</table>
	</div>
</body>
</html>