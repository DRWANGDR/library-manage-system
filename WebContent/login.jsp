<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>图书管理系统</title>
</head>
<body bgcolor="#D9DFAA">
<s:form action="login" method="post" theme="simple">
<table>
	<caption>管理员登录</caption>
	<tr>
		<td>
			管理员ID：<s:textfield name="login.sid" size="20"/>
		</td>
	</tr>
	   <tr>
		   <td>
			             密码：<s:password name="login.password" size="21"/>
		   </td>
	   </tr>
	<tr>
		<td align="right">
			<s:submit value="登录"/>
			<s:reset value="清零"/>
		</td>
	</tr>
</table>
</s:form>
</body>
</html>

