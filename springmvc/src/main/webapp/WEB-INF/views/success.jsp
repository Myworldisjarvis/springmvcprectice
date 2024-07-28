<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>wellcome to spring MVC</h1>

<%

String userEmail =(String) request.getAttribute("email");
String userName =(String)request.getAttribute("name");
String userPasswod =(String)request.getAttribute("password");
%>

<h3> ${email} </h3>
<h3> ${name} </h3>
<h3> ${password} </h3>
</body>
</html>