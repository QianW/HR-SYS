<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>人力资源信息管理系统</title>
    <style>body{FONT-FAMILY: 微软雅黑;}</style>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
 <BODY background="pic/bg.gif" leftMargin=0 topMargin=0 marginheight="0" marginwidth="0">
<DIV style="PADDING-TOP: 80px" align=center valign="middle">
<FORM method=post action=login>
<DIV align=center>
<TABLE 
style="BORDER-BOTTOM: #ecfafb 6px solid; BORDER-LEFT: #ecfafb 6px solid; BORDER-TOP: #ecfafb 6px solid; BORDER-RIGHT: #ecfafb 6px solid" border=0 cellSpacing=0 cellPadding=0 width=700 background="pic/login.gif" height=380>
  <TBODY>
  <TR>
    <TD 
    style="FILTER: alpha(opacity=80); LINE-HEIGHT: 200%; MARGIN-TOP: 0px; FONT-FAMILY: 微软雅黑; MARGIN-BOTTOM: 0px; COLOR: #ffffff; FONT-SIZE: 24pt; FONT-WEIGHT: bold" 
    bgColor=#005a8f height=120 align=middle>人力资源信息管理系统</TD></TR>
  <TR>
    <TD style="FILTER: Alpha(opacity=50); BACKGROUND: #ffffff" height=55 
    align=middle>
      <TABLE style="POSITION: relative" id=table1 border=0 cellSpacing=0 
      cellPadding=4 width="100%">
        <TBODY>
        <TR>
          
          <TD align=right>
       	登录账号：<INPUT style="WIDTH: 80px; HEIGHT: 25px; FONT-SIZE: 12pt" id=username tabIndex=1 name=username> 
                     密码：<INPUT style="WIDTH: 80px; HEIGHT: 25px; FONT-SIZE: 12pt" tabIndex=2 type=password name=password id=password autocomplete="off">
                     验证码：<INPUT style="WIDTH: 50px; HEIGHT: 25px; FONT-SIZE: 12pt" id=random tabIndex=3 name=random></TD>
            <td><input type="image" src="random.action"></td>
          <TD><INPUT id=submit tabIndex=5 onclick="return checkform()" border=0 src="pic/dl.gif" type=image name=submit></TD>
          <TD></TD>
          <TD width="5%"></TD>
        </TR>
       	</TBODY>
       	</TABLE></TD></TR>
  <TR>
    <TD width=100>　</TD></TR></TBODY></TABLE>
<P style="LINE-HEIGHT: 250%; MARGIN-TOP: 0px; MARGIN-BOTTOM: 0px"><FONT 
style="FONT-SIZE: 9pt">Qian Wang@荣誉出品 </FONT></P></DIV></FORM></DIV>
<SCRIPT language=javascript>
<!--
function checkform() {
	var un = document.getElementById("username");
	var pw = document.getElementById("password");
	var rand=document.getElementById("random");
	if(un.value == ""){
		alert("用户名不能为空！");
		return false;
	}
	if(pw.value == ""){
		alert("密码不能为空！");
		return false;
	}
	if(rand.value==""){
		alert("验证码不能为空！");
		return false;
	}
	if(rand.value.length != 4){
		alert("验证码长度应该登录4");
		return false;
	}
	return true;
}

</SCRIPT>
  </body>
</html>
