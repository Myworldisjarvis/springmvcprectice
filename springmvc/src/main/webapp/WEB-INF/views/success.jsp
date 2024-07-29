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
<h1>wellcome to Spring MVC ${Header}</h1>
<p class="text-center">${Desc}</p>
<%-- <%

String userEmail =(String) request.getAttribute("email");
String userName =(String)request.getAttribute("name");
String userPasswod =(String)request.getAttribute("password");
%> --%>

<h3> ${user.email} </h3>
<h3> ${user.name} </h3>
<h3> ${user.password} </h3>
</body>
</html>