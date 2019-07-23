<%--
  Created by IntelliJ IDEA.
  User: Henok Melese
  Date: 7/22/2019
  Time: 6:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Advance</title>
</head>
<body>
<c:forEach items="${advice}" var="advise">
<table>
    <tr>
        <td><c:out value="${advise}"></c:out></td>
    </tr>
</table>
</c:forEach>


</body>
</html>
