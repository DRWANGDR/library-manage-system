<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<body bgcolor="#D9DFAA">
	<h3>Please input grade</h3>
	<hr>
	<s:form action="addorupdateStudentRecord" method="post">
		<table border="1" cellspacing="1" cellpadding="8" width="400">
			<tr>
				<td width="100">
					学生：
				</td>
				<td>
					<select name="record.id.sid">
						<s:iterator id="student" value="#request.list1">
							<option value="<s:property value="#student.sid"/>">
								<s:property value="#student.name"/>
							</option>
						</s:iterator>
					</select>
				</td>
			</tr>
			<tr>
				<td width="100">
					Course：
				</td>
				<td>
					<select name="record.id.cid">
						<s:iterator id="course" value="#request.list2">
							<option value="<s:property value="#course.cid"/>">
								<s:property value="#course.name"/>
							</option>
						</s:iterator>
					</select>
				</td>
			</tr>
			<tr>
				<s:textfield label="Grade" name="record.mark" size="15"></s:textfield>
			</tr>
		</table>
		<input type="submit" value="Confirm"/>
		<input type="reset" value="Reset"/>
	</s:form>
</body>