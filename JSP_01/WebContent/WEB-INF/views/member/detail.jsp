<%@page import="com.jsp.vo.Member"%>
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
	<h1>아이디: ${member.id }</h1>
	<h1>패스워드: ${member.pwd }</h1>
	<input type="button" value="리스트로 돌아가기" onclick="location.href='list'">
	<input type="button" value="수정" onclick="location.href='update?id=${member.id }'">
	<input type="button" value="삭제" onclick="location.href='delete?id=${member.id }'">
</body>
</html>