<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>Student Details</h1>
	<table border=1>
		<tr>
			<td>Student Id</td>
			<td>${studentdetails.studentId}</td>
		<tr>
			<td>Student Name</td>
			<td>${studentdetails.name}</td>
		</tr>
		<tr>
			<td>Student Email</td>
			<td>${studentdetails.email}</td>
		</tr>
		<tr>
			<td>Student Mobile</td>
			<td>${studentdetails.mobile}</td>
		</tr>
	</table>
	</div>
</body>
</html>