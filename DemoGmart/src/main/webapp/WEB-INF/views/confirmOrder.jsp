<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page isELIgnored = "false" %>
<%@ include file="custHeader.jsp"%>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
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
			<div class="col-lg-10 col-xl-10 mx-auto">
				<div
					class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
					<div class="card-img-left d-none d-md-flex">
						<!-- Background image for card set in CSS! -->
					</div>
					<div class="card-body p-4 p-sm-5">
						<h5 class="card-title text-center mb-5 fw-light fs-5">Order
							Grocery</h5>
						<table class="table table-bordered">

							<tr class="danger">
								<td colspan="6"><center>Order Grocery</center></td>
							</tr>

							<tr>
								<td>Product Id</td>
								<td>Product Name</td>
								<td>Quantity</td>
								<td>Price</td>
								<td>Sub Total</td>
							</tr>

							<c:forEach items="${cartItemList }" var="cartItem">
								<tr class="info">
									<td>${cartItem.productId}</td>
									<td>${cartItem.productName}</td>
									<td>${cartItem.quantity}</td>
									<td>${cartItem.price}</td>
									<td>${cartItem.price * cartItem.quantity}</td>

								</tr>
							</c:forEach>
							<tr class="warning">
								<td colspan="4">Total Purchase Amount</td>
								<td colspan="1">${grandTotal }/-</td>
							</tr>
							<tr class="warning">
								<td colspan="5">Shipping Address</td>
							</tr>
							<form action="<c:url value="/UpdateAddr"/>" method="post">

								<tr class="info">
									<td>Address</td>
									<td colspan="3"><textarea name="address" cols="32"
											rows="1">${addr}></textarea></td>

									<td><input type="submit" value="Update Address"
										class="btn btn-success"></td>
								</tr>

							</form>

							<tr class="warning">
								<td colspan="5"></td>
								</td>
								</td>
							</tr>

							<tr class="info">
								<td colspan="2">
									<center>
										<a href="<c:url value="/Cart"/>" class="btn btn-success">Modify
											Cart</a>
									</center>
								</td>
								<td colspan="3">
									<center>
										<a href="<c:url value="/payment"/>" class="btn btn-success">Order
											Confirm</a>
									</center>
								</td>
							</tr>

						</table>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>