<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到我的主页</title>
<script type="text/javascript">
	function getMechanism(btn) {
		var form = btn.form;
		form.action = "mechanism/login";
		form.submit();
	}
	function deleteMechanism(btn) {
		var form = btn.form;
		form.action = "mechanism/delete";
		form.submit();
	}
	function createMechanism(btn) {
		var form = btn.form;
		form.action = "mechanism/save";
		form.submit();
	}
</script>
</head>
<body>
	<form method="post">
		机构名称：<input name="Name" type="text" /><br /><input type="button"
			value="创建用户" onclick="createMechanism(this);" /> <input
			type="button" value="得到用户" onclick="getMechanism(this);" /> <input
			type="button" value="删除" onclick="deleteMechanism(this);" />
	</form>
	
	
	<c:out value="${Msg}"/>
</body>
</html>