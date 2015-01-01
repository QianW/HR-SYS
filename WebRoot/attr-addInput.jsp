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
  	
 	<form action="attr-add" method="post" class="elegant-aero">
  <h1>公共属性添加</h1>
 	<table>
 	<tr>
 		<td>属性种类</td>
 		<td><select name="attrKind">
 				<option value="国籍">国籍</option>
 				<option value="民族">民族</option>
 				<option value="政治面貌">政治面貌</option>
 				<option value="专业">专业</option>
 				<option value="宗教信仰">宗教信仰</option>
 				<option value="学历">学历</option>
 				<option value="教育年限">教育年限</option>
 				<option value="性别">性别</option>
 				<option value="特长">特长</option>
 				<option value="爱好">爱好</option>
 		  	</select></td>
 	</tr>
 	<tr>
 		<td>属性名称</td>
 		<td><input type="text" name="attr.attrName"></td>
 	</tr>
 	<tr><td><input type="submit" value="提交"><a href="attr-list"><input type="button" value="返回"/></a></td></tr>
 	</table>
 	</form> 
 	
  </body>
</html>
