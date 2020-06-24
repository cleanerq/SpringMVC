<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="hello">hello</a>
<a href="handle01">写在方法上的</a>
<a href="haha/handle01">写在类上的</a>

<h1>处理Requestmapping属性</h1>
<a href="haha/handle02">测试method=post请求</a>
<form action="haha/handle02" method="post">
    <button type="submit">post请求</button>
</form>

<h1>处理params请求</h1>
<a href="haha/handle03">处理params请求2</a>

<h1>RequestMapping-ant风格的url</h1>
<a href="antTest01">RequestMapping-ant风格的url</a>

<h1>PathVariable测试</h1>
<a href="user/qby232">PathVariable测试</a>


</body>
</html>
