package com.jsp.servlet.board;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsp.dataSource.DataSource;
import com.jsp.vo.Board;
import com.jsp.vo.Member;

@WebServlet("/board/regist")
public class BoardRegistServlet extends HttpServlet {
	private DataSource dataSource = DataSource.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/board/regist2.jsp";
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		//입력
		String title = request.getParameter("title");
		System.out.println(title);
		String writer = member.getId();
		String content = request.getParameter("content");
		int bno = dataSource.getBoardList().size();
		
		String url = request.getContextPath() + "/board/list";
		
		//처리
		Board board = new Board();
		board.setBno(bno);
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		board.setViewCnt(0);
		board.setRegDate(new Date());
		
		dataSource.getBoardList().put(""+bno, board);
		
		//출력
		response.sendRedirect(url);
		
	}

}
