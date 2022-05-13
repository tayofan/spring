package com.jsp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dataSource.DataSource;
import com.jsp.vo.MemberVO;

@WebServlet("/member/regist")
public class MemberRegistServlet extends HttpServlet {
	
	private DataSource dataSource = DataSource.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/WEB-INF/views/member/regist2.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//입력
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String url = request.getContextPath()+"/board/list";
		String result = "";
		
		//처리
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPwd(pwd);
		
		//memberService.regist(member); <-----DB저장
		
		
		dataSource.getMemberList().put(id, member);
		// 회원가입 성공하면......
		
		//url += "?result=regist1";
		result += "회원가입 성공";
		
		//출력

		//response.sendRedirect(url);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('" + result + "')");
		//out.println("location.href='list'");
		out.println("location.href='" + url + "'");
		out.println("</script>");	
	}
}








