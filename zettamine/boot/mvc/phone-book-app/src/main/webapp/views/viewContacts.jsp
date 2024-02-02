<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" />
<link rel="icon" href="/images/logo.png"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" />
<style>
 a:hover{  
  box-shadow:0 0 10px black;
  text-decoration:none;
  border-radius:10px;
 }
</style>	
<title>Phone Book | View Contacts</title>
</head>
<body>
   <div class="container">
	<h2 class="p-1 bg-success text-warning text-center">John | List of Contacts</h2>
	<a href="/" class="btn btn-link">+New Contact</a>
	<br><br>
	<table border=1 class="table table-bordered table-hover w-75 text-center">
		<thead class="thead-dark">
			<tr>
				<th>Sl No</th>
				<th>Contact Name</th>
				<th>Contact Email</th>
				<th>Contact Phone</th>
				<th>Active</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="c" items="${contacts}">
				<tr>
					<td>${c.contactId}</td>
					<td>${c.contactName}</td>
					<td>${c.contactEmail}</td>
					<td>${c.contactNumber}</td>
					<td>${c.activeSw}</td>
					<td>
					<a class="btn btn-primary" href="edit?cid=${c.contactId}">
						<i class="fa fa-edit text-info"></i>
					</a>
					 &nbsp;&nbsp;&nbsp; 
					<a class="btn btn-primary" href="delete?cid=${c.contactId}" onclick="return confirmDeletion()">
						<i class="fa fa-trash text-danger"></i>
					</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
		<script>
		  confirmDeletion = ()=>{
			  return confirm("Do you want to delete Contact?");
		  }
		</script>
	</table>
	</div>
</body>
</html>