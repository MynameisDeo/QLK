<%@ tag language="java" pageEncoding="ISO-8859-1"  isELIgnored="false" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/security/tags" %>
<%@ attribute name="title" required="true"  type="java.lang.String" %>
<%@ attribute name="content" fragment="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${title }</title>

</head>
<body>

	<table border="1" align="center" width="800">
		<tr>
			<td width="300" valign="top">
				<h3>Dashboard</h3>
				<ul>
					<li><a href="#">Index</a></li> 
				
				</ul>
				
				<s:authorize access="hasRole('ROLE_SUPPER_ADMIN')">
					
				
				
				<h4>Invoices</h4>
				<ul>
					<li><a href="#">List</a></li> 
					<li><a href="#">Add</a></li> 
				
				</ul>
				</s:authorize>
				
				<s:authorize access="hasRole('ROLE_SUPPER_ADMIN') or hasRole('ROLE_ADMIN')">
				
				<h4>Categories</h4>
				<ul>
					<li><a href="#">List</a></li> 
					<li><a href="#">Add</a></li> 
				
				</ul>
				
				</s:authorize>
				
				<s:authorize access="hasRole('ROLE_SUPPER_ADMIN') or hasRole('ROLE_ADMIN') or hasRole('ROLE_EMPLOYEE')">
				<h4>Product</h4>
				<ul>
					<li><a href="#">List</a></li> 
					<li><a href="#">Add</a></li> 
				
				</ul>
				</s:authorize>
				
			</td>
			<td valign="top">
			
				<h3> Welcome ${pageContext.request.userPrincipal.name }</h3>
	
				<a href="${pageContext.request.contextPath }/account/logout">logout</a>
				<br>
				<br>
				<jsp:invoke fragment="content"></jsp:invoke>
				
			
			</td>
		</tr>
		
	</table>

</body>
</html>