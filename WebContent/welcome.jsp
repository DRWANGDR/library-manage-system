<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body bgcolor="#D9DFAA">
	<s:set var="login" value="#session['login']"/>
	管理员ID <s:property value="#login.sid"/>，欢迎来到图书信息管理系统.
</body>
</html>
