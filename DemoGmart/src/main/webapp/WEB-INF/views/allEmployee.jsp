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

<title>Welcome to Admin</title>
<%@ include file="adminHeader.jsp"%>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body style="background-color: rgb(186,214,206);">
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-12">

				<h1 class="text-center mb-3">Added Employee</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Employee ID</th>
							<th scope="col">First Name</th>
							<th scope="col">Last Name</th>
							<th scope="col">Mobile No.</th>
							<th scope="col">Email</th>
							<th scope="col">Password</th>
							<th scope="col">Address</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${employee }" var="e">
							<tr>
								<th scope="row">${e.employeeId }</th>
								<td>${e.firstName }</td>
								<td>${e.lastName }</td>
								<td>${e.mobileNo }</td>
								<td>${e.email }</td>
								<td>${e.passWord }</td>
								<td>${e.address }</td>
								<td><a href="deleteE/${e.employeeId }"><i
										class="fas fa-trash text-danger" style="font-size: 30px;"></i></a>
								</td>
								<td><a href="updateE/${e.employeeId }"><i
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
	<table align="center" style="padding: 0 15px; width: 50%">
		<tr>
			<td><a href="#">&#60;&#60;PREVIOUS</a>
			<td><a href="#">NEXT&#62;&#62;</a>
			<td><a href="employeeRegister">ADD Employee</a></td>
		</tr>
	</table>
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