<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>Title: <c:out value="${songid.title}"/></p>
<p>Artist: <c:out value="${songid.artist}"/></p>
<p>Rating: <c:out value="${songid.rate}"/></p>
<a href="/delete/${songid.id}">delete</a>


</body>
</html>