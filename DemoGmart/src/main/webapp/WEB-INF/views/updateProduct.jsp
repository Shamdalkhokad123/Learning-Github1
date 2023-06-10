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

<body>
	<div class="container mt-3">

		<div class="row">

			<div class="col-md-6 offset-md-3">

				<h1 class="text-center mb-3">Change Product Details</h1>

				<form action="updateProduct/${prod.productId }" method="post" >
                    <div class="form-group">
						<label for="name">Product Id</label> 
					<input type="text" value="${prod.productId}" name="productId" readonly/>
					</div>
					<div class="form-group">
						<label for="name">Product Name</label> 
						<input type="text" class="form-control" id="productName" 
							
							name="productName" value="${prod.productName }">
					</div>


					<div class="form-group">

						<label for="description">Product Description</label>
						<textarea class="form-control" name="productDesc"
							id="description" rows="5"
							placeholder="Enter the product description">${prod.productDesc }
							</textarea>
					</div>
						
						<div class="form-group">
						<label for="name">Product Price</label> 
						<input type="text" class="form-control" id="price"
							
							name="price" value="${prod.price }">
					</div>
						<div class="form-group">
						<label for="name">Product Category</label> 
						<input type="text" class="form-control" id="productCategory" 
							
							name="productCategory" value="${prod.productCategory }">
					</div>
						
						
					<div class="container text-center">

						<a href="catagories"
							class="btn btn-outline-danger">Back</a>


						<button type="submit" class="btn btn-warning">Update</button>
					</div>
					</form>
			</div>

		</div>

	</div>



</body>
</html>