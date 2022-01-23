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

<h3>Add Category</h3>

	<form method="post"enctype="multipart/form-data" action="${pageContext.request.contextPath }/category/addcategory">

<table>
	<tr>
		<td>Name</td>
		<td>
			<input type="text" name="name"/>
		</td>
	</tr>
	
	<tr>
		<td>Photo</td>
		<td>
			<input type="text" name ="file">
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