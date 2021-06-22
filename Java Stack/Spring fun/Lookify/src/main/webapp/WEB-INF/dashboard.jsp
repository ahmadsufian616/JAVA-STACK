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
	margin: 20px;
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
	font-family: arial, sans-serif;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

header {
	display: flex;
	justify-content: space-around;
}

.con {
	margin: 0 auto; 
	height : 1000px;
	background-color: gray;
	width: auto;
}

.h1 {
	display: flex;
	margin: 15px;
	width: 200px;
	justify-content: space-between;
}

.h2 {
	display: flex;
	margin: 15px:;
	margin-right: 20px;
	width: 200px;
	justify-content: space-between;
	width: 200px;
}
</style>
<body>
	<div class="con">
		<header>
			<div class="h1">
				<a href="/Add_New">ADD NEW</a> <a href="/topTen">Top Songs</a>
			</div>
			<div class="h2">
			<form action="/search">
				<input type="text"  name="artist"  placeholder="name..."></input>
				<button type="submit">Search Artists</button>
				</form>
			</div>
		</header>

		<div class="table">
			<table style="width: 100%">
				<tr>
					<th>Name</th>
					<th>Rating</th>
					<th>Action</th>
				</tr>
				<c:forEach items="${song}" var="song">
				<tr>
					<td><a href="/view/${song.id}">${song.title}</a></td>
					<td>${song.rate }</td>
					<td><a href="/delete/${song.id }">delete</a></td>
				</tr>
				</c:forEach>
			</table>
		</div>
	</div>














</body>
</html>