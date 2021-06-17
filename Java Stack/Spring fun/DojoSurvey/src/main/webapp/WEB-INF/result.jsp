<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p> Name:  <c:out value="${name}"/></p>
	<p> Dojo:  <c:out value="${dojo}"/></p>
	<p> Languge:<c:out value="${lan}"/></p>
	<p> Comment: <c:out value="${comment}"/></p>
</body>
</html>