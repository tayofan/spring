<%@page import="java.util.List"%>
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
<!-- <script type="text/javascript">
	window.onload=function(){
		//입력
		var res = "";
		var param = "${param.result}"
		var flag = true;
		//처리
		
		switch(param){
			case "update1": res += "회원수정 성공"; break;
			case "update0": res += "회원수정 실패"; break;
			case "regist1": res += "회원가입 성공"; break;
			case "regist0": res += "회원가입 실패"; break;
			case "delete1": res += "회원삭제 성공"; break;
			case "delete0": res += "회원삭제 실패"; break;
			default:
				flag = false;
		}

		//출력
		if(flag){
			alert(res);
			location.href="list";
		}
	}
</script> -->
<style type="text/css">
th, td{
	text-align: center;
}
</style>
</head>
<body>
	<div class="container mt-3">
	<input type="button" value="가입하기" onclick="location.href='regist'">
	
	<table class="table table-bordered center">
		<thead class="table-success">
			<tr>
				<th>번호</th>
				<th>아이디</th>
				<th>비밀번호</th>
				<th>상세보기</th>
			</tr>
		</thead>
		<tbody>
<%
	List<Member> memberList = (List<Member>)request.getAttribute("memberList");
	int count = 0;
	if(memberList != null) for(Member member: memberList){
		pageContext.setAttribute("member", member);
		pageContext.setAttribute("num", count++);
%>
			<tr>
				<td>${num }</td>
				<td>${member.id }</td>
				<td>${member.pwd }</td>
				<td><input type="button" value="상세보기" onclick="location.href='detail?id=${member.id }'"></td>
			</tr>
<%
	}
%>		
		</tbody>
		
	</table>
	</div>
</body>
</html>