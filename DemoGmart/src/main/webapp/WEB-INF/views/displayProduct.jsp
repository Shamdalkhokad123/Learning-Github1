<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="header.jsp"%>
</head>
<body>
	<%-- <c:forEach items="${product }" var="p"> --%>
	 <%-- <form action="<c:url value="/addToCart/${productId }"/>">  --%>
		<table class="table">
			<tbody>
		<c:forEach items="${product }" var="p">
			<tr>
				<td rowspan="8"><img
					src="<c:url value="/resources/images/${p.productId }.jpg"/>"
					height="200" width="200" border=1 alt="Generic Placeholder thumbnail">
				</td>
				</tr>
				<tr>
					<td>ProductId</td>
					<td><c:out value="${ product }"/></td>
			</tr>
			<tr>
			<td>Product Name</td>
			<td>${msg }</td>
			</tr>
			<tr>
			<td>Price</td>
			<td>${p.price }</td>
			</tr>
			<tr>
			<td>Category</td>
			<td>${p.productCategory }</td>
			</tr>
			<tr>
			<td>Product Description</td>
			<td>${p.productDesc }</td>
			</tr>

			
			<tr>
				<td>Quantity <select name="quantity">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
				</select>
				</td>
				<td><input type="submit" value="BUY" class="btn btn-success">
			</tr>
			</c:forEach>
			</tbody>
		</table>

	<!-- </form> --> 

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>