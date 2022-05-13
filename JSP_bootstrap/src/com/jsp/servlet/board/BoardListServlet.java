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
import com.jsp.command.Criteria;
import com.jsp.dataSource.DataSource;
import com.jsp.service.BoardService;
import com.jsp.service.BoardServiceImpl;
import com.jsp.vo.BoardVO;
import com.jsp.vo.MemberVO;

@WebServlet("/board/list")
public class BoardListServlet extends HttpServlet {
	private BoardService boardService = new BoardServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/board/starter.jsp";
		
		String pageParam = request.getParameter("page");
		String perPageNumParam = request.getParameter("perPageNum");
		
		Criteria cri = new Criteria();
		
		boolean criFlag = true;
		criFlag = criFlag && pageParam != null
				          && !pageParam.isEmpty()
				          && perPageNumParam != null
				          && !perPageNumParam.isEmpty();
		
		if(criFlag) {
			try {
				cri.setPage(Integer.parseInt(pageParam));
				cri.setPerPageNum(Integer.parseInt(perPageNumParam));
			} catch (Exception e) {
				response.sendError(response.SC_BAD_REQUEST);
				return;
			}
		}
		
		try {
//			List<BoardVO> boardList = boardService.getBoardList(cri);
//			request.setAttribute("boardList", boardList);
			Map<String, Object> dataMap = boardService.getBoardListForPage(cri);
			request.setAttribute("dataMap", dataMap);
		} catch (Exception e) {
			url = "/WEB-INF/views/error/500.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
