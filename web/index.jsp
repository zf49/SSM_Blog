<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/3
  Time: 下午10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>

    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->

    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>


  </head>
  <body>

     <h1>${pleaseLogin}</h1>

  <h1>
    <a href="${pageContext.request.contextPath}/signUp">注册</a>
  </h1>
     
  <h1>
    <a href="${pageContext.request.contextPath}/tologin">登陆</a>
  </h1>

<h1>
  <a href="${pageContext.request.contextPath}/allArticle">All article</a>
</h1>

  </body>
</html>
