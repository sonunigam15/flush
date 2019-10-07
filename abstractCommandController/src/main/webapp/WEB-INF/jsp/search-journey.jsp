<%@page import="com.test.model.Journey"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>data randering page</h1>
	<h2><%= request.getAttribute("journey") %></h2>
	<a href="<%=request.getContextPath( )%>/linkable.htm">click here</a>
</body>
</html>