<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body bgcolor="#D9DFAA">
	<h3>该学生信息如下：</h3>
	<s:set var="student" value="#request.student"></s:set>
	<s:form action="studentInfo" method="post">
		<table border="0" cellpadding="5">
			<tr>
				<td>ID：</td>
				<td width="100">
					<s:property value="#student.sid"/>
				</td>
				<td rowspan="7">
					<img src="getImage.action?student.sid=<s:property value="#student.sid"/>" width="120"
											   height="150">
				</td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td width="100">
					<s:property value="#student.name"/>
				</td>
			</tr>
			<tr>
				<td>是否完整：</td>
				<td width="100">
					<s:if test="#student.gender==1">完整</s:if>
					<s:else>缺损</s:else>
				</td>
			</tr>
			<tr>
				<td>书名：</td>
				<td width="100">
					<s:property value="#student.major.name"/>
				</td>
			</tr>
			<tr>
				<td>日期：</td>
				<td width="100">
					<s:property value="#student.birthday"/>
				</td>
			</tr>
			<tr>
				<td>图书出版号</td>
				<td width="100">
					<s:property value="#student.credit"/>
				</td>
			</tr>
			<tr>
				<td>备注</td>
				<td width="100">
					<s:property value="#student.remarks"/>
				</td>
			</tr>
			<tr>
				<td align="right">
					<s:submit value="return"/>
				</td>
			</tr>
		</table>
	</s:form>
</body>
</html>
