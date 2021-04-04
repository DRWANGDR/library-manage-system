<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body bgcolor="#D9DFAA">
	<table border="1" cellspacing="1" cellpadding="8" width="700">
		<tr bgcolor="silver">
			<th>ID</th><th>Name</th><th>Course Name</th><th>Grade</th><th>Credit</th><th>Delete</th>
		</tr>
		<s:iterator value="#request.list" id="studentRecord">
		<tr>
			<td>
				<a href="findStudentRecord.action?record.id.sid=<s:property value="#studentRecord[0]"/>">
					<s:property value="#studentRecord[0]"/>
				</a>
			</td>
			<td><s:property value="#studentRecord[1]"/></td>
			<td><s:property value="#studentRecord[2]"/></td>
			<td><s:property value="#studentRecord[3]"/></td>
			<td><s:property value="#studentRecord[4]"/></td>
			<td>
				<a href="deleteOneStudentRecord.action?record.id.sid=<s:property value="#studentRecord[0]"/>&record.id.cid=
					<s:property value="#studentRecord[5]"/>" onClick="if(!confirm('Do you want to delete？')) 
					return false;else return true;">Delete</a>
			</td>
		</tr>
		</s:iterator>
		<tr align="left">
			<s:set var="page" value="#request.page"></s:set>
			<s:if test="#page.hasFirst">
				<s:a href="studentRecordInfo.action?pageNow=1">First</s:a>
			</s:if>
			<s:if test="#page.hasPre">
				<a href="studentRecordInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">Prev</a>
			</s:if>
			<s:if test="#page.hasNext">
				<a href="studentRecordInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">Next</a>
			</s:if>
			<s:if test="#page.hasLast">
				<a href="studentRecordInfo?pageNow=<s:property value="#page.totalPage"/>">Last</a>
			</s:if>
		</tr>
	</table>
</body>
</html>
