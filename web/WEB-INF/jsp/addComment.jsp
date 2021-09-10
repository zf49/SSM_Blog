<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/10
  Time: 下午5:52
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

<hr>
<form action="${pageContext.request.contextPath}/addComment" method="post">
    <input name="content" type="text">
    <input name="articleId" hidden value="${article.id}">
    <input type="submit">
</form>



</body>
</html>
