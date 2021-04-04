<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body bgcolor="#D9DFAA">
	<table border="1" cellspacing="1" cellpadding="8" width="700">
		<tr align="center" bgcolor="silver">
			<th>ID</th><th>姓名</th>
		</tr>
		<s:iterator value="#request.list" id="student">
		<tr>
			<td><s:property value="#student.sid"/></td>
			<td><s:property value="#student.name"/></td>
		</tr>
		</s:iterator>
		<tr>
			<s:set var="page" value="#request.page"></s:set>
			<s:if test="#page.hasFirst">
				<s:a href="studentInfo.action?pageNow=1">First</s:a>
			</s:if>
			<s:if test="#page.hasPre">
				<a href="studentInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">Previous</a>
			</s:if>
			<s:if test="#page.hasNext">
				<a href="studentInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">Next</a>
			</s:if>
			<s:if test="#page.hasLast">
				<a href="studentInfo.action?pageNow=<s:property value="#page.totalPage"/>">Last</a>
			</s:if>
		</tr>
	</table>
</body>
</html>