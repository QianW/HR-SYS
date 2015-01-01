<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s" %>
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
<h2>II级机构设置</h2>

<a href="tier2-addInput"  style="text-align:right;">添加</a>
	<s:url id="url" value="tier2-list.action">  
         <s:param name="pageNow" value="pageNow"></s:param>  
     </s:url>
<s:a href="%{url}">刷新</s:a>
<hr/>

  <table  class="bordered">  
  <thead>
    <tr>  
       <th>I级机构编号</th>  
       <th>I级机构名称</th>
       <th>II级机构编号</th>  
       <th>II级机构名称</th>
       <th>薪酬发放责任人编号</th>  
       <th>销售责任人编号</th> 
       <th>变更</th>
       <th>删除</th> 
    </tr>
   </thead>  
    <s:iterator value="tier2list" var="t">  
       <tr>  
          <td><s:property value="#t.t1Id"/></td>  
          <td><s:property value="#t.t1Name"/></td>  
          <td><s:property value="#t.t2Id"/></td>  
          <td><s:property value="#t.t2Name"/></td>  
          <td><s:property value="#t.t2SalaryId"/></td>  
          <td><s:property value="#t.t2SaleId"/></td>  
          <td><a href="tier2-updateInput?id=<s:property value="#t.id"/>">变更</a></td>
          <td><a href="tier2-delete?id=<s:property value="#t.id"/>">删除</a></td>
       </tr>  
    </s:iterator>  
  </table><br>
  <div align="center">
     <s:url id="url_pre" value="tier2-list.action">  
         <s:param name="pageNow" value="pageNow-1"></s:param>  
     </s:url>  
  
     <s:url id="url_next" value="tier2-list.action">  
         <s:param name="pageNow" value="pageNow+1"></s:param>  
     </s:url>    
  
     <s:a href="%{url_pre}">上一页</s:a>  
       
     
    	 第<s:property value="pageNow"/>页
  
     <s:a href="%{url_next}">下一页</s:a>   
  </div>  
  </body>
</html>
