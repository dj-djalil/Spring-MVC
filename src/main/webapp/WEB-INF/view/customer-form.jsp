<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h4>Sign Up</h4>
	<hr>

	<f:form action="processForm" modelAttribute="customer">
		First Name     : <f:input path="firstName" />
		<br>
		<br>
		Last Name (*)  : <f:input path="lastName" />
		<f:errors path="lastName" cssClass="error" />
		<br>
		<br>
		Age            : <f:input path="age" />
		<f:errors path="age" cssClass="error" />
		<br>
		<br>
		PostalCode     : <f:input path="postalCode" />
		<f:errors path="postalCode" cssClass="error" />
		<br>
		<br>
		Adress         : <f:input path="adress" />
		<f:errors path="adress" cssClass="error" />
		<br>
		<br>
		Course Code    : <f:input path="courseCode" />
		<f:errors path="courseCode" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="submit">
	</f:form>
</body>
</html>