<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/9
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<%=new Date()%>
<a href="${pageContext.request.contextPath}/getallajax">ajax获取所有员工</a><br>
<div></div>

<script type="text/javascript">

    $("a:first").click(function (){
        // 发送ajax请求
        $.ajax({
           url : "${pageContext.request.contextPath}/getallajax",
           type:"POST",
            success:function (data) {
                console.log(data);
                $.each(data, function () {
                    var empInfo = this.lastName+" "+this.birth+" "+this.gender;

                    $("div").append(empInfo + "<br>");
                })
            }
        });
        // 禁用a标签默认行为
        return false;
    });
</script>
</body>
</html>
