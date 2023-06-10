<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored = "false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="custHeader.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Final Receipt</title>
</head>
<body style="background-image: url('resources/images/Back.jpg');">
	<div class="container">
		<div class="row">
			<div class="col-lg-7 col-xl-9 mx-auto">
				<div
					class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
					<div class="card-img-left d-none d-md-flex">
						<!-- Background image for card set in CSS! -->
					</div>
					<div class="card-body p-4 p-sm-5">
						<h5 class="card-title text-center mb-5 fw-light fs-5">Final
							Receipt</h5>
						<table class="table table-bordered" align="center">

							<tr class="danger">
								<td colspan="6"><center>RECEIPT</center></td>
							</tr>

							<tr class="info">
								<td>ORDER ID</td>
								<td>ORD000${orderDetail.orederId }</td>
								<td>Date</td>
								<td colspan="2">${orderDetail.orderDate }</td>
							</tr>
							<tr>
								<td colspan="5"><h3>ORDER ITEMS</h3></td>
							</tr>
							<tr>
								<td>Product Id</td>
								<td>Product Name</td>
								<td>Quantity</td>
								<td>Price</td>
								<td>SubTotal</td>
							</tr>

							<c:forEach items="${cartItemList }" var="cartItem">
								<tr class="info">
									<td>${cartItem.productId}</td>
									<td>${cartItem.productName}</td>
									<td>${cartItem.quantity}</td>
									<td>${cartItem.price}</td>
									<td>${cartItem.price}*${cartItem.quantity }</td>
								</tr>
							</c:forEach>


							<tr class="warning">
								<td colspan="4">Total Purchase Amount</td>
								<td colspan="1">${grandTotal }/-</td>
							</tr>
							<tr class="warning">
								<td colspan="5"><h3>Shipping Address</h3></td>
							</tr>

							<tr class="info">
								<td>Address</td>
								<td colspan="4">${addr }</td>
							</tr>

						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

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