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
 
 	
 	<form action="tier2-update" method="post" class="elegant-aero">
 	 <h1>II级机构修改</h1>
 	<input type="hidden" name="tier2.id" value="<s:property value="tier2.id"/>" /><br>
 	<table>
 	<tr>
 		<td>I级机构编号</td>
 		<td><input type="text" name="tier2.t1Id" value="<s:property value="tier2.t1Id"/>"/></td>
 	</tr>
 	<tr>
 		<td>I级机构名称</td>
 		<td><input type="text" name="tier2.t1Name" value="<s:property value="tier2.t1Name"/>"/></td>
 	</tr>
 	<tr>
 		<td>II级机构编号</td>
 		<td><input type="text" name="tier2.t2Id" value="<s:property value="tier2.t2Id"/>"/></td>
 	</tr>
 	<tr>
 		<td>II级机构名称</td>
 		<td><input type="text" name="tier2.t2Name" value="<s:property value="tier2.t2Name"/>"/></td>
 	</tr>
 	<tr>	
 		<td>薪酬发放责任人编号</td>
 		<td><input type="text" name="tier2.t2SalaryId" value="<s:property value="tier2.t2SalaryId"/>"/></td>
 	</tr>
 	<tr>
 		<td>销售责任人编号</td>
 		<td><input type="text" name="tier2.t2SaleId" value="<s:property value="tier2.t2SaleId"/>"/></td>
 	</tr>
 	<tr><td><input type="submit" value="提交"><a href="tier2-list"><input type="button" value="返回"/></a></td></tr>
 	</table>
 	</form> 
  </body>
</html>
