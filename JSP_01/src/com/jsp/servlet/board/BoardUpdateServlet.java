package com.jsp.servlet.board;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dataSource.DataSource;
import com.jsp.vo.Board;

@WebServlet("/board/update")
public class BoardUpdateServlet extends HttpServlet {
	private DataSource dataSource = DataSource.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//입력
		String bno = request.getParameter("bno");
		String url = "/WEB-INF/views/board/update.jsp";
		Board board = dataSource.getBoardList().get(bno);
		
		//처리
		
		
		//출력
		request.setAttribute("board", board);
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//입력
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String bno = request.getParameter("bno");
		
		String url = request.getContextPath() + "/board/detail?bno=" + bno;
		
		//처리
		Board board = dataSource.getBoardList().get(bno);
		board.setTitle(title);
		board.setContent(content);
		board.setRegDate(new Date());
		
		dataSource.getBoardList().put(bno, board);
		
		//출력
		response.sendRedirect(url);
		
		
	}

}
