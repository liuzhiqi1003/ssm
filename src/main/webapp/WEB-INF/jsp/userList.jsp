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
    <h3>User list page.</h3>
    <br><br>
    <div style="margin:20px 0;">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="addUser()">新增用户</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="updateUser()">修改用户</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="deleteUser()">删除用户</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="getSelections()">GetSelections</a>
    </div>
    <table id="dg" class="easyui-datagrid" title="用户列表" style="width:700px;height:250px"
           data-options="singleSelect:true,collapsible:true,url:'user/findAllUser.action',method:'get'">
        <thead>
        <tr>
            <th data-options="field:'id',width:80">ID</th>
            <th data-options="field:'name',width:100">姓名</th>
            <th data-options="field:'age',width:80,align:'center'">年龄</th>
            <th data-options="field:'gender',width:80,align:'center'">性别</th>
            <th data-options="field:'birthday',width:200,align:'center',formatter:function(value,row,index){
                         var unixTimestamp = new Date(value);
                         return unixTimestamp.toLocaleString();
                         } ">生日</th>
            <th data-options="field:'address',width:250">地址</th>
        </tr>
        </thead>
    </table>
    <script type="text/javascript">
        function addUser(){
            location.href="user/addUserPage.action"
        }

        function updateUser(){
                    var row = $('#dg').datagrid('getSelected');
                    if (row){
                        location.href="user/updateUserPage.action?id="+row.id;
                    }
                }

        function deleteUser(){
            var row = $('#dg').datagrid('getSelected');
            if (row){
                $.ajax({
                    type : "post",
                    url : "user/deleteUser.action",
                    data : {id:row.id},
                    success : function(data){
                        $('#dg').datagrid('load');
                    }
                });
            }
        }
        function getSelections(){
            var ss = [];
            var rows = $('#dg').datagrid('getSelections');
            for(var i=0; i<rows.length; i++){
                var row = rows[i];
                ss.push('<span>'+row.itemid+":"+row.productid+":"+row.attr1+'</span>');
            }
            $.messager.alert('Info', ss.join('<br/>'));
        }
    </script>
</body>
</html>
