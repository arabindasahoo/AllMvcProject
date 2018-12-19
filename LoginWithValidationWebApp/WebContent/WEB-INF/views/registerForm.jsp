<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
	color:red
}
</style>
</head>
<body>
	<div align="center">
	<h1>${SignUpmessage}</h1>
	<hr>
	<form:form action="/LoginWithValidationWebApp/registerStudent" method="post" modelAttribute="student">
	<table>
	<tr>
	<td>Student Id:</td>
	<td><form:input path="studentId"/></td>
	<td><form:errors path="studentId" cssClass="error"></form:errors></td>
	</tr>
	<tr>
	<td>Student Name:</td>
	<td><form:input path="name"/></td>
	<td><form:errors path="name" cssClass="error"></form:errors></td>
	</tr>
	<tr>
	<td>Student Email:</td>
	<td><form:input path="email"/></td>
	<td><form:errors path="email" cssClass="error"></form:errors></td>
	</tr>
	<tr>
	<td>Student Mobile:</td>
	<td><form:input path="mobile"/></td>
	<td><form:errors path="mobile" cssClass="error"></form:errors></td>
	</tr>
	<tr>
	<td>Password:</td>
	<td><form:password path="password"></form:password></td>
	<td><form:errors path="password" cssClass="error"></form:errors></td>
	</tr>
	<tr>
	<td>ConformPassword:</td>
	<td><form:password path="conformPassword"></form:password></td>
	<td><form:errors path="conformPassword" cssClass="error"></form:errors></td>
	</tr>
	
	<tr>
	
	<td colspan="3"><input type="submit" value="Register"></td>
	</tr>
	</table>
	</form:form>
	</div>
</body>
</html>