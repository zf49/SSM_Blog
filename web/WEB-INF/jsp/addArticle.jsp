<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/7
  Time: 下午3:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<h1>Add Article</h1>
<form action="${pageContext.request.contextPath}/addArticle" method="post">
    title:<input type="text" name="title">
    Content: <input type="text" name="content">
    <input type="submit">
</form>



</body>
</html>
