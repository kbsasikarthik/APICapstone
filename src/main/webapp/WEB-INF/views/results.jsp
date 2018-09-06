<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>API Capstone</title>
<!-- Link the bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"> -->
<!-- Or in this case, a variation theme... -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/journal/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<h1>${title }</h1>
<h3>Number of matches - ${i }</h3>
<table>
<thead>
<tr>
<strong><td>Name</td><td>Venue</td><td>Family Friendly</td><td>Start Date & Time</td><td>Link</td><td>Add to Bucket List</td>
</strong>
</tr>
</thead>

<c:forEach var="item" items="${filteredEvents }">
	<tr>
	<td><a href="/details/${item.id }">${item.name}</a></td>
	<td >${item.embedded.venues[0].city}</td>
	<td style="text-align:center">${item.classifications[0] }</td>
	<td>${item.dates}</td>
	<td><a href=${item.outlets[0]}>Ticket Master</a></td>
	<td><div class="input-group" >
   
          	<!-- <input name = "blist" type="radio" value="true" aria-label="Yes button"> Yes
	     	<input name = "blist" type="radio" value="false" aria-label="No button"> No -->
	     	<a  class="btn btn-primary" href="/events/${item.id }/${item.name }/update" >Add to Favorites</a>
	 	 </div></td>	
	</tr>
</c:forEach>

</table>
<a href="/" class="btn btn-primary">Back</a>
</body>
</html>