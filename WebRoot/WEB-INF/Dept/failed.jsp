<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>失败界面</title>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+"struts2/";
%>

</head>
<body>
<hr color="blue" size="5">
<center>失败界面</center>
<div align="center">
路径<%=basePath%><br/>
在线人数：<%=application.getAttribute("count") %><br/>




</div>



</body>
</html>