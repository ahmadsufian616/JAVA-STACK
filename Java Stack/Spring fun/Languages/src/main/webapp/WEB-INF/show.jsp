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
<body>

<p>name: <c:out value="${Languagesid.name}"/></p>
<p>creator: <c:out value="${Languagesid.creator}"/></p>
<p>currentVersion: <c:out value="${Languagesid.currentVersion}"/></p>
<a href="/${Languagesid.id}/edit">Edit Book</a>
<a href="/delete/${Languagesid.id}">delete</a>

</body>
</html>