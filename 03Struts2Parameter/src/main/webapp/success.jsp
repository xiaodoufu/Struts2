<%--
  Created by IntelliJ IDEA.
  User: 小豆腐
  Date: 2017/12/11
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--导入struts2需要的标签库--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>使用el表达式 获取值   默认的作用域就在request中</h1>
  用户名： ${requestScope.user.userName} <br/>
  密码： ${user.password}
<hr/>
<h1>使用struts2标签 获取值</h1>

 <s:property value="user.userName"/><br/>
 <s:property value="user.password"/>

<s:debug/>
</body>
</html>
