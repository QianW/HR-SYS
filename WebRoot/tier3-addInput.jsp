<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
 	<form action="tier3-add" method="post" class="elegant-aero">
  <h1>III级机构添加</h1>
 	
 	<table>
 	<tr>
 		<td>I级机构编号/名称</td>
 		<td><select name="id1">
				<s:iterator var="t" value="tier1list">
					<option value="<s:property value='#t.id'/>" >
					<s:property value="#t.tier1Id"/>|<s:property value="#t.tier1Name"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 	</tr>
 	<tr>
 		<td>II级机构编号/名称</td>
 		<td><select name="id2">
				<s:iterator var="t" value="tier2list">
					<option value="<s:property value='#t.id'/>" >
					<s:property value="#t.t2Id"/>|<s:property value="#t.t2Name"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 	</tr>
 	<tr>
 		<td>III级机构编号</td>
 		<td><input type="text" name="tier3.t3Id"></td>
 	</tr>
 	<tr>
 		<td>III级机构名称</td>
 		<td><input type="text" name="tier3.t3Name"></td>
 	</tr>
 	<tr>
 		<td>是否为零售店</td>
 		<td><select name="retail">
 			<option value="是">是</option>
 			<option value="否">否</option>
 		</select></td>
 	</tr>
 	<tr>
 		<td>销售责任人编号</td>
 		<td><textarea rows="6" cols="80" name="tier3.t3SaleId"></textarea></td>
 	</tr>
 	</table>
 	<input type="submit" value="提交"><a href="tier3-list"><input type="button" value="返回"/></a>
 	</form> 
  </body>
</html>
