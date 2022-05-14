package com.jsp.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dataSource.DataSource;
import com.jsp.service.BoardService;
import com.jsp.service.BoardServiceImpl;
import com.jsp.vo.BoardVO;

@WebServlet("/board/detail")
public class BoardDetailServlet extends HttpServlet {
	private BoardService boardservice = new BoardServiceImpl(); 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		request.setCharacterEncoding("utf-8");
		int bno = Integer.parseInt(request.getParameter("bno"));
		//int viewCnt = 0; 
		String url = "/WEB-INF/views/board/starter_detail.jsp";
		BoardVO board = null;
		try {
			board = boardservice.getBoardDetail(bno);
			board.setRegDate(board.getRegDate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(board.getRegDate());
//		//처리
//		if(request.getParameter("viewCnt") != null) {
//			viewCnt = Integer.parseInt(request.getParameter("viewCnt"));
//			dataSource.getBoardList().get(bno).setViewCnt(viewCnt+1);
//		}
		
		
		//출력
		request.setAttribute("board", board);
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
