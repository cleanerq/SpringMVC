<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/30
  Time: 0:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    <fmt:message key="welcomeinfo" ></fmt:message>
</h1>
<form>
    <fmt:message key="loginBth"/>：<input> <br>
    <fmt:message key="password"/>：<input> <br>
    <input type="submit" value='<fmt:message key="loginBth"/>'>
</form>


</body>
</html>
