<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--@page errorPage="loginerror.jsp"--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Ask for advice about your favorite roast:</h2>
<p />
<c:if test="${user!=null}">
	<h1>User ${user.name} </h1>
<form action = "advice" method="get">
	<select name="roast"  >
		<option value="dark">Dark</option>
		<option value="medium">Medium</option>
		<option value="light">Light</option>
	</select>
	<br/><br/>
	<input type="submit" value = "Submit"  />
</form>
	<form action="logout" method="get">
		<input type="submit" value="logout"/>
	</form>
</c:if>
<p />
<c:if test="${user==null}">
	<form  method="post">
 
		<p>Login: </p>
		<p> Name : <input type="text" id="name" name="name" /></p>
		<p> Password : <input type="password" id="password" name="password" /></p>
		<p> <input type="submit" value="login" /> </p>
	</form>
</c:if>
</body>
</html>