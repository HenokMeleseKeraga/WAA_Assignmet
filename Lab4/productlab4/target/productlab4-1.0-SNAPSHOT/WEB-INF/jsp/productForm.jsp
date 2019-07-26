<%--
  Created by IntelliJ IDEA.
  User: Henok Melese
  Date: 7/25/2019
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="product" action="product" method="post">
<%--    <p><spring:message code="p.category"/>--%>
<%--        <form:select path="category.id" >--%>
<%--        <form:option value="-1" label="--Select Category--"></form:option>--%>
<%--        <form:options items="${categories}" itemValue="id" itemLabel="name"></form:options>--%>
<%--    </form:select></p>--%>
    <p> <form:select path="category.id" multiple="true"  items="${categories}" itemValue="id" itemLabel="name">
        </form:select>
    </p>
    </p>
    </p>
    <p> <spring:message code="p.name" /><form:input path="name"></form:input></p>
    <p><spring:message code="p.price"></spring:message> <form:input path="price"></form:input></p>
    <p> <spring:message code="p.description"></spring:message><form:input path="description"></form:input></p>
    <p><input type="submit" value="Add product"> <input type="reset" value="reset"></p>

</form:form>

</body>
</html>
