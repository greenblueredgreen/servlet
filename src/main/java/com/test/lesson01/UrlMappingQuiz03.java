package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz03")
public class UrlMappingQuiz03 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html"); //html이므로
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("기사 입력시간:yyyy/MM/dd HH:mm:ss");
	
		// 태그 출력
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>마론달 뉴스</title></head><body>");
		out.print("<h1>[단독] 고양이가 야옹해</h1><br>");
		out.print(sdf.format(now));
		out.print("<hr>끝");
		out.print("</body></html>");
	}
}