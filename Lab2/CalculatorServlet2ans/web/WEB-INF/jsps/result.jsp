<%--
  Created by IntelliJ IDEA.
  User: Henok Melese
  Date: 7/23/2019
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="calc2" method="get">
    <input type = "text" name = "add1" size = "2"  value = "${calculator1.numb1}" />+
    <input type = "text" name = "add2" value = "${calculator1.numb2}" size = "2"/>=<input type = "text" name = "sum" value = "${sum}"  size = "2" readonly/><br/>
    <input type = "text" name = "mult1" value = "${calculator2.numb1}" size = "2"/>*
    <input type = "text" name = "mult2" value = "${calculator2.numb2}"  size = "2"/>=<input type = "text" name = "product" value = "${product}"   size = "2" readonly/><br/>
    <input type = "submit" value = "Submit"/>

</form>

</body>
</html>
