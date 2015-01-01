<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Category_input.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="styles.css">
	
  </head>
  
  <body>
  	
 	<form action="position-add" method="post" class="elegant-aero">
  <h1>职称添加</h1>
 	<table>
 	<tr>
 		<td>职称名称</td>
 		<td><input type="text" name="position.mName"></td>
 	</tr>
 	<tr><td><input type="submit" value="提交"><a href="position-list"><input type="button" value="返回"/></a></td></tr>
 	</table>
 	</form> 
 	
  </body>
</html>
