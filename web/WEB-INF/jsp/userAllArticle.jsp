<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/6
  Time: 下午11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table >
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Content</th>
        <th>Created Date</th>
        <th>Author Name</th>
        <th>All Comments</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="article" items="${userAllArticles}">
        <tr>
            <td>${article.id}</td>
            <td>${article.title}</td>
            <td>${article.content}</td>
            <td>${article.dateCreate}</td>
            <td>${article.authorName}</td>
            <td><a href="${pageContext.request.contextPath}/${article.id}/getComment">check All comments</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<h1><a href="${pageContext.request.contextPath}/toAddArticle">Add new Article</a></h1>

</body>
</html>
