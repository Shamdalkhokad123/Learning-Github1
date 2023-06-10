<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="custHeader.jsp"%>
<%@ page isELIgnored = "false" %>
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

<title>WishList</title>
</head>
<body style="background-color:rgb(111,222,99);">
	<div class="container">
	<div class="center">
		<div class="row">
			<div class="col-lg-10 col-xl-10 mx-auto">
				<div
					class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
					<div class="card-img-left d-none d-md-flex">
						<!-- Background image for card set in CSS! -->
					</div>
					<div class="card-body p-4 p-sm-5">
						<h5 class="card-title text-center mb-5 fw-light fs-5">Cart
							Detail</h5>
						<table class="table table-bordered">

							<tr class="danger">
								<td colspan="6"><center>WishList</center></td>
							</tr>
							<tr>
								<th id="first">ProductId</th>
								<th  id="first">Product Name</th>
								<th id="first">Quantity</th>
								<th id="first">Price</th>
								<th id="first">SubTotal</th>
								<th id="first">Operation</th>
							</tr>

							<c:forEach items="${cartItemList }" var="cartItem">
								<form
									action="<c:url value="/updateCartItem/${cartItem.cartItemId }"/>"
									method="get">

									<tr class="info">

										<td>${cartItem.productId }</td>
										<td>${ cartItem.productName}</td>
										<td><input type="text" value="${cartItem.quantity }"
											name="quantity"></td>
										<td>${cartItem.price }</td>
										<td>${cartItem.price * cartItem.quantity }</td>
										<td><input type="submit" value="update"
											class="btn btn-success" /> <a
											href="<c:url value="/deleteCartItem/${cartItem.cartItemId }"/>"
											class="btn btn-danger">Delete</a></td>

									</tr>
								</form>

							</c:forEach>
							<tr class="warning">
								<td colspan="4">Total Purchase Amount</td>
								<td colspan="2">${grandTotal }</td>
							</tr>

							<tr class="info">
								<td colspan="3">
									<center>
										<a href="<c:url value="/productDisplay"/>"
											class="btn btn-success">Continue Your Shopping</a>
									</center>
								<td colspan="3">
									<center>
										<a href="<c:url value="/checkout"/>" class="btn btn-success">Check
											Out</a>
									</center>
								</td>

							</tr>
						</table>

					</div>

				</div>
</div>
			</div>
		</div>
	</div>
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