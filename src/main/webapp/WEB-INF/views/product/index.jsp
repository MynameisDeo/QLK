<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: center;
  background-color: #04AA6D;
  color: white;
}

#customers td {
  
  text-align: center;
  
}
body {
  background-color: lightblue;
}

h2 {
  
  text-align: center;
}

a {
  
  font-size: 20px;
  color: black;
}
form{
	text-align: center;
}
.button4 {
	border-radius: 12px;
	background-color: #04AA6D;
	font-size:18px;
	width: 86px;
	color: white;
	margin-bottom: 10px;
	margin-top: 10px;
	
}
.button3 {
	border-radius: 12px;
	width: 300px;
	font-size:18px;
}
.buttoncate{
	color: #04AA6D;
	font-weight:700;
	font-style: italic;
	
}
</style>

</head>


<body>

<mt:template_admin title="Dashboard">
  	<jsp:attribute name="content">

		<h2 class="buttoncate">Product</h2>
		
		
		
		<form method="post" action="${pageContext.request.contextPath }/category/search">
				<input class="button button3" type="text" name ="name" placeholder=" Search...">	
				<br>
				<input class="button button4" type="submit" value="Search">
			</form>
		
			<table border="1" id="customers">
				<tr>
					<th>Id</th>
		 			<th>Id cate</th>
		 			<th>Name</th>
		 			<th>Price</th>
		 			<th>Quantity</th>
		 			<th>Status</th>
		 			<th>Description</th>
		 			<th>Created</th>
		 			<th>Photo</th>
		 			<th>Action</th>
		 			
		 			
				</tr>
				<c:forEach var="pro" items="${products}">
				<tr>
						<td>${pro.id }</td>
		 				<td>${pro.category.id }</td>
		 				<td>${pro.name }</td>
		 				<td>${pro.price }</td>
		 				<td>${pro.quantity }</td>
		 				<td>${pro.status }</td>
		 				<td>${pro.description }</td>
		 				<td>${pro.created }</td>
		 				<td><img
					src="${pageContext.request.contextPath }/assets/uploads/${product.name2 }" width="100" height="80">
				</td>
		 				<td>
		 					<a href="${pageContext.request.contextPath }/category/edit/${cate.id}">Edit</a> |
		 					<a href="${pageContext.request.contextPath }/category/delete/${cate.id}">Delete</a> |
		 					<a href="${pageContext.request.contextPath }/category/addcategory">Add</a> |
		 					<a href="${pageContext.request.contextPath }/cart/buy/${pro.id}">buy now</a>|
		 				</td>
		 				
		 				
				</tr>
				</c:forEach>
			</table>
	
	</jsp:attribute>
  </mt:template_admin>
</body>
</html>