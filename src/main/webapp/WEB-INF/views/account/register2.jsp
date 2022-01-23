<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Register</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/admin/plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/admin/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/admin/dist/css/adminlte.min.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="${pageContext.request.contextPath }/resources/admin/index2.html"><b>Register</b>LTE</a>
  </div>
  <!-- /.login-logo -->
  <div class="card">
    <div class="card-body login-card-body">
      <p class="login-box-msg">Sign in to start your session</p>

      <s:form modelAttribute="account" action="${pageContext.request.contextPath }/account/register3" method="post"
       onsubmit="return validateform()" name="form1">
       ${erro }
          <br>
        <div class="input-group mb-3">
          <s:input path="username" class="form-control" placeholder="Username"/>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-envelope"></span>
            </div>
          </div>
        </div>
        <div class="input-group mb-3">
         
          <s:input path="password" class="form-control" placeholder="Password"/>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        
         <div class="input-group mb-3">
         
          <s:input path="fullName" class="form-control" placeholder="Fullname"/>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        <!-- ----------------------- -->
         <div class="col-8">
            <div class="icheck-primary">
              <s:checkbox id="remember" path="status"/>
              <label for="remember">
                Status
              </label>
            </div>
          </div>
       <!--  ------------------------------------- -->
       
        
         <div class="input-group mb-3">
         
          <s:input path="email" class="form-control" placeholder="Email"/>
          <div class="input-group-append">
            <div class="input-group-text">
              <span class="fas fa-lock"></span>
            </div>
          </div>
        </div>
        
        <input type="hidden" value="2" name="role">
        
        ${role }
        <br>
         <div class="input-group mb-3">
         
        <%--   <c:forEach var="role" items="${roles }">
				<input type="checkbox" value="${role.id }" name = "role"> ${role.name }
				<br>
			
			</c:forEach> --%>
			
			<c:forEach var="role" items="${roles }">
				<div class="col-8">            
	              <input type="checkbox" value="${role.id }" name = "role" id="remember">
	              <label for="remember">
	                ${role.name }
	              </label>	           
	          </div>
	          
          </c:forEach>
			
          
        </div>
        
        <div class="row">
        
          <!-- /.col -->
          <div class="col-4">
            <button type="submit" class="btn btn-primary btn-block" value="register"> Register </button>
          </div>
          
          <!-- /.col -->
          
          
          
          
          
        </div>
      </s:form>

      <div class="social-auth-links text-center mb-3">
       
        <a href="${pageContext.request.contextPath }/account/login" class="btn btn-block btn-danger">
          <i ></i> Sign in using User
        </a>
      </div>
      <!-- /.social-auth-links -->

     
     
    </div>
    <!-- /.login-card-body -->
  </div>
</div>
<!-- /.login-box -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath }/resources/admin/plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath }/resources/admin/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath }/resources/admin/dist/js/adminlte.min.js"></script>
</body>
</html>
  