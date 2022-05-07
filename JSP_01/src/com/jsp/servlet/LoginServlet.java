package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dataSource.DataSource;
import com.jsp.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/member/login")
public class LoginServlet extends HttpServlet {
	private DataSource dataSource = DataSource.getInstance();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/member/login.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 입력(id/pwd)
		String id = request.getParameter("id");
		System.out.println(id);
		String pwd = request.getParameter("pwd");
		String url = "";
		HttpSession session = request.getSession();
		
		String result = "";
		Map<String, Member> memberMap = dataSource.getMemberList();
		Member member = null;
		
		// 로그인 처리
		if(id!=null && memberMap.containsKey(id)) {
			member = dataSource.getMemberList().get(id);
			if(pwd!=null && pwd.equals(member.getPwd())) {
				result += "로그인 성공";
				url += request.getContextPath() + "/board/list";
				session.setAttribute("member",member);
			}else {
				result += "암호 불일치";
				url += request.getContextPath() + "/board/list";
			}
		}else {
			result += "아이디 불일치";
			url += request.getContextPath() + "/board/list";
		}
		
		// 출력
		response.setContentType("text/html;charset=utf-8"); 
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('" + result + "');");
		out.println("location.href='" + url + "'");
		out.println("</script>");
	}

}
