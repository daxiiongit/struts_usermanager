<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户详细信息</title>
</head>
<body>

	<div align="center">
		<h3><font color="blue">用户详细信息</font></h3>
		<s:form>
			<table width="300" border="1" bordercolor="#99CCFF" bgcolor="#FFFFEE">
				<!-- 添加隐藏域，获取当前修改数据的id -->
				<%-- <s:textfield name="user.id" label="ID号"/> --%>
				<s:hidden name="user.id"></s:hidden>
				<s:textfield name="user.name" label="姓名" disabled="true"/>
				<s:select name="user.sex" list="sexs" label="性别" disabled="true"/>
				<s:textfield name="user.age" label="年龄" disabled="true"/>
				<s:textfield name="user.telephone" label="电话" disabled="true"/>
				<s:textfield name="user.email" label="邮箱" disabled="true"/>
				<s:textfield name="user.specialty" label="专业" disabled="true"/>
				<s:textfield name="user.school" label="学校" disabled="true"/>
				<s:textfield name="user.address" label="地址" disabled="true"/>
			</table>
			<a href="userToList">返回</a>
		</s:form>
	</div>

</body>
</html>