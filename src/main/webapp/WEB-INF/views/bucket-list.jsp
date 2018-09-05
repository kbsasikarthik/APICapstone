<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Bucket List</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />

</head>
<body>
	<!-- With boostrap, pages should generally be surrounded with a container element. -->
	<main class="container">
		<h1>Bucket List</h1>
		
		<form class="form-inline" autocomplete="off">
		
		</form>
		
		<table class="table">
			<thead>
			<tr>
				<th>Event</th><th>URL</th><th>Action</th>
			</tr>
			</thead>
			<tbody>
			
			<%-- c:forEach is loops through the items and repeats the content for each one.
			     Think of this as:   for (Food food : foods) { ... }
			--%>
			
			<c:forEach items="${ events }" var="item">
				<tr>
					<%-- Access properties of the java bean using simple . notation.
					     This actually calls the getters behind the scenes. --%>
					<td>${item.name}</td><td>${item.url}</td>
					<td>
						<a href="/delete?id=${ item.name }" class="btn btn-light" onclick= "return confirm('Are you sure you want to delete this event?')">Delete</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		
		<div>
		<a class="btn btn-secondary" href="results">Back To Results</a>
		<a class="btn btn-secondary" href="/index">Home</a>
		
		</div>
		
	</main>
</body>
</html>