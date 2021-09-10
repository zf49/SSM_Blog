<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/6
  Time: 下午8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Articles</title>

</head>
<body>
<div>

<table >
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Content</th>
        <th>Created Date</th>
        <th>Author Name</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="article" items="${allArticles}">
        <tr>
            <td>${article.id}</td>
            <td>${article.title}</td>
            <td>${article.content}</td>
            <td>${article.dateCreate}</td>
            <td>${article.authorName}</td>
            <td><a href="${pageContext.request.contextPath}/${article.id}/getComment"> comment</a> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>



</body>
</html>
