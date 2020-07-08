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
<%--<form action="emp" method="post">--%>
<%--    <input type="hidden" name="_method"/>--%>
<%--    lastName：<input name="lastName" type="text"><br>--%>
<%--    email：<input name="email" type="text"><br>--%>
<%--    gender：<br>--%>
<%--        男：<input type="radio" name="gender" value="1"> <br>--%>
<%--        女：<input type="radio" name="gender" value="0"> <br>--%>
<%--    dept：<select name="department.id">--%>
<%--            <c:forEach items="${depts}" var="dept">--%>
<%--                <option value="${dept.id}">${dept.departmentName}</option>--%>
<%--            </c:forEach>--%>
<%--        </select>--%>
<%--    <input type="submit" value="添加">--%>
<%--</form>--%>

<form:form action="${pageContext.request.contextPath}/emp" modelAttribute="employee" method="post">
<%--    path：1、当做原生的name项 2、自动回显隐含模型中某个对象对应的这个属性的值--%>
    lastName：<form:input path="lastName"></form:input><form:errors path="lastName"></form:errors>->${errorInfo.lastName}<br>
    email：<form:input path="email"></form:input><form:errors path="email"></form:errors>->${errorInfo.email}<br>
    gender:<br>
        男：<form:radiobutton path="gender" value="1"></form:radiobutton><br>
        女：<form:radiobutton path="gender" value="0"></form:radiobutton><br>
    birth：<form:input path="birth"></form:input><br>
<%--    items指定要遍历的集合，每个元素是dept对象，itemLabel指定对象是option的提示信息，itemValue指定对象是option的值--%>
    dept：<form:select path="department.id"
                      items="${depts}" itemLabel="departmentName" itemValue="id"></form:select><br>
    birth：<form:input path="birth"></form:input><form:errors path="birth"></form:errors>->${errorInfo.birth}<br>
    salary:<form:input path="salary"></form:input><br>

    <input type="submit" value="提交">
</form:form>
</body>
</html>
