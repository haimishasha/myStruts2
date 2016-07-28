<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>MY STRUTS2</title>
  </head>
  <body>
    <form action="login.action" method="post">
    	userName:
    	<input type="text" name="userName">
    	<br/>
    	
    	password:
    	<input type="password" name="password">
    	<br/>
    	
    	<input type="submit" value="登录">
    </form>
  </body>
</html>
