<%--
  Created by IntelliJ IDEA.
  User: 小豆腐
  Date: 2017/12/15
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s"  uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <s:form action="user/login"  method="post">
       <s:textfield name="user.name" label="姓名"/>
       <s:textfield name="user.password" label="密码"/>
       <s:submit  value="登录"/>

       <%--全局validate会拦截 所有请求--%>
       <a href="user/change">更换验证码</a>
   </s:form>



</body>
</html>
