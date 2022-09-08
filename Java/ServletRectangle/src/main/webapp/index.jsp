<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<h1> Area Calculation </h1>
</h1>
<form method="GET" action="ServletCalculate">
    <table>

        <tr>
            <td>Length</td>
        </tr>
        <tr>
            <td><input type="text" name="length "></td>
        </tr>
        <tr>
            <td>Breadth</td>
        </tr>
        <tr>
            <td><input type="text" name="breadth"></td>
        </tr>
        <tr>
            <td></td>
        </tr>
        <tr>
            <td><input type="submit" value="calculate"></td>
        </tr>

    </table>

</form>


</body>
</html>