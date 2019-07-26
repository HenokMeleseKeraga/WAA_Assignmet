<%--
  Created by IntelliJ IDEA.
  User: Henok Melese
  Date: 7/25/2019
  Time: 9:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="global">
    <h2>List of Products</h2>


    <table>
        <tr><th>Name</th><th>Category</th><th>Description</th></tr>

        <c:forEach var="product" items = "${products}">
            <tr>
                <td>${product.name}</td>
                <td>${product.category.name}</td>
                <td>${product.description}</td>
            </tr>
        </c:forEach>
    </table>

    <form action="product" method="get">
        <input id="submit" type="submit"
               value="Add product">
    </form>

</div>

</body>
</html>
