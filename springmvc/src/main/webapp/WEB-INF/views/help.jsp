<%@page import="java.time.LocalDateTime"%>
<%@page import="org.springframework.cglib.core.internal.LoadingCache"%>
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
<%
int roll =(int) request.getAttribute("srollnum");
String name= (String)request.getAttribute("sname");
LocalDateTime date = (LocalDateTime) request.getAttribute("date");
%>
<h1> My name is  <%= name %></h1>
<h1> My Roll no. is  <%= roll %></h1>
<h1> Today date is  <%= date.toString() %></h>

<h1>My name is ${sname} </h1>

<h1>this is help page</h1>
</body>
</html>