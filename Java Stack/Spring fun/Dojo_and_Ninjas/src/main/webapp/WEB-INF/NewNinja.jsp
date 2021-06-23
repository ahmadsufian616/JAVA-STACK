<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="con">
		<form:form method="Post" action="/add_ninjas" modelAttribute="ninja">
			<div class="form-group">
		        <form:label path="dojo">Dojo Name</form:label>
		        <form:errors path="dojo"/>
		        <form:select class="form-control" path="dojo">
		        <c:forEach items="${ dojo }" var="doj">
		        	<option value="${ doj.id }">${ doj.name }</option>
		        </c:forEach>
		        </form:select>
		    </div>
		    <div class="form-group">
		        <form:label path="FirstName">First Name</form:label>
		        <form:errors path="FirstName"/>
		        <form:input class="form-control" path="FirstName"/>
		    </div>
		    <div class="form-group">
		        <form:label path="LastName">Last Name</form:label>
		        <form:errors path="LastName"/>
		        <form:input class="form-control" path="LastName"/>
		    </div>
		    <div class="form-group">
		        <form:label path="age">Age</form:label>
		        <form:errors path="age"/>
		        <form:input class="form-control" path="age"/>
		    </div>
		    <button type="submit">Add Ninja</button>





		</form:form>
	</div>
</body>
</html>