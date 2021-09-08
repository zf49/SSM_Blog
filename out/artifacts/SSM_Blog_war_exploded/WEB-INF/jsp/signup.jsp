<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/4
  Time: 上午12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${msg}</h1>
<form action="${pageContext.request.contextPath}/addUser" method="post">

    username: <input name="username" type="text" required>
    password: <input name="pwd" type="text" required>
    <button type="submit" name="submit" value="submit">submit</button>

</form>
</body>
</html>
