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

	<s:form method="post" modelAttribute="photo"  action="${pageContext.request.contextPath }/category/edit">

<table>

	<tr>
		<td>id</td>
		<td>
			<s:input path="id"/>
		</td>
	</tr>
	<tr>
		<td>Name</td>
		<td>
			<s:input path="name"/>
		</td>
	</tr>
	
	<tr>
		<td>Name2</td>
		<td>
			<s:input path="name2"/>
		</td>
	</tr>
	
	
	
	<tr>  
		
		<td valign="top">
			&nbsp;
		</td>
		<td>
			<input type="submit" value="Save">
			<s:hidden path="id"/>
		</td>
	
	</tr>
	
</table>

</s:form>
</body>
</html>