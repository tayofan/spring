<%@page import="com.jsp.vo.Member"%>
<%@page import="com.jsp.vo.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link rel="stylesheet" href="../login.css">
<title>Insert title here</title>
<style type="text/css">
.container.main{
	width: 800px;
}
.header{
	margin-bottom: 20px;
    padding-bottom: 20px;
    border-bottom: 1px solid #ebecef;
}
.col, .col-3{
	padding-top: 12px;
	padding-bottom: 12px;
	font-size: 15px;
}
.center {
	text-align: center;
}
.topnav input[type=password]{
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
  width: 150px; /* adjust as needed (as long as it doesn't break the topnav) */
}
</style>
</head>
<body>
<div class="topnav">
	  <a class="active" href="<%=request.getContextPath()%>/board/list">Home</a>
	  <div class="login-container">
<% 
	Member member = (Member)session.getAttribute("member");
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
	
	<div class="container main p-0" style="margin-top: 20px; margin-bottom: 20px;">
		<h1>게시글 상세</h1>
	</div>
	
	<div class="container main border border-1s rounded p-0">
		<div class="container content">
			<div class='row border-bottom'>
				<div class="col bg-light center">글 번호</div>
				<div class="col">${board.bno }</div>
				<div class="col bg-light center">조회수</div>
				<div class="col">${board.viewCnt }</div>
			</div>
			
			<div class='row border-bottom'>
				<div class="col bg-light center">작성자</div>
				<div class="col">${board.writer }</div>
				<div class="col bg-light center">작성일</div>
				<div class="col">${board.dateYMD}</div>
			</div>
			
			<div class='row border-bottom'>
				<div class="col-3 bg-light center">제목</div>
				<div class="col">${board.title }</div>
			</div>
		</div>
		<div class="container content" style="padding: 20px 20px;">
			<label for="comment">내용:</label><br>
			<textarea rows="5" cols="40" name="content" style="width: 100%; height: 400px; resize: none;" disabled="disabled">${board.content }</textarea><br>
			
<% 

		Board board = (Board)request.getAttribute("board");
		if(member != null){
			if(board.getWriter().equals(member.getId())){
%>
			<input type="button" onclick="location.href='update?bno=${board.bno}'" value="수정">
			<input type="button" onclick="location.href='delete?bno=${board.bno}'" value="삭제">

<%
				
			}
		}
%>
			
			
		</div>
			
	</div>
	<div class="container main p-0">
		<input type="button" onclick="location.href='list'" value="목록">
	</div>
	
</body>
</html>