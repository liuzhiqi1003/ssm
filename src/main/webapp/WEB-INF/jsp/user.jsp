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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
    <title>user</title>
    <link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="themes/icon.css">
    <link rel="stylesheet" type="text/css" href="themes/demo.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
    <h3>User page.</h3>
    <br><br>
    <div style="margin:20px 0;"></div>
    <div class="easyui-panel" title="添加用户" style="width:400px">
        <div style="padding:10px 60px 20px 60px">
            <form id="ff" method="post" action="user/addUser.action">
                <table cellpadding="5">
                    <tr>
                        <td>姓名:</td>
                        <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>年龄:</td>
                        <td><input class="easyui-textbox" type="text" name="age" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>性别:</td>
                        <td><input class="easyui-textbox" type="text" name="gender" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>地址:</td>
                        <td><input class="easyui-textbox" name="address" data-options="multiline:true" style="height:60px"></input></td>
                    </tr>
                </table>
            </form>
            <div style="text-align:center;padding:5px">
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
            </div>
        </div>
    </div>
    <script>
        function submitForm(){
            $('#ff').form('submit');
        }
        function clearForm(){
            $('#ff').form('clear');
        }
    </script>
</body>
</html>
