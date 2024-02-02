<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="icon" href="/images/logo.png"/>
<link rel="stylesheet" href="/webjars/bootstrap/5.3.2/css/bootstrap.min.css" />
<style>
 a:hover{  
  box-shadow:0 0 10px black;
  text-decoration:none;
  border-radius:10px;
 }
</style>
<title>Phone Book</title>
</head>
<body>
   <div class="container">
	<h4 class="bg-primary text-center p-1 rounded mt-1">John | Phone Book | New Contact</h4>
	<a href="viewContacts" class="btn btn-link">View All Contacts</a>
	
	<!--  success or failure message region after insertion or deletion -->	
	 <div class="w-25 p-2 rounded font-weight-bold">
	  ${succMsg} ${errMsg}
	 </div>
	

	<form:form action="saveContact" method="POST" modelAttribute="contact">
	    <form:hidden path="contactId"/>
		<table class="table mt-3 w-50 table-dark table-bordered font-weight-bold">
		 <thead>
			<tr>
				<td>Contact Name</td>
				<td><form:input path="contactName" autofocus="autofocus" placeholder="enter contact name"/></td>
			</tr>
			<tr>
				<td>Contact Number</td>
				<td><form:input path="contactNumber" placeholder="enter contact number"/></td>
			</tr>
			<tr>
				<td>Contact Email</td>
				<td><form:input path="contactEmail" placeholder="enter contact email"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save Contact" class="btn btn-primary"/></td>
			</tr>
		</thead>	
		</table>

		
	</form:form>
	</div>
</body>
</html>