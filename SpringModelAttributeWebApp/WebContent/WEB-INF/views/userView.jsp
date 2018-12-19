<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User List</title>
</head>
<body>
	<div align="center">
	<h1>User List Table</h1>
	<a href="/SpringModelAttributeWebApp"></a>
		<table cellspacing="4" cellpadding="4" border="1">
			<tr>
				<td>Name:</td>
				<td>Email:</td>
				<td>Age:</td>
				<td>Country:</td>
			</tr>
			<c:forEach var="user" items="${listUser}">
			<tr>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.age}</td>
				<td>${user.country}</td>
			</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>