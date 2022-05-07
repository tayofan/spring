package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dataSource.DataSource;
import com.jsp.vo.Member;

@WebServlet("/member/update")
public class MemberUpdateServlet extends HttpServlet {
	private DataSource dataSource = DataSource.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/member/update.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		String id = request.getParameter("id");
		String new_id = request.getParameter("new_id");
		String new_pwd = request.getParameter("new_pwd");
		//String url = request.getContextPath()+"/member/list";
		//String url = request.getContextPath()+"/member/detail?id=" + id;
		String result = "";
		
		//처리
		Member member = dataSource.getMemberList().get(id);
		member.setId(new_id);
		member.setPwd(new_pwd);
		
		dataSource.getMemberList().remove(id);
		
		dataSource.getMemberList().put(new_id, member);
		
		// 회원수정 성공하면.....
		//url += "?result=update1";
		result += "회원수정 성공";
	
		//출력

		//response.sendRedirect(url);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('" + result + "')");
		out.println("location.href='list'");
		out.println("</script>");		
	}
}
