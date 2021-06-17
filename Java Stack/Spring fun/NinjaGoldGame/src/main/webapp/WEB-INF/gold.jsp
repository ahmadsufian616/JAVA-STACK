<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<p>Your Gold : <c:out value="${total_gold}"></c:out>
<div class="con">
<div class="mid">	
<div>
<form method="post" action="/add" >
<p>farm</p>
<p>(earns 10-20 gold)</p>
<input type="hidden" name="type" value="farm" />
<button type="submit">find gold</button>
</form>
</div>
<div>
<form method="post" action="/add" >
<p>cave</p>
<p>(earns 5-10 gold)</p>
<input type="hidden" name="type" value="cave" />
<button type="submit">find gold</button>
</form>
</div>

<div>
<form method="post" action="/add" >
<p>house</p>
<p>(earns 2-5 gold)</p>
<input type="hidden" name="type" value="house" />
<button type="submit">find gold</button>
</form>
</div>
<div>
<form method="post" action="/add" >
<p>casino!</p>
<p>(earns/takes 0-50 gold)</p>
<input type="hidden" name="type" value="casino" />
<button type="submit">find gold</button>
</form>
</div>
</div>



</div>



</body>
</html>