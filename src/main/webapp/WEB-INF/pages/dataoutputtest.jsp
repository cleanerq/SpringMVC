<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/25
  Time: 0:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>handle01</h1>
<a href="/q/data/handle01">handle01</a>

<h1>handle02</h1>
<a href="/q/data/handle02">handle02</a>

<h1>handle03</h1>
<a href="/q/data/handle03">handle03</a>

<h1>handle04</h1>
<a href="/q/data/handle04">handle04</a>

<h1>@ModelAttribute修改图书</h1>
<form action="/q/updateBook" method="post">
    <input type="hidden" name="id" value="1">
    书名：西游记<br>
    作者：<input type="text" name="author"><br>
    价格：<input type="text" name="price"><br>
    库存：<input type="text" name="stock"><br>
    销量：<input type="text" name="sales"><br>
    <button type="submit" value="修改图书">修改图书</button>

</form>

</body>

</html>
