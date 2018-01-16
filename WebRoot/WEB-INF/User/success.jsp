<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>成功界面</title>
<%
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/"+"struts2"+request.getServletPath();
%>

</head>
<body>
<hr color="orange" size="2">
<div align="center">
页面加载路径<%=basePath %><br/>
在线人数：<%=application.getAttribute("count") %><br/>
<br/><br/><br/><s:debug></s:debug><br/><br/><br/>
<form action="user/User_a" method="post">
<table border="1" bordercolor="red" cellpadding="0" cellspacing="0" width="500px" height="200px" >
<tr>
<td>姓名</td><td><input id="i1" type="text" name="name" size="30"/></td>
</tr>
<tr>
<td>性别</td><td><input id="i2" type="text" name="sex" size="30"/></td>
</tr>
<tr>
<td>年龄</td><td><input id="i3" type="text" name="age" size="30"/></td>
</tr>
<tr>
<td><input id="i4" type="submit" name="submit" value="提交"/></td>
<td><input id="i5" type="reset" name="reset" value="重置"/></td>
</tr>

</table>
</form>
</div>
</body>
</html>