
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <p>${msg}</p>
</head>
<body>
<a href="welcome/addpage.html">Add New Item</a>
<h2>List of Items</h2>
<c:foreach var="item" items="${itemList}"></c:foreach>
<thead>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>price</th>
</tr>
</thead>
<tbody>
<tr>
    <td>
        ${item.itemId}
    </td>
    <td>${item.itemName}</td>
    <td>${item.itemprice}</td>
</tr>
</tbody>

</body>
</html>
