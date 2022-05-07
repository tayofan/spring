package com.jsp.servlet.board;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dataSource.DataSource;

import oracle.jrockit.jfr.tools.ConCatRepository;

@WebServlet("/board/delete")
public class BoardDeleteServlet extends HttpServlet {
	private DataSource dataSource = DataSource.getInstance();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bno = request.getParameter("bno");
		String url = request.getContextPath() + "/board/list";
		
		dataSource.getBoardList().remove(bno);
		
		response.sendRedirect(url);
	}


}
