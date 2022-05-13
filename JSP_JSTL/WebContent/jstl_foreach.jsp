<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	int sum = 0;
	for(int i = 1; i <= 10; i++){
		sum += i;
	}
	out.println(sum);

%>
<hr/>

<c:set var="sum" value="0"/>
<c:forEach var="i" begin="1" end="10" step="1" varStatus="status">
<!--  여기서 i가 pagecontext에 저장된다 varStatus이놈은 forEach가 종료되면 사라진다
 드래서 forEach문에서만 사용이 가능하다-->
	<c:set var="sum" value="${sum+i }"/>
	${status.count } 회 반복 : ${sum }<br/>
</c:forEach>
${sum }

<hr/>
<c:set var="intList" value="<%=new ArrayList<Integer>() %>"/>
<c:set var="temp" value="${intList.add(1) }"/>
<c:set var="temp" value="${intList.add(2) }"/>


<c:forEach items="${intList }" var="k">
${k }
</c:forEach>
 