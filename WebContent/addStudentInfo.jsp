<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head></head>
<body bgcolor="#D9DFAA">
	<h3>添加借阅信息</h3>
	<hr width="700" align="left">
	<s:form action="addStudent" method="post" enctype="multipart/form-data">
		<table border="0" cellspacing="0" cellpadding="1">
			<tr>
				<td>
					 <s:textfield name="student.sid" label="ID" value=""></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="student.name" label="姓名" value=""></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:radio name="student.gender" value="1" list="#{1:'是',0:'否'}" label="是否完整"/>
				</td>
			</tr>
			<tr>
				<s:select name="student.major.mid" list="list" listKey="mid" listValue="name" headerKey="0"
 									 headerValue="--选择借阅书籍--" label="书名"></s:select>
			</tr>
			<tr>
				<s:textfield name="student.birthday" label="日期" value=""></s:textfield>
			</tr>
			<tr>
				<td>
					<s:textfield name="student.credit" label="图书出版号" value=""></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:textfield name="student.remarks" label="补充" value=""></s:textfield>
				</td>
			</tr>
			<tr>
				<td>
					<s:file name="photoFile" label="照片" value=""></s:file>
				</td>
			</tr>
		</table>
		<p>
		<input type="submit" value="添加"/>
		<input type="reset" value="重置"/>
	</s:form>
</body>
</html>
