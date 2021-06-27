<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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

<h1> Questions Dashboard</h1>

<table>
  <tr>
    <th>Questions</th>
    <th>Tags</th>
    
  </tr>
  <c:forEach items="${All_Questions}" var="q">
  <tr>
    <td><a href="/questions/${ q.id}" >${q.question}</a></td>
    <td>${q.tags }</td>
  </tr>
  </c:forEach>
  </table>

<a herf="/new">NEW  Question</a>

</body>
</html>