<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body bgcolor="#D9DFAA">
	<h3>This student gets：</h3>
	<hr width="700" align="left">
	<table border="1" cellspacing="1" cellpadding="8" width="700">
		<tr>
			<th>课程名称</th><th>成绩</th><th>评级</th>
		</tr>
		<s:iterator value="#request.list" id="studentrecord">
		<tr>
			<td><s:property value="#studentrecord[2]"/></td>
			<td><s:property value="#studentrecord[3]"/></td>
			<td><s:property value="#studentrecord[4]"/></td>
		</tr>
		</s:iterator>
	</table>
	<input type="button" value="Return" onClick="javaScript:history.back()"/>
</body>
</html>
