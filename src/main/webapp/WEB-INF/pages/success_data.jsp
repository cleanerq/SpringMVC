<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>成功</h1>

pageScope ${pageScope.msg}<br>
requestScope ${requestScope.msg}<br>
sessionScope ${sessionScope.msg} ${sessionScope.haha}<br>
applicationScope ${applicationScope.msg}<br>


</body>
</html>
