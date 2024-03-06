package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz04")
public class UrlMappingQuiz04 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		PrintWriter out= response.getWriter();
		out.print("<html><head><title></title></head><body>");
		
		
		
		out.print("</body></html>");	
		
		//1.get -> 브라우저에 주소를 치고 들어가는 것.
		// 모든 요청은 대부분 get 이다.
		// a 태그(앵커태그) 를 통해서 들어가는 것.
		
		//2.Post -> 
		
		
	}

}
