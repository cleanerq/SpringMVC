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

<h1>REST风格的操作</h1>
<a href="resttest">REST风格的操作</a>

<h1>@RequestParam</h1>
<a href="handle02?user=ddd">@RequestParam("user")</a>

<h1>@CookieValue("JSESSIONID")</h1>
<a href="handle03">@CookieValue("JSESSIONID")</a>

<h1>数据传到页面测试</h1>
<a href="data/toTest">数据传到页面测试</a>

<h1>去登陆页面</h1>
<a href="toLoginPage">去登陆页面</a>

<h1>自定义视图解析</h1>
<a href="handlePlus">下载资源</a>

<h1>异常处理</h1>
<a href="${pageContext.request.contextPath}/handleExcep?integer=10">异常处理</a>
<a href="${pageContext.request.contextPath}/handleExcep02?username=admin">异常处理02</a>
<a href="${pageContext.request.contextPath}/handleExcep03">异常处理03</a>

</body>
</html>
