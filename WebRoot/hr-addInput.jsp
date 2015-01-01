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
 	<form action="hr-add" method="post" class="elegant-aero">
  <h1>人力资源档案登记</h1>
 	
 	<table>
 	<tr>
 		<td>I级机构</td>
 		<td><select name="t1id">
 				<s:iterator value="t1list" var="t">
 					<option value="<s:property value='#t.id'/>" >
					<s:property value="#t.tier1Id"/>|<s:property value="#t.tier1Name"/>
 				</s:iterator>
			</select>
 		</td>
 		<td>II级机构</td>
 		<td><select name="t2id">
				<s:iterator var="t" value="t2list">
					<option value="<s:property value='#t.id'/>" >
					<s:property value="#t.t2Id"/>|<s:property value="#t.t2Name"/>
					</option>
				</s:iterator>
			</select>
		</td>
 		<td>III级机构</td>
 		<td>
 			<select name="t3id">
				<s:iterator var="t" value="t3list">
					<option value="<s:property value='#t.id'/>" >
					<s:property value="#t.t3Id"/>|<s:property value="#t.t3Name"/>
					</option>
				</s:iterator>
			</select>
		</td>
 		
 	</tr>
 	<tr>
 		<td>职位分类</td>
 		<td><select name="posCatName">
				<s:iterator var="t" value="posCatlist">
					<option value="<s:property value='#t.majorName'/>" >
					<s:property value="#t.majorName"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 		<td>爱好</td>
 		<td>
 			<select name="attr1">
				<s:iterator var="t" value="attr1list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
		</td>
 		<td>职称</td>
 		<td>
 			<select name="posName">
				<s:iterator var="t" value="poslist">
					<option value="<s:property value='#t.mName'/>" >
					<s:property value="#t.mName"/>
					</option>
				</s:iterator>
			</select>
		</td>
 		
 	</tr>
 	<tr>
 		<td>姓名</td>
 		<td><input type="text" name="hr.name"/>
 		</td>
 		<td>性别</td>
 		<td>
 			<select name="attr2">
				<s:iterator var="t" value="attr2list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 		<td>EMAIL</td>
 		<td><input type="text" name="hr.email"/></td>
 	
 	</tr>
 	 <tr>
 		<td>电话</td>
 		<td><input type="text" name="hr.telephone"/></td>
 		<td>QQ</td>
 		<td><input type="text" name="hr.qq"/></td>
 		<td>手机</td>
 		<td><input type="text" name="hr.mobile"/></td>
 	
 	</tr>
 	
 	<tr>
 		<td>住址</td>
 		<td><input type="text" name="hr.address"/></td>
 		<td>邮编</td>
 		<td><input type="text" name="hr.postcode"/></td>
 	</tr>
 	
 	<tr>
 		<td>国籍</td>
 		<td>
 			<select name="attr3">
				<s:iterator var="t" value="attr3list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
		</td>
 		<td>出生地</td>
 		<td><input type="text" name="hr.birthplace"/></td>
 		<td>生日(yyyyMMdd)</td>
 		<td><input type="text" name="hr.birthday" maxlength="8"/></td>
 		<td>民族</td>
 		<td>
 			<select name="attr4">
				<s:iterator var="t" value="attr4list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
		</td>
 	</tr>
 	<tr>
 		<td>宗教信仰</td>
 		<td>
 			<select name="attr5">
				<s:iterator var="t" value="attr5list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
		</td>
 		<td>政治面貌</td>
 		<td>
 			<select name="attr6">
				<s:iterator var="t" value="attr6list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 		<td>身份证号码</td>
 		<td><input type="text" name="hr.idCard"/></td>
 		<td>社会保障号码</td>
 		<td><input type="text" name="hr.ssn"/></td>
 	</tr>
 	<tr>
 		<td>年龄</td>
 		<td><input type="text" name="hr.age"/></td>
 		<td>学历</td>
 		<td>
 			<select name="attr7">
				<s:iterator var="t" value="attr7list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 		<td>教育年限</td>
 		<td>
 			<select name="attr8">
				<s:iterator var="t" value="attr8list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 		<td>学历专业</td>
 		<td>
 			<select name="attr9">
				<s:iterator var="t" value="attr9list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 	</tr>
 	<tr>
 		<td>薪酬标准</td>
 		<td>
 			<select name="salStd">
 				<option value="0/未定义">0/未定义</option>
 			</select>
 		</td>
 		<td>开户行</td>
 		<td><input type="text" name="hr.bank"/></td>
 		<td>账号</td>
 		<td><input type="text" name="he.account"/></td>
 		<td>登记人</td>
 		<td><input type="text" name="hr.register"/></td>
 	</tr>
 	<tr>
 		<td>建档时间</td>
 		<td><input type="text" name="hr.regTime"/></td>
 		<td>特长</td>
 		<td>
 			<select name="attr10">
				<s:iterator var="t" value="attr10list">
					<option value="<s:property value='#t.attrName'/>" >
					<s:property value="#t.attrName"/>
					</option>
				</s:iterator>
			</select>
 		</td>
 	</tr>
 	</table><br>
 	<table>
 	<tr>
 		<td>个人履历</td>
 		<td><textarea rows="6" cols="80" name="hr.historyRec"></textarea></td>
 	</tr>
 	<tr>
 		<td>家庭关系信息</td>
 		<td><textarea rows="6" cols="80" name="hr.familyMem"></textarea></td>
 	</tr>
 	<tr>
 		<td>备注</td>
 		<td><textarea rows="6" cols="80" name="hr.remark"></textarea></td>
 	</tr>
 	</table>
 	<input type="submit" value="提交"><input type="reset" value="清除"/>
 	</form> 
  </body>
</html>
