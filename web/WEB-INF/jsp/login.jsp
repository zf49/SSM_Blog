<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/8
  Time: 下午4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${sessionScope.userId}</h1>
<h1>${sessionScope.userName}</h1>


<h1>${err}</h1>

<form action="${pageContext.request.contextPath}/login" method="post">

    username: <input name="username" type="text" required>
    password: <input name="pwd" type="text" required>
    <button type="submit" name="submit" value="submit">submit</button>

</form>



</body>
</html>
