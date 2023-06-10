<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@include file="adminHeader.jsp"%>
<%@include file="base.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Adding Categories</title>
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
						<h5 class="card-title text-center mb-5 fw-light fs-5">Adding
							Categories</h5>

						<form action="handleCategory" method="post">
							<div class="form-group">
								<label for="name">Category Name</label> <input type="text"
									class="form-control" id="name" aria-describedby="emailHelp"
									name="categoryName" placeholder="Enter the Category name here">
							</div>


							<div class="form-group">

								<label for="description">Category Description</label>
								<textarea class="form-control" name="categoryDesc"
									id="description" rows="5"
									placeholder="Enter the Category description"></textarea>
							</div>




							<div class="container text-center">

								<a href="catagories" class="btn btn-outline-danger">Back</a>


								<button type="submit" class="btn btn-primary">Add</button>
							</div>
						</form>


					</div>

				</div>

			</div>
		</div>
	</div>



</body>
</html>