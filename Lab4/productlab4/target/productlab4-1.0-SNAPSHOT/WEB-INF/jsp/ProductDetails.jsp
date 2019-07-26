<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Henok Melese
  Date: 7/25/2019
  Time: 9:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div id="global">
    <h4>The product has been saved.</h4>

    <h5>Details:</h5>
    Product Name: ${product.name}<br/>
    Category: ${product.category.name}<br/>
    Description: ${product.description}<br/>
    Price: $${product.price}

    <p> <a href="<spring:url value="listproducts"></spring:url> "> listproducts </a></p>


</div>

</body>
</html>
