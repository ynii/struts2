<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>开始界面</title>
<%
	String basePath =request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+"struts2/";
%>
<base href="">
</head>
<body>
<hr color="yellow" size="30">

<center><h1>开始界面</h1></center>
<div align="center">
<font color="red" size="10" ><%=basePath %></font><br/>
<font color="blue" size="5" >在线人数：<%=application.getAttribute("count") %></font><br/><br/>
<a href="user/User_addUser">添加用户User</a><br/><br/>
<a href="user/User_deleteUser">删除用户User</a><br/><br/>
<a href="user/User_updateUser">修改用户User</a><br/><br/>
<a href="dept/Dept_addDept">添加部门</a><br/><br/>
<a href="dept/Dept_deleteDept">删除部门</a><br/><br/>
<a href="dept/Dept_updateDept">修改部门</a><br/><br/>
</div>


</body>
</html>