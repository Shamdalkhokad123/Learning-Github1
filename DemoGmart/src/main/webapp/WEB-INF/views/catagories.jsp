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
	>

<title>Welcome to ADMIN</title>
<%@ include file="adminHeader.jsp"%>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body style="background-color: rgb(186,214,206);">
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">Added Category</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Category Name</th>
							<th scope="col">Description</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${category }" var="c">
							<tr>
								<th scope="row">${c.categoryId }</th>
								<td>${c.categoryName }</td>
								<td>${c.categoryDesc }</td>
								
								<td><a href="delete/${c.categoryId }"><i
										class="fas fa-trash text-danger" style="font-size: 30px;"></i></a>
								</td>
								<td><a href="update/${c.categoryId }"><i
										class="fas fa-pen-nib text-primary" style="font-size: 30px;"></i></a>

								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>


	<hr>
	<table text-align="center" style=" padding: 0 15px; width: 50%">
		<tr>
			<td><a href="#">&#60;&#60;PREVIOUS</a>
			<td><a href="#">NEXT&#62;&#62;</a>
			<td><a href="addCategories">ADD CATEGORIES</a></td>
		</tr>
	</table>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		></script>
</body>
</html>