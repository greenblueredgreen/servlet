package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz09")
public class PostMethodQuiz09 extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		// 응답헤더
		response.setContentType("text/html");
		
		//request param
		String name = request.getParameter("name");
		String introduce = request.getParameter("introduce");
		
		//html 출력
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>입사지원서</title></head><body>");
		out.print("<b>" + name + "</b>님의 지원이 완료되었습니다.");
		out.print("<br>" + "<h1>지원 내용</h1>" + "<br>" + introduce);
		out.print("</body></html>");
	}
}
