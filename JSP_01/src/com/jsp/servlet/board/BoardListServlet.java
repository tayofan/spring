package com.jsp.servlet.board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.sort.BaordBnoComparator;
import com.jsp.dataSource.DataSource;
import com.jsp.vo.Board;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
	private DataSource dataSource = DataSource.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/board/starter.jsp";
		
		Map<String, Board> boardMap = dataSource.getBoardList();
		List<Board> boardList = new ArrayList<Board>(boardMap.values());
		
		Collections.sort(boardList, new BaordBnoComparator());
		
		request.setAttribute("boardList", boardList);
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
