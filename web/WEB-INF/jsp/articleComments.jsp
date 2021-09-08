<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/6
  Time: 下午11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1>${article.title}</h1>
<p>${article.content}</p>
<hr>
<p>${article.authorName}</p>
<br>
<p>${article.dateCreate}</p>


<br>
<hr>
<table >
    <thead>
    <tr>

        <th>Content</th>
        <th>user</th>
        <th>Date</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="article" items="${comment}">
        <tr>
            <td>${article.content}</td>
            <td>${article.username}</td>
            <td>${article.dateCreate}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>



</body>
</html>
