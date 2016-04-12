<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示用户信息</title>

<style type="text/css">
.br_TR{
	background-color:expression(this.rowIndex%2==0?"#CCFFFF":"#FFFFCC");
	cursor:hand;
}
.br_head{
	background-color:#DDFFCC;
}
</style>

<script type="text/javascript">
	
</script>

</head>
<body>

	<div align="center">
		<h3><font color="blue">用户信息列表</font></h3>
		<table width="620">
			<tr>
				<td align="right">
					<a href="userToAdd.action">增加用户</a>
				</td>
			</tr>
		</table>
		</table>
		<table width="640" border="1" align="center" bordercolor="#99CCFF">
			 <tr class="br_head">
			 	<td>ID号</td>
			 	<td>姓名</td>
			 	<td>性别</td>
			 	<td>年龄</td>
			 	<td>电话</td>
			 	<td>学校</td>
			 	<td>删除</td>
			 	<td>修改</td>
			 </tr>
			 
			 <s:iterator value="list">
			 	<tr class="br_TR">
			 		<td><s:property value="id"/></td>
			 		<td><s:property value="name"/></td>
			 		<td><s:property value="sex"/></td>
			 		<td><s:property value="age"/></td>
			 		<td><s:property value="telephone"/></td>
			 		<td><s:property value="school"/></td>
			 		<td>
			 			<a href="userDelete?user.id=<s:property value='id'/>" onclick="if(confirm('确定删除吗？')==false)return false">删除</a>
			 		</td>
			 		<td>修改</td>
			 	</tr>
			 </s:iterator>
		</table>
	</div>

</body>
</html>