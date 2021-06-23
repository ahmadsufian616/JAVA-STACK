<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.con {
	margin: 0 auto;
	width: 1000px;
	height: 800px;
}

header {
	text-align: center;
}
</style>
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
	<div class="con">

		<h1>NEW DOJO!</h1>
		<div class=main>

			<form:form method="post" action="/add_dojo" modelAttribute="dojo">

				<form:label path="Name">Name</form:label>
				<form:input path="Name" />
				<form:errors path="Name" />
				<input type="submit" value="go">




			</form:form>
			<table style="width: 100%">
				<tr>
					<th>DOJONAME:</th>
				</tr>
				<c:forEach items="${dojo1}" var="d">
					<tr>
						<td><a href="/${d.getId()} ">${d.getName()}</a></td>

					</tr>
				</c:forEach>


			</table>



		</div>
	</div>
</body>
</html>