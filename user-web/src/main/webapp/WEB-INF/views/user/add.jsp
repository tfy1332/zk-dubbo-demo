<%--
  Created by IntelliJ IDEA.
  User: 006
  Date: 2017/7/10
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增用户</title>
</head>
<body>
新增用户：
<form action="/user/save" method="post">
    <input hidden name="id" value="${user.id}">
    <p>用户名: <input type="text" name="userName" value="${user.userName}"/></p>
    <p>邮箱: <input type="text" name="email" value="${user.email}"/></p>
    <p>密码: <input type="text" name="password" value="${user.password}"/></p>
    <input type="submit" value="保存" />
</form>
</body>
</html>
