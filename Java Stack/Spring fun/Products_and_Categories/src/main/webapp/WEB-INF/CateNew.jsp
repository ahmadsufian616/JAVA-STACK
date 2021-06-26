<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="con">

<h1>New Categoris</h1>

<form:form action="/addCate" method="post" modelAttribute="Cate">

<P><form:label path="name">Name:</form:label>
<form:input path="name"/>
<form:errors path="name"/>
</P>

<input type="submit" value="go">




</form:form>



</div>

</body>
</html>