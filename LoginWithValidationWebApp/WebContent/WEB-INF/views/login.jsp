<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h1>${loginmessage}</h1>
	<hr>
	<form:form action="/LoginWithValidationWebApp/loginStudent" method="post" modelAttribute="studentLogIn">
	<table>
	<tr>
	<td>Student Id:</td>
	<td><form:input path="email"/></td>
	</tr>
	<tr>
	<td>Password:</td>
	<td><form:input path="password" /></td>
	</tr>
	<tr>
	<td><input type="submit" value="login"></td>
	</tr>
	</table>
	</form:form>
	</div>
</body>
</html>