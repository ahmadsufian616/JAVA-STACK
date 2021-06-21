<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
<body>
	<table style="width: 100%">
		<tr>
			<th>name</th>
			<th>creator</th>
			<th>varsion</th>
			<th>action</th>
		</tr>
		<c:forEach items="${languages}" var="l">
		<tr>
			
				<td><a href="/show/${l.id}"><c:out value="${l.name}" /></a></td>
				<td><c:out value="${l.creator}" /></td>
				<td><c:out value="${l.currentVersion}" /></td>
				<td><a href="/${l.id}/edit">edit</a>||<a href="/delete/${l.id}">delete</a></td>
			

		</tr>
			</c:forEach>
	</table>

	<br>

	<h1>New language</h1>
	<form:form action="/addlang" method="post" modelAttribute="language">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:textarea path="creator" />
		</p>
		<p>
			<form:label path="currentVersion">Version</form:label>
			<form:errors path="currentVersion" />
			<form:input path="currentVersion" />
		</p>

		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>