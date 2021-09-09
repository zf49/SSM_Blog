<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 2021/9/9
  Time: 下午11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="${pageContext.request.contextPath}/updateDetail" method="post" >
    fname:  <input type="text" name="fname" placeholder="${detail.fname}" >
    lname:  <input type="text" name="lname" placeholder="${detail.lname}">
    birthday:   <input type="date"  name="dateBirth" placeholder="${detail.dateBirth}">
    description: <input type="text" name="descrip" placeholder="${detail.descrip}">
    <input type="submit">
</form>



</body>
</html>
