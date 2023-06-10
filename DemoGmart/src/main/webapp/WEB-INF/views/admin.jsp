<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<title>Welcome to ADMIN </title>
<%@ include file="adminHeader.jsp"%>
</head>
<body style="background-image: url('resources/images/backgr.png');">

	<hr>
	<p style="text-align:center">
		<h1>
		
			Welcome To <b>${username}</b>
			
		</h1>
	</p>
	<section>
		<hr>
		<div class="container">
				<p>
					<h4>
						<em> <font color="white">The great thing about the Internet isn't that you can
							reconnect with old friends or stay up to date with developing
							world events or send pictures of newborns immediately around the
							world. It is simply that you can log on to <a href="#">gmart.com</a>
							from anywhere and order Any grocery immediately after seeing your
							life flash before your eyes.</font>
						</em> <br> <br><font color="white"> We provide All Types of Necessary operation that perform from ADMIN Side Such as if Admin Want
						To Add Employee then  <a
							href="allEmployee">Click Here</a>.<br> If ADMIN Want add Different category then <a href="catagories">Click Here</a>
						<br> If ADMIN Want add Different Product then <a href="products">Click Here</a></font>
					</h4>
					
				
			

		</div>

	</section>

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