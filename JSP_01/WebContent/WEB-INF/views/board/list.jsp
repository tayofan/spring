<%@page import="com.jsp.vo.Member"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.jsp.vo.Board"%>
<%@page import="java.util.List"%>
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
<style>
.board_detail:hover{
	text-decoration: underline;
}
.txt_center{
	text-align: center;
}
.container.mt-3{
	width: 900px;
	min-width: 900px;
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
	
	
	<div class="container mt-3">
		
<%-- 		<table class="table table-hover">
			<thead class="table-success">
				<tr>
					<th class="txt_center" style="width: 8%;">번호</th>
					<th>제목</th>
					<th class="txt_center" style="width: 15%;">작성자</th>
					<th class="txt_center" style="width: 15%;">등록일</th>
					<th class="txt_center" style="width: 8%;">조회수</th>
				</tr>
			</thead>
			<tbody>
		<%
			List<Board> boardList = (List<Board>)request.getAttribute("boardList");
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
			String today = format.format(new Date());
			if(boardList != null) for(Board board : boardList){
				pageContext.setAttribute("board", board);
		%>
				<tr>
					<td class="txt_center">${board.bno }</td>
					<td class="board_detail" style="cursor:pointer;" onclick="location.href='detail?bno=${board.bno}&viewCnt=${board.viewCnt}';">${board.title }</td>
					<td class="txt_center">${board.writer }</td>
 			<% 
				if(today.equals(board.getDateYMD())){
			%>
					<td class="txt_center dateHM">${board.dateHM }</td>
			<% 
				}else{
			%>
					<td class="txt_center dateYMD">${board.dateYMD }</td>
 			<%					
				}
			%>
					
					
					<td class="txt_center">${board.viewCnt }</td>
				</tr>
<%
			}
%>
			</tbody>
		</table> --%>
		<table class="table table-hover text-nowrap">
                  <thead>
                    <tr>
                      <th>번호</th>
                      <th>제목</th>
                      <th>작성자</th>
                      <th>작성일</th>
                      <th>조회수</th>
                    </tr>
                  </thead>
                  <tbody>
                  
<%
			List<Board> boardList = (List<Board>)request.getAttribute("boardList");
			SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
			String today = format.format(new Date());
			if(boardList != null) for(Board board : boardList){
				pageContext.setAttribute("board", board);
		%>
				<tr>
					<td class="txt_center">${board.bno }</td>
					<td class="board_detail" style="cursor:pointer;" onclick="location.href='detail?bno=${board.bno}&viewCnt=${board.viewCnt}';">${board.title }</td>
					<td class="txt_center">${board.writer }</td>
 			<% 
				if(today.equals(board.getDateYMD())){
			%>
					<td class="txt_center dateHM">${board.dateHM }</td>
			<% 
				}else{
			%>
					<td class="txt_center dateYMD">${board.dateYMD }</td>
 			<%					
				}
			%>
					
					
					<td class="txt_center">${board.viewCnt }</td>
				</tr>
<%
			}
%>                   	
                  </tbody>
                </table>
<%
		if(member != null){
%>
		<input type="button" value="등록하기" onclick="location.href='regist'">
<% 
		}else{
%>
		<input type="button" value="등록하기" onclick="alert('로그인을 해주세요!!!!!!!!')">
<%			
		}
%>
		
		
	</div>
</body>


</html>