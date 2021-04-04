<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>图书管理系统</title>
</head>
<body bgcolor="#D9DFAA">
<s:form action="register" method="post" theme="simple">
<table>
	<caption>管理员账号密码更改</caption>
	
	   <tr>
		   <td>
			           新密码：<s:password name="login.password" size="21"/>
		   </td>
	   </tr>
	<tr>
		<td align="right">
			<s:submit value="确认"/>
			<s:reset value="清零"/>
		</td>
	</tr>
</table>
</s:form>
</body>
</html>

