<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add" method="post">
		<table>
			<tr>
				<td>name:</td>
				<td>age:</td>
			</tr>
			<tr>
				<td><input type="text" name="username"></td>
				<td><input type="text" name="age"></td>

			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="添加"></td>
			</tr>
		</table>
	</form>
</body>
</html>