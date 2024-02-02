<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="/images/logo.png" />
<link rel="stylesheet"
	href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />
<title>zettamine :: library</title>
</head>
<body class="bg-info">
	<table
		class="table w-50 mt-5 m-auto table-striped table-bordered table-hover">
		<thead class="text-center bg-info">
			<tr>
				<th>Book ID</th>
				<th>TITLE</th>
				<th>PRICE</th>
				<th>ACTIONS</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${books}" var="book">
				<tr>
					<td>${book.bookId }</td>
					<td>${book.bookTitle }</td>
					<td>${book.bookPrice }</td>
					<td>
					<i class="fa fa-eye text-success"></i>					
					&nbsp; &nbsp; 
					<i class="fa fa-edit text-info"></i>
					&nbsp; &nbsp; 
					<a href="delete?isbn=${book.bookId}">
					<i class="fa fa-trash text-danger"></i>
					</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</body>
</html>