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
    </tr>
    </thead>
    <tbody>
    <c:forEach var="article" items="${allArticles}">
        <tr>
            <td>${article.id}</td>
            <td>${article.title}</td>
            <td>${article.content.substring(0,20)}</td>
            <td>${article.dateCreate}</td>
<%--            <td>--%>
<%--                <a href="${pageContext.request.contextPath}/book/toupdatebook/${book.bookID}">修改</a>--%>
<%--                &nbsp;| &nbsp;--%>

<%--                <a href="${pageContext.request.contextPath}/book/deletebook/${book.bookID}">删除</a>--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>



</body>
</html>
