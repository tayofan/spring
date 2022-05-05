package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dataSource.DataSource;

@WebServlet("/member/delete")
public class MemberDeleteServlet extends HttpServlet {
	
	private DataSource dataSource = DataSource.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		String id = request.getParameter("id");
//		String url = request.getContextPath()+"/member/list";
		String result = "";
		
		//처리
		dataSource.getMemberList().remove(id);
		
		// 회원삭제 성공하면....
		result += "회원삭제 성공";
		
//		url += "?result=delete1";
		
		//출력
//		response.sendRedirect(url);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert(" + result + ")");
		out.println("location.href='list'");
		out.println("</script>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
