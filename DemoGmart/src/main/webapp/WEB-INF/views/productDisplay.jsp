


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ include file="custHeader.jsp"%>
	<%@ page isELIgnored = "false" %>
<!doctype html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Welcome to Customer</title>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body style="background-color: rgb(186, 214, 206);">
<h1>${username}</h1>
	<div class="container mt-3">

		<div class="row">

						<c:forEach items="${product }" var="p">
						<div class = "col-sm-4 col-md-3">
						<a
									href="totalProductDisplay/${p.productId }"
									class="thumbnail"> <img
										src="<c:url  value="resources/images/${p.productId}.jpg"/>"
										alt="Generic Placeholder thumbnail">

								</a>
							
								<%-- <p align="center">${p.productId}</p> --%>
								<p align="center">${p.productName}</p>
								<p align="center">${p.productDesc}</p>
								<p align="center">${p.price}</p>

							</div>
						</c:forEach>
					</div>
	
<body>
</html>