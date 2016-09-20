<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <p>${msg}</p>
</head>
<body>
<a href="pages/addpage.jsp">Add New Item</a>
<h2>List of Items</h2>
<table>
    <thead>
    <tr>
        <td>ID</td>
        <td>Item</td>
        <td>Amount</td>
    </tr>
    </thead>
    <c:forEach items="${itemList}" varStatus="i">
    <tr class="tr1">
        <td>${itemList[i.index].itemId}</td>
        <td>${itemList[i.index].itemName}</td>
        <td>${itemList[i.index].itemPrice}</td>
    </tr>
</table>
</c:forEach>
</body>
</html>
