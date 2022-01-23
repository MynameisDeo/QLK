<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <s:form action="${pageContext.request.contextPath }/product/index" method="get">
<input type="submit" value="Save">
	</s:form> --%>
	<h3>Cart</h3>
	
	<form action="${pageContext.request.contextPath }/cart/update" method="post">
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Photo</th>
				<th>Quantity <input type="submit" value="Update">  </th>
				<th>Sub Total</th>
				<th>Export</th>
				<th>Delete</th>
			</tr>
			<c:set var="total" value="0"></c:set>
			<c:forEach var="i" items="${sessionScope.cart }" varStatus="index">
				<tr>
					<td>${i.product.id }</td>
					<td>${i.product.name }</td>
					<td>${i.product.price }</td>
					<td><img
						src="${pageContext.request.contextPath }/assets/images/${i.product.namePhoto }"
						width="120" height="100"></td>
					<td><input type="number" value="${i.quantity }" min="1" name="quantity"
						style="width: 60px"></td>
					

					<td><input type="number" value="${i.product.price * i.quantity }" name ="total" readonly="readonly"> </td>
					<c:set var="total"
						value="${total + (i.product.price * i.quantity) }"></c:set>
						
					<td><a
						href="${pageContext.request.contextPath }/cart/edit/${i.product.id}/${total}?quantity=${i.quantity}">
							Export</a></td>
					<td><a
						href="${pageContext.request.contextPath }/cart/delete/${index.index}" onclick="return confirm('Are you sure?')">
							Remove</a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5" align="right">Total</td>
				<td colspan="2">${total}</td>
			</tr>
			
		</table>
	
	</form>
	
	<a href="${pageContext.request.contextPath }/product/index">Continue
		Shopping</a>
		

		
</body>
</html>