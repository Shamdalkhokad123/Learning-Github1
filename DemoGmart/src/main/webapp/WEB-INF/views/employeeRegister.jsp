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
<%@ include file="adminHeader.jsp" %>
<title>Employee Adding </title>
</head>
<body style="background-image: url('resources/images/Back.jpg');">

<hr>
	<div class="container">
		<div class="row">
			<div class="col-lg-7 col-xl-9 mx-auto">
				<div
					class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
					<div class="card-img-left d-none d-md-flex">
						<!-- Background image for card set in CSS! -->
					</div>
					<div class="card-body p-4 p-sm-5">
						<h5 class="card-title text-center mb-5 fw-light fs-5"> Adding Employee</h5>
						<form action="handleEmployee" method="post">

							<div class="form-floating mb-3">
								<label for="floatingInputUsername">First Name</label> <input
									type="text" class="form-control" name="firstName" id="floatingInputUsername"
									placeholder="Your First Name" required autofocus>

							</div>
							<div class="form-floating mb-3">
								<label for="floatingInputUsername">Last Name</label> <input
									type="text" class="form-control" name="lastName" id="floatingInputUsername"
									placeholder="Your Last Name" required autofocus>

							</div>
							
							<div class="form-floating mb-3">
								<label for="floatingInputUsername">Mobile No. </label> <input
									type="text" class="form-control" name="mobileNo" id="floatingInputUsername"
									placeholder="Ex. 123456789" required autofocus>

							</div>
							<div class="form-floating mb-3">
							<label for="floatingInputEmail">Email address</label>
								<input type="email" class="form-control" name="Email" id="floatingInputEmail"
									placeholder="name@example.com"> 
							</div>

							<hr>

							<div class="form-floating mb-3">
							<label for="floatingPassword">Password</label>
								<input type="password" class="form-control" name="passWord"
									id="floatingPassword" placeholder="Password"> 
									
									
							</div>

							<div class="form-floating mb-3">
							<label for="floatingPasswordConfirm">Address</label>
								<input type="text" class="form-control" name="address"
									id="floatingPasswordConfirm" placeholder="Enter Your Address">
								
							</div>

							<div class="d-grid mb-2">
								<button
									class="btn btn-lg btn-primary btn-login fw-bold text-uppercase text-center"
									type="submit">Add Employee</button>
							</div>

							<hr class="my-4">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
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