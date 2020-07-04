<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/1
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>员工添加</title>
</head>
<body>

<form:form action="${pageContext.request.contextPath}/emp" modelAttribute="employee" method="post">
    <input type="hidden" name="_method" value="put">
    <form:hidden path="id"></form:hidden>

    email：<form:input path="email"></form:input><br>
    gender:<br>
        男：<form:radiobutton path="gender" value="1"></form:radiobutton><br>
        女：<form:radiobutton path="gender" value="0"></form:radiobutton><br>
    dept：   <form:select path="department.id" items="${depts}"
                         itemLabel="departmentName"
                         itemValue="id">
            </form:select>
    <input type="submit" value="提交">
</form:form>
</body>
</html>
