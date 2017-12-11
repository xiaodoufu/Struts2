<%--
  Created by IntelliJ IDEA.
  User: 小豆腐
  Date: 2017/12/11
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--
   验证命名空间的查询顺序
   user/user1/user2/login
   01.最后一个 /后面的是 action的name
   02.会把login之前的所有user/user1/user2 当成namespace去查询
   03.没找到 接着把 user/user1当成namespace去查询
   04.没找到 接着把 user 当成namespace去查询  找到了

--%>
  <a href="user/login">登录1</a>
  <a href="user/user1/user2/login">登录2</a>
  <a href="user2/user1/user/login">登录3</a>
</body>
</html>
