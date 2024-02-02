<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="/images/logo.png"/>
<link rel="stylesheet"
	href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" />
<title>zettamine :: library</title>
</head>
<body class="bg-info">
	<table class="table w-50 mt-5 table-dark m-auto table-striped table-bordered">
	 <tr>
	  <th class="w-25">Book ID</th>
	  <td>${book.bookId}</td>
	 </tr>
	 
	 <tr>
	  <th>Title</th>
	  <td>${book.bookTitle}</td>
	 </tr>
	 
	 <tr>
	  <th>Price</th>
	  <td>${book.bookPrice}</td>
	 </tr>
	</table>
</body>
</html>