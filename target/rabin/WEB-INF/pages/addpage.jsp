<%--
  Created by IntelliJ IDEA.
  User: MyCall
  Date: 9/15/2016
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddPage</title>
</head>
<body>
<a href="/list">Back to item List</a>

<h2>Add New Items</h2>

<form action="/insert" method="get">
    <table>
        <tr>
            <td>ItemName:</td>
            <td><input type="text" name="name" value="${name}"/></td>
        </tr>
        <tr>
            <td>ItemPrice:</td>
            <td><input type="text" name="price" value="${price}"/></td>

        </tr>
        <tr>
            <td><input type="submit" value="button"></td>
        </tr>
    </table>

</form>
</body>

</html>
