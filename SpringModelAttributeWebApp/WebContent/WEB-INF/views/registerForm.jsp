<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List Page</title>
</head>
<body>
	<div align="center">
	
	<form:form action="/SpringModelAttributeWebApp/registerSuccess" method="post" modelAttribute="user">
	<table>
				<tr>
					<td>User Name</td>
					<td><form:input path="name"/></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><form:input path="email"/></td>
				</tr>

				<tr>
					<td>Age</td>
					<td><form:input path="age"/></td>
				</tr>
				<tr>
					<td>Country</td>
					<td>
					<form:select path="country">
					<form:option value="india"></form:option>
					<form:option value="USA"></form:option>
					<form:option value="China"></form:option>
					<form:option value="Russia"></form:option>
					<form:option value="others"></form:option>
					</form:select>
					</td>
				</tr>

				<tr>
					<td><input type="submit" value="submit"></td>
				</tr>
			</table>
	
	
	</form:form>
	</div>
</body>
</html>