
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="Arithmetic">
            <label>First:</label>
            <input type="number" name="first_num" value="${firstnumber}">
            <br>
            <label>Second:</label>
            <input type="number" name="second_num" value="${secondnumber}">
            <br>
            <input type="submit" name="operator" value="+">
            <input type="submit" name="operator" value="-">
            <input type="submit" name="operator" value="*">
            <input type="submit" name="operator" value="%">
           
        </form> 
            <p>Results: ${result1}</p>
            <a href = "http://localhost:8084/Calculators/"> Age Calculator </a>
        
    </body>
</html>
