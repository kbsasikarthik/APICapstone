<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
<tr><td>Name</td><td>Venue</td><td>Family Friendly</td><td>Start Date & Time</td><td>Link</td><td>Add to Bucket List</td></tr>
</thead>
<c:forEach var="item" items="${filteredEvents }">
	<tr>
	<td><a href=${item.name}>${item.name}</a></td>
	<td>${item.embedded.venues[0].city}</td>
	<td>${item.classifications[0] }</td>
	<td>${item.dates}</td>
	<td><a href=${item.outlets[0]}>Ticket Master</a></td>
	<td>  <div class="input-group" >
   
          	<input name = "blist" type="radio" value="true" aria-label="Yes button"> Yes
	     	<input name = "blist" type="radio" value="false" aria-label="No button"> No
	 	 </div></td>	
	</tr>
</c:forEach>
</table></body>
</html>