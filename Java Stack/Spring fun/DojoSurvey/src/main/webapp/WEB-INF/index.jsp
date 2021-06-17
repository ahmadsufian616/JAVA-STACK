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
<form method="post" action="/result">
<label for="name">Your Name 
<input type="text" name="name" id="name"></label>
<br>
<br>
<br>
<label for="dojo">DOJO loc
<select name="dojo" id="dojo">
  <option value="san">san</option>
  <option value="ps">ps</option>
  <option value="jordan">jordan</option>
  <option value="lebanon">lebanon</option>
  </select></label>
  <br>
  <br>
  <br>
  <label for="lan">Your lan 
<select name="lan" id="lan">
  <option value="python">python</option>
  <option value="java">java</option>
  <option value="C++">C++</option>
  <option value="c#">c#</option>
  </select></label>
  <textarea  name="comment"> </textarea>
  
  

<button type="submit">go</button>

</form>
</body>
</html>