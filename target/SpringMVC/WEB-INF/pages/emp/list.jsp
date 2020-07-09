<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/1
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>员工列表
    </title>
    <script type="text/javascript" src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<h1>员工列表</h1>
<table border="1" cellpadding="5" >
    <tr>
        <th>ID</th>
        <th>lastName</th>
        <th>email</th>
        <th>gender</th>
        <th>departmentName</th>
        <th>birth</th>
        <th>salary</th>
        <th>操作</th>
        <th>删除</th>
    </tr>
    <c:forEach items="${emps}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.lastName}</td>
            <td>${emp.email}</td>
            <td>${emp.gender==0?"女":"男"}</td>
            <td>${emp.department.departmentName}</td>
            <td>${emp.birth}</td>
            <td>${emp.salary}</td>
            <td><a href="emp/${emp.id}">修改员工</a>
            </td>
            <td>
                <a href="emp/${emp.id}" class="deleteA">删除员工</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="emp">添加员工</a><br>
<form action="${pageContext.request.contextPath}/quickAdd">
<%--    将员工的所有信息都写上，自动封装对象--%>
    <input name="empinfo" value="empAdmin-admin@qq.com-1-101">
    <input type="submit" value="快速添加员工">
</form>

<form id="formID" action="" method="post">
    <input type="hidden" name="_method" value="DELETE">
</form>

<script type="text/javascript">

    $(function() {
        // alert("ddd");
        $(".deleteA").click(function () {
            $("#formID").attr("action", this.href);
            $("#formID").submit();
            // 取消默认事件
            return false;
        });
    })

</script>

</body>
</html>
