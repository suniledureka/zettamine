<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
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
	<h2 class="text-center text-light mt-5">ZETTAMINE LABS :: LIBRARY</h2>
	<p class="text-center text-danger">${no_match}</p>
	
	<c:if test="${fn:length(no_match) le 0}" >
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
	</c:if>
</body>
</html>