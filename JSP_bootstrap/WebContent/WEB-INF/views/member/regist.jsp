<%@page import="com.jsp.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="../css/login.css">
<link rel="stylesheet" href="../css/regist.css">
<style type="text/css">
.topnav input[type=password]{
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
  width: 150px; /* adjust as needed (as long as it doesn't break the topnav) */
}
.topnav{
	height: 53.2px;
}
</style>
</head>
<body>
	<div class="topnav">
	  <a class="active" href="<%=request.getContextPath()%>/board/list">Home</a>
	  <div class="login-container">
<% 
	MemberVO member = (MemberVO)session.getAttribute("member");
	if(member != null){
%>
		<button type="button" onclick="location.href='<%=request.getContextPath()%>/member/logout'">로그아웃</button>

<% 
	}else{
%>
		
	    <form action="<%= request.getContextPath()%>/member/login" method="post">
	      <button type="button" onclick="location.href='<%=request.getContextPath()%>/member/regist'">회원가입</button>
	      <input type="text" placeholder="아이디" name="id">
	      <input type="password" placeholder="비밀번호" name="pwd">
	      <button type="submit">로그인</button>
	    </form>
		
<%		
	}
%>
	  </div>
	</div>
	
	<form action="regist" method="post">
		<div class="container">
			<h1>회원 가입</h1>
			<p>회원 정보를 입력해 주세요.</p>
			<hr>
			
			<label for="email"><b>아이디</b></label>
			<input type="text" placeholder="아이디 입력" name="id" id="email" pattern="^([a-z0-9_]){6,50}$" required>
			
			<label for="psw"><b>비밀번호</b></label>
			<input type="password" placeholder="비밀번호 입력" name="pwd" id="psw" pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,}$" required>
			
			<label for="psw-repeat"><b>비밀번호 확인</b></label>
			<input type="password" placeholder="비밀번호 확인" name="psw-repeat" id="psw-repeat" pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,}$" required>
			<hr>

			<button type="submit" class="registerbtn">가입하기</button>
		</div>
	</form>
	
	
		
	<%-- <form action="regist" method="post" >
		아이디 : <input type="text" name="id" pattern="^([a-z0-9_]){6,50}$" required/><br/>
		패스워드 : <input type="password" name="pwd" pattern="^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,}$" required/><br/>
		<input type="submit" value="가입" />
		<input type="button" onclick="location.href='<%=request.getContextPath() %>/board/list'" value="취소" />
	</form> --%>
</body>
</html>