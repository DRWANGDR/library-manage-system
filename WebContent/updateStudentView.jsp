<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body bgcolor="#D9DFAA">
	<s:set var="student" value="#request.studentInfo"></s:set>
	<s:form action="updateStudent" method="post" enctype="multipart/form-data">
		<table border="0" cellspacing="1" cellpadding="8" width="500">
			<tr>
				<td width="80">ID：</td>
				<td>
					<input type="text" name="student.sid" value="<s:property value="#student.sid"/>" readonly/>
				</td>
			</tr>
			<tr>
				<td width="80">姓名：</td>
				<td>
					<input type="text" name="student.name"	value="<s:property value="#student.name"/>"/>
				</td>
			</tr>
			<tr>
				<td width="80">
					<s:radio list="#{1:'完整',0:'缺损'}" value="#student.gender"	label="是否完整" name="student.gender"></s:radio>
				</td>
			</tr>
			<tr>
				<td width="80">书名：</td>
				<td>
					<select name="student.major.mid">
						<s:iterator value="#request.majors" id="major">
							<option value="<s:property value="#major.mid"/>">
								<s:property value="#major.name"/>
							</option>
						</s:iterator>
					</select>
				</td>
			</tr>
			<tr>
				<td width="80">日期：</td>
				<td>
					<input type="text" name="student.birthday" value="<s:property value="#student.birthday"/>"/>
				</td>
			</tr>
			<tr>
				<td width="80">图书出版号：</td>
				<td>
					<input type="text" name="student.credit" value="<s:property value="#student.credit"/>"/>
				</td>
			</tr>
			<tr>
				<td width="80">备注：</td>
				<td>
					<input type="text" name="student.remarks" value="<s:property value="#student.remarks"/>"/>
				</td>
			</tr>
			<tr>
				<td>照片</td>
				<td>
					<input type="file" name="photoFile"/>
				</td>
			</tr>
		</table>
		<input type="submit" value="submit"/>
		<!-- 返回上一界面 -->
		<input type="button" value="return" onclick="javascript:history.back();"/>
	</s:form>
	<script type="text/javascript">
		document.getElementById("student.major.mid").value= ‘<s:property value="#student.major.mid"/>’
	</script>
</body>
</html>
