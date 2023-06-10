<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="custHeader.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<title>Total Description Of Grocery</title>

</head>
<body style="background-color: rgb(111, 222, 99);">
	<div class="container">
		<div class="row">
			<div class="col-lg-10 col-xl-10 mx-auto">
				<div
					class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
					<div class="card-img-left d-none d-md-flex">
						<!-- Background image for card set in CSS! -->
					</div>
					<div class="card-body p-4 p-sm-5">
						<h5 class="card-title text-center mb-5 fw-light fs-5">Total
							Description of Grocery/Product</h5>

						<form action="<c:url value="/addToCart/${prod.productId }"/>">
							<table class="table-bordered">
								<tr>
									<td rowspan="8"><img src="<c:url value="/resources/images/${prod.productId }.jpg"/>"
										height="200" width="200" 
										alt="Generic Placeholder thumbnail" /></td>
								</tr>
								<tr>
									<td>ProductId</td>
									<td>${prod.productId}</td>
								</tr>
								<tr>
									<td>Product Name</td>
									<td>${prod.productName}</td>
								</tr>
								<tr>
									<td>Price</td>
									<td>${prod.price }</td>
								</tr>
								<tr>
									<td>Category</td>
									<td>${prod.productCategory }</td>
								</tr>
								<tr>
									<td>Product Description</td>
									<td>${prod.productDesc }</td>
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
									<td><input type="submit" value="BUY"
										class="btn btn-success">
								</tr>


							</table>

						</form>

					</div>
				</div>
			</div>
		</div>
	</div>




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