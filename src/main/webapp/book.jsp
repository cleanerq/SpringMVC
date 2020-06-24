<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/24
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addBook" method="post">
    书名：<input name="bookName" type="text"><br>
    作者：<input name="author" type="text"><br>
    价格：<input name="price" type="text"><br>
    库存：<input name="stock" type="text"><br>
    销量：<input name="sales" type="text"><br>
    地址：省<input name="addres.province" type="text">市<input name="addres.city" type="text">街道<input name="addres.street" type="text"><br>
    <button type="submit" name="submit">提交</button>

</form>

</body>
</html>
