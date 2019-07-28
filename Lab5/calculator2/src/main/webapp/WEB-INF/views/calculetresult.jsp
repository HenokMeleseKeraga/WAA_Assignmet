<%--
  Created by IntelliJ IDEA.
  User: Henok Melese
  Date: 7/24/2019
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
      integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<html>
<head>
    <title>Calclulator</title>
</head>
<body>
<div class="mainContainer">
    <p>${param.string}</p>
    <form method="post">
        <div class="form-group row">
            <label for="firstNumber" class="col-sm-2 col-form-label">First Number</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="firstNumber" name="firstNumber" value="${calculator.firstNumber}">
            </div>
        </div>
        <div class="form-group row">
            <label for="secondNumber" class="col-sm-2 col-form-label">Second Number</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="secondNumber" name="secondNumber"value="${calculator.secondNumber}">
            </div>
        </div>
        <div class="form-group row">
            <label for="result" class="col-sm-2 col-form-label">Result</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="result" name="result + ${calculator.operator}" value="${calculator.result}">
            </div>
        </div>





    </form>
</div>
</body>
</html>