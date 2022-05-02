package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetPara")
public class GetPara extends HttpServlet {
	// localhost/Servlet_01까지가 주소 이후에 붙는 것은 클라이언의 요청에 응답하는 실행문
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color = request.getParameter("color");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String str = "<style>body{background : " + color +"}</style>";
		out.print(str);
		//System.out.println(color);
	}

}
