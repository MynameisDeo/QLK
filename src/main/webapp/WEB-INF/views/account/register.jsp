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
<h3>Register</h3>
<s:form method="post" modelAttribute="account"
action="${pageContext.request.contextPath }/account/register">
<table>
	<tr>
		<td>Username</td>
		<td>
			<s:input path="username"/>
		</td>
	</tr>
	
	<tr>
		<td>Password</td>
		<td>
			<s:password path="password"/>
		</td>
	</tr>
	
	<tr>
		<td>Full name</td>
		<td>
			<s:input path="fullName"/>
		</td>
	</tr>
	
	<tr>  
		<td>Status</td>
		<td><s:checkbox path="status"/> </td>
	
	</tr>
	
	<tr>  
		<td>Email</td>
		<td><s:input path="email"/> </td>
	
	</tr>
	
	<tr>  
		<td>Role</td>
		<td>
			<c:forEach var="role" items="${roles }">
				<input type="checkbox" value="${role.id }" name = "role"> ${role.name }
				<br>
			
			</c:forEach>
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

</s:form>

	
	

</body>
</html>