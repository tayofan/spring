<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	
	<form action="update?id=${param.id}" method="post" >
		아이디 : <input type="text" name="new_id" pattern="^([a-z0-9_]){6,50}$" required/><br/>
		패스워드 : <input type="password" name="new_pwd" pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,}$" required/><br/>
		<input type="submit" value="수정" />
		<input type="button" onclick="location.href='detail?id=${param.id}'" value="취소" />
	</form>
</body>
</html>