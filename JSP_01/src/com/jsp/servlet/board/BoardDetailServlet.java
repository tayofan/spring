package com.jsp.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dataSource.DataSource;
import com.jsp.vo.Board;

@WebServlet("/board/detail")
public class BoardDetailServlet extends HttpServlet {
	private DataSource dataSource = DataSource.getInstance(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		request.setCharacterEncoding("utf-8");
		String bno = request.getParameter("bno");
		int viewCnt = 0; 
		String url = "/WEB-INF/views/board/detail.jsp";
		Board board = dataSource.getBoardList().get(bno);
		
		//처리
		if(request.getParameter("viewCnt") != null) {
			viewCnt = Integer.parseInt(request.getParameter("viewCnt"));
			dataSource.getBoardList().get(bno).setViewCnt(viewCnt+1);
		}
		
		
		//출력
		request.setAttribute("board", board);
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
