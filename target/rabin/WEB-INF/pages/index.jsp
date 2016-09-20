<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <p>${msg}</p>
</head>
<body>
<a href="/index">Add New Item</a>
<h2>List of Items</h2>
<table>
    <thead style="background: #f9ffb5">
    <tr>
        <td style="width: 200px;text-align: center">ID</td>
        <td style="width: 200px;text-align: center">Item</td>
        <td style="width: 200px;text-align: center">Amount</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${itemList}" varStatus="i">
        <tr class="tr1">
            <td style="width: 200px;text-align: center">${itemList[i.index].itemId}</td>
            <td style="width: 200px;text-align: center">${itemList[i.index].itemName}</td>
            <td style="width: 200px;text-align: center">${itemList[i.index].itemPrice}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
