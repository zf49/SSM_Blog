<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/6
  Time: 下午10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>${userName}</h1>
<h2>${err}</h2>


<h1><a href="${pageContext.request.contextPath}/${userId}/article">All my Article</a></h1>


</body>
</html>
