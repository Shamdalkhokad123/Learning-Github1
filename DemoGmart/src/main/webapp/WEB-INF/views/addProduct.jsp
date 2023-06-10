<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="adminHeader.jsp"%>
<%@include file="base.jsp"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
							Products</h5>
<hr>
						<form:form action="handleProduct" modulAttribute="Product"
							method="post" enctype="multipart/form-data">

							<<div class="form-floating mb-3">
								<label for="floatingInputUsername">Product Name</label>
								<input type="text" class="form-control" name="productName"
									id="floatingInputUsername" placeholder="enter Product Name"
									required autofocus />
							</div>
							<div class="form-floating mb-3">
								<label for="floatingInputUsername">Price</label>
								<input type="text" class="form-control" name="price"
									id="floatingInputUsername" placeholder="enter Product Price"
									required autofocus />
							</div>
							<div class="form-floating mb-3">
								<label for="productCat">Product Category</label>
								<input type="text" class="form-control" name="productCategory"
									id="productCat" placeholder="enter Product Category"
									required autofocus />
							</div>
							<%-- <div class="form-floating mb-3">
								<label for="floatingInputUsername">Product Category</label>
								<select name="categoryId">
									<option value="0" label="----select category---">
									</option>
									<option value="${categorylist} " />
								</select>
							</div> --%>
							<%--   --%>
							<div class="form-floating mb-3">
								<label for="floatingInputUsername">Product Description</label> <input
										type="text" class="form-control" name="productDesc"
									id="floatingInputUsername"
									placeholder="enter Product Description" required autofocus>
							</div>
							<div class="form-floating mb-3">
								<label for="floatingInputUsername">Product Image</label> <input
									type="file" class="form-control" name="pimage"
									id="floatingInputUsername" placeholder="select Product Image"
									required autofocus/>
							</div>

							<div class="d-grid mb-2">
								<button
									class="btn btn-lg btn-primary btn-login fw-bold text-uppercase text-center"
									type="submit">Insert Product</button>
							</div>
						</form:form>
					</div>

				</div>

			</div>
		</div>
	</div>



</body>
</html>