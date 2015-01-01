<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
 	
 	<form action="tier3-update" method="post" class="elegant-aero">
  <h1>III级机构修改</h1>
 	<input type="hidden" name="tier3.id" value="<s:property value="tier3.id"/>" /><br>
 	<table>
 	<tr>
 		<td>I级机构名称</td>
 		<td><input type="text" name="tier3.t1Name" value="<s:property value="tier3.t1Name"/>"/></td>
 	</tr>
 	<tr>
 		<td>II级机构名称</td>
 		<td><input type="text" name="tier3.t2Name" value="<s:property value="tier3.t2Name"/>"/></td>
 	</tr>
 	<tr>
 		<td>III级机构名称</td>
 		<td><input type="text" name="tier3.t3Name" value="<s:property value="tier3.t3Name"/>"/></td>
 	</tr>
 	<tr>	
 		<td>是否为零售店</td>
 		<td><input type="text" name="tier3.t3Retail" value="<s:property value="tier3.t3Retail"/>"/></td>
 	</tr>
 	<tr>
 		<td>销售责任人编号</td>
 		<td><input type="text" name="tier3.t3SaleId" value="<s:property value="tier3.t3SaleId"/>"/></td>
 	</tr>
 	<tr><td><input type="submit" value="提交"><a href="tier3-list"><input type="button" value="返回"/></a></td></tr>
 	</table>
 	</form> 
  </body>
</html>
