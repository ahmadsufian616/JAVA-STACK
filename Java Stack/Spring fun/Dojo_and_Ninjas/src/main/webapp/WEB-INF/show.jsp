<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<h1>Dojos N Ninjas</h1>
		<h3><a href="/dojos">Dojos</a></h3>
		<hr />
		<h2>${ dojo.name } Area Ninjas</h2>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Age</th>	
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${dojo.ninjas}" var="ninja">
				<tr>
					<td>${ ninja.getFirstName() } ${ ninja.getLastName() }</td>
					<td>${ ninja.getAge() }</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>