<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body {
	text-align: center;
}

p {
	font-size: 30px;
	font-family: 'comic sans ms', 'serif';
	font-size:20px;
	color:green;
}

table {
	text-align: left;
	width: 550px;
	border-collapse: collapse;
	box-shadow: 0 0 10px black;
	margin: 50px auto;
	padding: 5px;
}

td, th {
	border: 1px solid black;
	padding: 3px;
}

tr {
	height: 45px;
}
</style>
<title>Inventory</title>
</head>
<body>
	<p>${message}</p>

	<table>
		<tr>
			<th width="30%">PRODUCT ID</th>
			<td>${pid}</td>
		</tr>
		<tr>
			<th>PRODUCT NAME</th>
			<td>${pname}</td>
		</tr>
		<tr>
			<th>PRICE</th>
			<td>${pprice}</td>
		</tr>
	</table>

	<a href="entry">New Product</a>
</body>
</html>