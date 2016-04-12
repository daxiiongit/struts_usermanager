<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户信息</title>
</head>
<body>

	<div align="center">
		<h3><font color="blue">添加用户信息</font></h3>
		<s:form action="userAdd" method="post">
			<table width="300" border="1" bordercolor="#99CCFF" bgcolor="#FFFFEE">
				<s:textfield name="user.id" label="ID号"/>
				<s:textfield name="user.name" label="姓名"/>
				<s:select name="user.sex" list="sexs" label="性别"/>
				<s:textfield name="user.age" label="年龄"/>
				<s:textfield name="user.telephone" label="电话"/>
				<s:textfield name="user.email" label="邮箱"/>
				<s:textfield name="user.specialty" label="专业"/>
				<s:textfield name="user.school" label="学校"/>
				<s:textfield name="user.address" label="地址"/>
				<s:submit value="添加" align="center"></s:submit>
			</table>
		</s:form>
	</div>

</body>
</html> --%>

<!-- 加入国际化 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="add.title"></s:text></title>
</head>
<body>

	<div align="center">
		<h3><font color="blue"><s:text name="add.title"></s:text></font></h3>
		<s:form action="userAdd" method="post">
			<table width="300" border="1" bordercolor="#99CCFF" bgcolor="#FFFFEE">
				<%-- <s:textfield name="user.id" label="ID号"/> --%>
				<s:textfield key="user.name"/>
				<s:select key="user.sex" list="sexs"/>
				<s:textfield key="user.age"/>
				<s:textfield key="user.telephone"/>
				<s:textfield key="user.email"/>
				<s:textfield key="user.specialty"/>
				<s:textfield key="user.school"/>
				<s:textfield key="user.address"/>
				<s:submit name="" key="add.submit" align="center" />  
			</table>
		</s:form>
	</div>

</body>
</html>