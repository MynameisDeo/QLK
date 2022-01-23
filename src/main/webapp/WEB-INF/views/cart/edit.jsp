<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>


<body>

<h3>Add Export Invoice</h3>

	<form method="post"enctype="multipart/form-data" action="${pageContext.request.contextPath }/cart/edit1">

<table>

	<tr>
		<td>id_pro</td>
		<td>
			<input type="text" name="id_pro" value="${id }" >
		</td>
	</tr>
	<tr>
		<td>quantity</td>
		<td>
			<input type="text" name="quantity" value="${quantity }" >
		</td>
	</tr>
	<tr>
		<td>price</td>
		<td>
			<input type="text" name="total" value="${total }" >
		</td>
	</tr>
	
	<tr>
		<td>id_acc</td>
		<td>
			<input type="text" name ="id_acc"  >
		</td>
	</tr>
	<tr>
		<td>id_cus</td>
		<td>
			<input type="text" name ="id_cus"  >
		</td>
	</tr>
	
	
	
	
	
	<tr>  
		
		<td valign="top">
			&nbsp;
		</td>
		<td>
			<input type="submit" value="Save">
			
		</td>
	
	</tr>
	
</table>

</form>
</body>
</html>