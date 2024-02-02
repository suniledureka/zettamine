<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style>
body {
	background-color: black;
}

table {
	width: 500px;
	font-size: 20px;
	margin: 100px auto;
	border-collapse: collapse;
	text-align: center;
	box-shadow: 0 0 10px black;
	border-radius: 15px;
	color: white;
}

tr {
	height: 50px;
	padding: 3px;
}

td, th {
	padding: 2px;
}

th {
	text-align: left;
}

input {
	padding: 2px;
	font-size: 18px;
}

input[type=submit] {
	padding: 3px 35px;
	border: 1px solid white;
	border-radius: 20px;
}

input[type=submit]:hover {
	background-color: yellow;
	color: black;
	box-shadow: 0 0 10px white;
}

p {
	font-size: 30px;
	font-family: 'comic sans ms', 'serif';
	font-size: 20px;
	color: yellow;
	text-align:center;
}
</style>
</head>
<body>
    <p>${message}</p>
    
	<form:form action="saveproduct" method="post" modelAttribute="product">
		<table>
			<tr>
				<th>Product ID</th>
				<td><form:input type="text" path="productId" size="22"
						autofocus="autofocus" /></td>
			</tr>

			<tr>
				<th>Product Name</th>
				<td><form:input type="text" path="productName" size="22" /></td>
			</tr>

			<tr>
				<th>Product Price</th>
				<td><form:input type="text" path="productPrice" size="22" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center">
				<input type="submit" value="Save Product"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
