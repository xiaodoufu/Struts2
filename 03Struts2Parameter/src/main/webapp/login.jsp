<%--
  Created by IntelliJ IDEA.
  User: 小豆腐
  Date: 2017/12/11
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <form action="user/login"  method="post">
    用户名：   <input name="user.userName"><br/>
    密码：   <input  type="password" name="user.password">
  <button type="submit">登录</button>
  </form>

</body>
</html>
