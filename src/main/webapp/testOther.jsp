<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/9
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/testRequestBody"
      method="post" enctype="multipart/form-data">
    <input name="username" value="tomcat" >
    <input name="password" value="123456">
    <input type="file" name="uploadFile">
    <input type="submit" value="提交">
</form>

<a href="${pageContext.request.contextPath}/testRequestBody">发送post ajax 请求</a>
</body>
<script type="text/javascript">
    $("a:first").click(function () {
        var emp = {lastName:"张三", email:"aaa@aa.com", gender:0};
        alert(typeof emp);
        var empStr = JSON.stringify(emp);
        alert(typeof empStr);
        alert(empStr);
        // 点击发送ajava请求，请求数据带上json
        $.ajax({
            url : "${pageContext.request.contextPath}/testRequestBody",
            contextType : "json",
            type :"post",
            data:emp,
            success:function (data) {
                alert(data);
            }
        })
        return false;
    })

</script>
</html>
