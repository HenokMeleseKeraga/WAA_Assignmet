<%--
  Created by IntelliJ IDEA.
  User: Henok Melese
  Date: 7/22/2019
  Time: 6:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Ask for advise about your favorite roast</h2>
<form action="advice" method="get">
    <select name="roast" >
        <option value="-">--Choose Roast--</option>
        <option value="dark">dark</option>
        <option value="medium">medium</option>
        <option value="Light">Light</option>
        <input type="submit"/>
    </select>
</form>


</body>
</html>
