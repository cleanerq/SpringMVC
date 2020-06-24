<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/24
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
rest风格 增删改查请求，<br>
<h1></h1>
<a href="book/1">查询图书</a><br>
<h1></h1>
<form method="post" action="book/1">
    <input type="hidden" name="_method" value="DELETE">
    <button type="submit" name="删除图书">删除图书</button>
</form><br>
<form method="post" action="book/1">
    <input type="hidden" name="_method" value="PUT">
    <button type="submit" name="修改图书">修改图书</button>
</form><br>
<form method="post" action="book/1">
    <button type="submit" name="增加图书">增加图书</button>
</form>
</body>
</html>
