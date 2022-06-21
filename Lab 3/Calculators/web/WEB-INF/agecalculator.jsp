

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="AgeCalculatorServlet">
            <label>Enter Your Birthday: </label>
            <input type="number" name="num_birthday"  value="" >
            <br>
            <input type="submit" value="Age next Birthday">
               
         </form>
        <p>${message}</p>
        <p>${numMessage}</p>
         <a href = "http://localhost:8084/Calculators/Arithmetic"> Arithmetic </a>
    </body>
</html>
