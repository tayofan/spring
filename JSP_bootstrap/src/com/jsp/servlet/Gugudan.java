package com.jsp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//입력
		int dan = 2;
		String result = "";
		
		//처리
		for(;dan<10;dan++){
			result+="<h3>"+dan+"입니다.</h3>";
			for(int gop=1;gop<10;gop++){
				result+=dan+"*"+gop+"="+dan*gop+"<br/>";
			}
			result+="<br/>";
		}
		
		request.setAttribute("result", result);
		request.getRequestDispatcher("/gugudan.jsp").forward(request, response);
		//포워드는 request유지하면서 전달
		//리다이렉트 새로고침
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
