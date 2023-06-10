<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Login Page</title>
    <%@ include file="header.jsp" %>
  </head>
  <body style="background-image: url('resources/images/Back.jpg');">

<hr>
	<div class="container">
		<div class="row">
			<div class="col-lg-5 col-xl-9 mx-auto">
				<div
					class="card flex-row my-5 border-0 shadow rounded-3 overflow-hidden">
					<div class="card-img-left d-none d-md-flex">
						<!-- Background image for card set in CSS! -->
					</div>
					<div class="card-body p-4 p-sm-5">
						<h5 class="card-title text-center mb-5 fw-light fs-5">Login Page</h5>
						<form action="checkUser" method="post">

							<div class="form-floating mb-3">
								<label for="custId1">User Name</label>
								 <input
									type="text" class="form-control" id="custId1"
									name ="custId" placeholder="Your username" required autofocus>

							</div>
							<div class="form-floating mb-3">
								<label for="password">Login Password</label> <input
									type="password" class="form-control" id="password"
									name="passWord"  placeholder="Your Login Password" required autofocus>
							</div>
							
							<div class="d-grid mb-2">
								<button
									class="btn btn-lg btn-primary btn-login fw-bold text-uppercase text-center"
									type="submit">Login</button>
							</div>

							<a class="d-block text-center mt-2 small" href="register">Not Have an
								account? Register</a>

							<hr class="my-4">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>