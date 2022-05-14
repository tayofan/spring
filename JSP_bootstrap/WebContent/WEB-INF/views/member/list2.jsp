<%@page import="com.jsp.command.PageMaker"%>
<%@page import="java.util.Map"%>
<%@page import="com.jsp.vo.MemberVO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.jsp.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set scope="page" var="pageMaker" value="${dataMap.get('pageMaker') }"/>

<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>AdminLTE 3 | Starter</title>

<!-- Google Font: Source Sans Pro -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
<!-- Font Awesome Icons -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/plugins/fontawesome-free/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/bootstrap/dist/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">

		<!-- Navbar -->
		<nav
			class="main-header navbar navbar-expand navbar-white navbar-light">
			<!-- Left navbar links -->
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" data-widget="pushmenu"
					href="#" role="button"><i class="fas fa-bars"></i></a></li>
				<li class="nav-item d-none d-sm-inline-block"><a
					href="index3.html" class="nav-link">Home</a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="#"
					class="nav-link">Contact</a></li>
				<li class="nav-item d-none d-sm-inline-block"><a href="#"
					class="nav-link">Contact</a></li>
			</ul>

			<!-- Right navbar links -->
			<ul class="navbar-nav ml-auto">
				<!-- Navbar Search -->
				<li class="nav-item"><a class="nav-link"
					data-widget="navbar-search" href="#" role="button"> <i
						class="fas fa-search"></i>
				</a>
					<div class="navbar-search-block">
						<form class="form-inline">
							<div class="input-group input-group-sm">
								<input class="form-control form-control-navbar" type="search"
									placeholder="Search" aria-label="Search">
								<div class="input-group-append">
									<button class="btn btn-navbar" type="submit">
										<i class="fas fa-search"></i>
									</button>

									<button class="btn btn-navbar" type="button"
										data-widget="navbar-search">
										<i class="fas fa-times"></i>
									</button>

								</div>
							</div>
						</form>
					</div></li>

				<!-- Messages Dropdown Menu -->
				<li class="nav-item dropdown"><a class="nav-link"
					data-toggle="dropdown" href="#"> <i class="far fa-comments"></i>
						<span class="badge badge-danger navbar-badge">3</span>
				</a>
					<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
						<a href="#" class="dropdown-item"> <!-- Message Start -->
							<div class="media">
								<img src="dist/img/user1-128x128.jpg" alt="User Avatar"
									class="img-size-50 mr-3 img-circle">
								<div class="media-body">
									<h3 class="dropdown-item-title">
										Brad Diesel <span class="float-right text-sm text-danger"><i
											class="fas fa-star"></i></span>
									</h3>
									<p class="text-sm">Call me whenever you can...</p>
									<p class="text-sm text-muted">
										<i class="far fa-clock mr-1"></i> 4 Hours Ago
									</p>
								</div>
							</div> <!-- Message End -->
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <!-- Message Start -->
							<div class="media">
								<img src="dist/img/user8-128x128.jpg" alt="User Avatar"
									class="img-size-50 img-circle mr-3">
								<div class="media-body">
									<h3 class="dropdown-item-title">
										John Pierce <span class="float-right text-sm text-muted"><i
											class="fas fa-star"></i></span>
									</h3>
									<p class="text-sm">I got your message bro</p>
									<p class="text-sm text-muted">
										<i class="far fa-clock mr-1"></i> 4 Hours Ago
									</p>
								</div>
							</div> <!-- Message End -->
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <!-- Message Start -->
							<div class="media">
								<img src="dist/img/user3-128x128.jpg" alt="User Avatar"
									class="img-size-50 img-circle mr-3">
								<div class="media-body">
									<h3 class="dropdown-item-title">
										Nora Silvester <span class="float-right text-sm text-warning"><i
											class="fas fa-star"></i></span>
									</h3>
									<p class="text-sm">The subject goes here</p>
									<p class="text-sm text-muted">
										<i class="far fa-clock mr-1"></i> 4 Hours Ago
									</p>
								</div>
							</div> <!-- Message End -->
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item dropdown-footer">See All
							Messages</a>
					</div></li>
				<!-- Notifications Dropdown Menu -->
				<li class="nav-item dropdown"><a class="nav-link"
					data-toggle="dropdown" href="#"> <i class="far fa-bell"></i> <span
						class="badge badge-warning navbar-badge">15</span>
				</a>
					<div class="dropdown-menu dropdown-menu-lg dropdown-menu-right">
						<span class="dropdown-header">15 Notifications</span>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <i
							class="fas fa-envelope mr-2"></i> 4 new messages <span
							class="float-right text-muted text-sm">3 mins</span>
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <i
							class="fas fa-users mr-2"></i> 8 friend requests <span
							class="float-right text-muted text-sm">12 hours</span>
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item"> <i class="fas fa-file mr-2"></i>
							3 new reports <span class="float-right text-muted text-sm">2
								days</span>
						</a>
						<div class="dropdown-divider"></div>
						<a href="#" class="dropdown-item dropdown-footer">See All
							Notifications</a>
					</div></li>
				<li class="nav-item"><a class="nav-link"
					data-widget="fullscreen" href="#" role="button"> <i
						class="fas fa-expand-arrows-alt"></i>
				</a></li>
				<li class="nav-item"><a class="nav-link"
					data-widget="control-sidebar" data-slide="true" href="#"
					role="button"> <i class="fas fa-th-large"></i>
				</a></li>
			</ul>
		</nav>
		<!-- /.navbar -->

		<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4">
			<!-- Brand Logo -->
			<a href="index3.html" class="brand-link"> <img
				src="dist/img/AdminLTELogo.png" alt="AdminLTE Logo"
				class="brand-image img-circle elevation-3" style="opacity: .8">
				<span class="brand-text font-weight-light">AdminLTE 3</span>
			</a>

			<!-- Sidebar -->
			<div class="sidebar">
				<!-- Sidebar user panel (optional) -->
				<div class="user-panel mt-3 pb-3 mb-3 d-flex">
					<div class="image">
						<img src="dist/img/user2-160x160.jpg"
							class="img-circle elevation-2" alt="User Image">
					</div>
					<div class="info">
						<a href="#" class="d-block">Alexander Pierce</a>
					</div>
				</div>

				<!-- SidebarSearch Form -->
				<div class="form-inline">
					<div class="input-group" data-widget="sidebar-search">
						<input class="form-control form-control-sidebar" type="search"
							placeholder="Search" aria-label="Search">
						<div class="input-group-append">
							<button class="btn btn-sidebar">
								<i class="fas fa-search fa-fw"></i>
							</button>
						</div>
					</div>
				</div>

				<!-- Sidebar Menu -->
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column"
						data-widget="treeview" role="menu" data-accordion="false">
						<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
						<li class="nav-item menu-open">
							<ul class="nav nav-treeview">
								<li class="nav-item"><a href="list" class="nav-link active">
										<i class="far fa-circle nav-icon"></i>
										<p>숙제 게시판</p>
								</a></li>
								<li class="nav-item"><a
									href="<%=request.getContextPath()%>/member/list"
									class="nav-link"> <i class="far fa-circle nav-icon"></i>
										<p>숙제 회원 리스트</p>
								</a></li>
							</ul>
						</li>
						<li class="nav-item"><a href="#" class="nav-link"> <i
								class="nav-icon fas fa-th"></i>
								<p>
									Simple Link <span class="right badge badge-danger">New</span>
								</p>
						</a></li>
					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<div class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1 class="m-0">숙제 게시판</h1>
						</div>
						<!-- /.col -->
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">게시판 리스트</li>
							</ol>
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- /.content-header -->

			<!-- Main content -->
			<div class="content">
				<div class="container-fluid">

					<div class="card">
						<div class="card-header">
							<h3 class="card-title">게시판 리스트</h3>
							<div class="card-tools">
								<div class="input-group input-group-sm" style="width: 500px;">
									<select class="form-control col-md-3" name="perPageNum" 
								  			id="perPageNum" onchange="">					  		  		
								  		<option value="10" ${pageMaker.cri.perPageNum==10 ? "selected":""}>정렬개수</option>
								  		<option value="2" ${pageMaker.cri.perPageNum==2 ? "selected":""}>2개씩</option>
								  		<option value="3" ${pageMaker.cri.perPageNum==3 ? "selected":""}>3개씩</option>
								  		<option value="5" ${pageMaker.cri.perPageNum==5 ? "selected":""}>5개씩</option>
					  				</select>
					  				<select class="form-control col-md-3" name="searchType" id="searchType">
								 		<option value=""  >검색구분</option>
										<option value="i" ${param.searchType=='i' ? "selected":""}>아이디</option>
										<option value="n" ${param.searchType=='n' ? "selected":""}>이 름</option>
										<option value="p" ${param.searchType=='p' ? "selected":""}>전화번호</option>
										<option value="e" ${param.searchType=='e' ? "selected":""}>이메일</option>				 									
									</select>
									<input type="text" name="keyword" value="${param.keyword}"
										class="form-control float-right" placeholder="Search">
									<div class="input-group-append">
										<button type="button" onclick="list_go(1);" class="btn btn-default">
											<i class="fas fa-search"></i>
										</button>
									</div>
 
									<c:set var="member" value="${session.member }"/>
									<c:if test="${not empty member}">
										<button type="button"
											onclick="location.href='<%=request.getContextPath()%>/member/logout'"
											class="btn-xs btn-default">로그아웃</button>
										<button type="button" onclick="location.href='regist'"
											class="btn-xs btn-default">등록하기</button>
									</c:if>
					
									


 
									<c:if test="${empty member}">
										<button type="button"
											onclick="location.href='<%=request.getContextPath()%>/member/login'"
											class="btn-xs btn-default">로그인</button>
										<button type="button"
											onclick="location.href='<%=request.getContextPath()%>/member/regist'"
											class="btn-xs btn-default">회원가입</button>
									</c:if>		
									

		
								</div>
							</div>
						</div>
						<!-- /.card-header -->
						<div class="card-body table-responsive p-0">
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
						
								<c:if test="${not empty dataMap.get('boardList')}">
	                  				<c:forEach items="${dataMap.get('boardList') }" var="board">
									 	<tr>
											<td class="txt_center">${board.bno }</td>
											<td class="board_detail" style="cursor: pointer;"
												onclick="location.href='detail?bno=${board.bno}&viewCnt=${board.viewCnt}';">${board.title }</td>
											<td class="txt_center">${board.writer }</td>
											
											<td class="txt_center">
											<fmt:formatDate value="<%=new Date() %>" pattern="yyyy/MM/dd" var="today"/>
											<fmt:formatDate value="${board.regDate }" pattern="yyyy/MM/dd" var="board_YMD"/>
											<c:if test="${board_YMD ne today}">
												<fmt:formatDate value="${board.regDate }" pattern="yyyy/MM/dd"/>
					
											</c:if>
											
											<c:if test="${board_YMD eq today}">
												<fmt:formatDate value="${board.regDate }" pattern="HH:mm"/>					
											</c:if>
											
											</td>
	
	
	
											<td class="txt_center">${board.viewCnt }</td>
										</tr>
	                  				</c:forEach>
								</c:if>
								<c:if test="${empty dataMap.get('boardList')}">
									<td colspan="5" class="text-center">
	            						해당내용이 없습니다.
	            					</td>
								</c:if>
                  
						</tbody>
							</table>
						</div>
						<div class="card-footer">
							<nav aria-label="Navigation">
								<ul class="pagination justify-content-center m-0">
									<li class="page-item">
										<a class="page-link" href="javascript:list_go(1);">
											<i class="fas fa-angle-double-left"></i>
										</a>
									</li>
									
								
									<li class="page-item">
										<a class="page-link" href="javascript:list_go(${pageMaker.startPage - 1});">
											<i class="fas fa-angle-left"></i>
										</a>						
									</li>
									
								
								
								
								<c:forEach var="i" begin="${pageMaker.startPage}" end="${pageMaker.endPage}" step="1" >
							
									<li class="page-item  ${i eq pageMaker.cri.page ? 'active':''}">
									
										<a class="page-link" href="javascript:list_go(${i });">${i }</a>
									</li>	
								</c:forEach>
								
										
										
									<li class="page-item">
										<a class="page-link" href="javascript:list_go(${pageMaker.endPage} + 1);">
											<i class="fas fa-angle-right"></i>
										</a>						
									</li>
									<li class="page-item">
										<a class="page-link" href="javascript:list_go(${pageMaker.realEndPage});">
											<i class="fas fa-angle-double-right"></i>
										</a>						
									</li>
								</ul>
							</nav>
						</div>
						<!-- /.card-body -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
			<div class="p-3">
				<h5>Title</h5>
				<p>Sidebar content</p>
			</div>
		</aside>
		<!-- /.control-sidebar -->

		<!-- Main Footer -->
		<footer class="main-footer">
			<!-- To the right -->
			<div class="float-right d-none d-sm-inline">Anything you want</div>
			<!-- Default to the left -->
			<strong>Copyright &copy; 2014-2021 <a
				href="https://adminlte.io">AdminLTE.io</a>.
			</strong> All rights reserved.
		</footer>
	</div>
	<!-- ./wrapper -->

	<!-- REQUIRED SCRIPTS -->
<form id="jobForm">	
	<input type='hidden' name="page" value="" />
	<input type='hidden' name="perPageNum" value=""/>
	<input type='hidden' name="searchType" value="" />
	<input type='hidden' name="keyword" value="" />
</form>
  
  
  <script>
	function list_go(page,url){
		//alert(page);
		if(!url) url="list";
		
		var jobForm=$('#jobForm');
		jobForm.find("[name='page']").val(page);
		jobForm.find("[name='perPageNum']").val($('select[name="perPageNum"]').val());
		jobForm.find("[name='searchType']").val($('select[name="searchType"]').val());
		jobForm.find("[name='keyword']").val($('div.input-group>input[name="keyword"]').val());
		
		jobForm.attr({
			action:url,
			method:'get'
		}).submit();
		
	}
  </script>
	<!-- jQuery -->
	<script
		src="<%=request.getContextPath() %>/resources/bootstrap/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap 4 -->
	<script
		src="<%=request.getContextPath() %>/resources/bootstrap/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- AdminLTE App -->
	<script
		src="<%=request.getContextPath() %>/resources/bootstrap/dist/js/adminlte.min.js"></script>
</body>
</html>