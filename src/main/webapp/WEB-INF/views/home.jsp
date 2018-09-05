<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Items</title>
<!-- Link the bootstrap CSS -->
<!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous"> -->
<!-- Or in this case, a variation theme... -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/journal/bootstrap.min.css" />
<!-- Custom CSS goes below Bootstrap CSS -->
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<a href="/search-result">Search API</a>


		<form class="form-inline" action="/search-result" autocomplete="off">
		  <label class="sr-only" for="keyword">Name</label>
		  <input type="text" value="${param.name}" class="form-control mb-2 mr-sm-2" id="name" name="name" placeholder="Keyword">
		  
		  <label class="sr-only" for="city">City</label>
		  <select class="form-control mb-2 mr-sm-2" id="city" name="city">
		  <option value="">City</option>
		  
	 		<c:forEach items="${ cities }" var="cit">
		  		<option <c:if test="${ cit eq param.city }">selected</c:if>>${ cit }</option>
		  	</c:forEach>
		  </select> 
	
		  <div class="input-group" required>Family Friendly?
   
          	<input name = "family" type="radio" value="true" aria-label="Yes button"> Yes
	     	<input name = "family" type="radio" value="false" aria-label="No button"> No
	 	 </div>
		  
		
		  <button type="submit" class="btn btn-primary mb-2 mr-2">Search</button>

		</form>
		
</body>
</html>