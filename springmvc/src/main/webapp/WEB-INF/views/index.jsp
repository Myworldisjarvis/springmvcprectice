<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Home page </title>
</head>
<body>
<h1>This is home page </h1>
<h1>Called by home controller</h1>

<%

String name = (String) request.getAttribute("name");
%>

<h1> My namae is <%= name %></h1>

<%String names =(String) request.getAttribute("name"); %>
<h1> My nama is<%= names %></h1>

</body>
</html>