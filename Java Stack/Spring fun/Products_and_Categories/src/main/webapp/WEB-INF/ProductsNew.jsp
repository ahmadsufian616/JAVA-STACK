<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="con">

<h1>New Products</h1>

<form:form action="/addproduct" method="post" modelAttribute="product">

<P><form:label path="name">Name:</form:label>
<form:input path="name"/>
<form:errors path="name"/>
</P>

<P><form:label path="description">Desc:</form:label>
<form:textarea path="description"/>
<form:errors path="description"/>
</P>

<P><form:label path="price">Price:</form:label>
<form:input path="price"/>
<form:errors path="price"/>
</P>


<input type="submit" value="go">




</form:form>



</div>



</body>
</html>