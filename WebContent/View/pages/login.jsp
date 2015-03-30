<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<script type="text/javascript">

	function reloadVerifyCode() {
		document.getElementById('verifyCodeImage').setAttribute('src',
				'shiro/getVerifyCodeImage');
	}

</script>
</head>
<body>


	<div style="color: red; font-size: 22px;">${message_login}</div>

	<form action="shiro/login" method="POST">
		姓名：<input type="text" name="username" /><br /> 密码：<input type="text"
			name="password" /><br /> 验证：<input type="text" name="verifyCode" />
		&nbsp;&nbsp; <img id="verifyCodeImage" onclick="reloadVerifyCode()"
			src="shiro/getVerifyCodeImage" /><br />
		<input type="submit" value="确认" />
	</form>
</body>
</html>