<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: asha2
  Date: 9/8/2022
  Time: 9:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="register" method="post" commandName="userForm">
    <table>
        <tr>
            <td colspan="2"><h2> - Registration</h2></td>
        </tr>
        <tr>
            <td>User Name:</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td>E-mail:</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Birthday (mm/dd/yyyy):</td>
            <td><form:input path="birthDate"/></td>
        </tr>
        <tr>
            <td>Profession:</td>
            <td><form:select path="profession" items="${professionList}"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="Register"/></td>
        </tr>
    </table>
</form>

</body>
</html>
