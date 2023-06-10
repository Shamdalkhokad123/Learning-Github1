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

				<h1 class="text-center mb-3">Added Product</h1>

				<table class="table-bordered">
					<thead class="thead-dark">
						<tr>
							<th scope="col">ProductID</th>
							<th scope="col">ProductName</th>
							<th scope="col">ProductDescName</th>
							<th scope="col">price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${product }" var="p">
							<tr>
								<th scope="row">${p.productId }</th>
								<td>${p.productName }</td>
								<td>${p.productDesc }</td>
								<td>${p.price }</td>
								<td><a href="deletep/${p.productId }"><em
										class="fas fa-trash text-danger" style="font-size: 30px;"></em></a>
								</td>
								<td><a href="updatep/${p.productId }"><em
										class="fas fa-pen-nib text-primary" style="font-size: 30px;"></em></a>

								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>


	<hr>
	<table align="center" style="padding:0 15px;width: 50%">
		<tr>
			<td><a href="#">&#60;&#60;PREVIOUS</a>
			<td><a href="#">NEXT&#62;&#62;</a>
			<td><a href="addProduct">ADD Products</a></td>
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