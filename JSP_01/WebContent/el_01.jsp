<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
	//pageContext.setAttribute("msg", "pageContext");
	//request.setAttribute("msg", "request");
	//session.setAttribute("msg", "session");
	application.setAttribute("msg", "application");
%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${msg}</h1>
</body>
</html>