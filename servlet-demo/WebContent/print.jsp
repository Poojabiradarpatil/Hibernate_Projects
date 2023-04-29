<%@page import="org.jsp.servletdemo.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome To the World Of JSP</h1>
	<%
		User u = (User) request.getAttribute("obj");
	%>
	<h2>
		ID:<%=u.getId()%></h2>
	<h2>
		Name:<%=u.getName()%></h2>
	<h2>
		Phone:<%=u.getPhone()%></h2>
	<h2>
		Age:<%=u.getAge()%></h2>
</body>
</html>