<%--
  Created by IntelliJ IDEA.
  User: asha2
  Date: 9/8/2022
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Success</title>
</head>
<body>
<table>
    <tr>
        <td colspan="2" align="center"><h2>Registration Succeeded!</h2></td>
    </tr>
    <tr>
        <td colspan="2">
            <h3>Thank you for registering! Here's the review of your details:</h3>
        </td>
    </tr>
    <tr>
        <td>User Name:</td>
        <td>${userForm.username}</td>
    </tr>
    <tr>
        <td>E-mail:</td>
        <td>${userForm.email}</td>
    </tr>
    <tr>
        <td>Birthday:</td>
        <td>${userForm.birthDate}</td>
    </tr>
    <tr>
        <td>Profession:</td>
        <td>${userForm.profession}</td>
    </tr>

</table>
</body>
</html>
