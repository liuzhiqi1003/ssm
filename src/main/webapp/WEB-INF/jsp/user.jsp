<%--
  Created by IntelliJ IDEA.
  User: liuzhiqi
  Date: 2016/4/9
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
    <title>user</title>
</head>
<body>
    <h3>User page.</h3>
    姓名：<input type="text" name="name" value="${user.name}"/><br>
    年龄：<input type="text" name="name" value="${user.age}"/><br>
    性别：<input type="text" name="name" value="${user.gender}"/><br>
    地址：<input type="text" name="name" value="${user.address}"/><br>
</body>
</html>
