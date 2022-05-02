package com.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GuGuDan")
public class GuGuDan extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dan = -1; 
		String result = "";
		boolean flag = true;
		String input = "";
		
		try {
			input = request.getParameter("dan");
		} catch (Exception e) {
			flag = false;
		}
		
		dan = Integer.parseInt(input);
		
		
		//처리
		if(flag) {
			for(int i = 1; i < 9+1; i++) {
				result += dan + "*" + i + "=" + dan*i + "<br>";
			}			
		}else {
			result += "숫자를 입력하세요";
		}
		
		request.setAttribute("dan", dan);
		request.setAttribute("result", result);
		request.setAttribute("flag", flag);
		
		//출력
		view(request, response);
	}
	
	//외부로터 받아야한다
	private void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dan = (int)request.getAttribute("dan");
		String result = (String)request.getAttribute("result");
		boolean flag = (boolean)request.getAttribute("flag");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.print(result);
	}
}
