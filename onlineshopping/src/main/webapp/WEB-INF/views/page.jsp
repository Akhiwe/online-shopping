<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags" %> 
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

 
 <spring:url var="css" value="/resourses/css"/> 
 <spring:url var="js" value="/resourses/js"/> 
 <spring:url var="images" value="/resourses/images"/>   
 
 
<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Online Shopping - ${tittle}</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/${css}/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

  <!-- Navigation -->
  <%@include file="./shared/navbar.jsp" %>
  
  <!-- page Content -->
  <!-- Loading the home content -->

  <%@include file="home.jsp" %> 

  

  
  <!-- Footer comes here  -->
 <%@include file="./shared/footer.jsp" %>
 
  
 
  

  <!-- Page Content -->
 

 
 

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/${js}/bootstrap.bundle.min.js"></script>

</body>

</html>
