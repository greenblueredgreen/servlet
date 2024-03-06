package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/lesson01/ex02")   // 어노테이션이 맵핑 대신 해준다.
public class UrlMappingEx02 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
			//한글 깨짐 방지
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html");  //html 문서로 수행한다.
			
			
			PrintWriter out= response.getWriter();
			
			//서블릿 : 자바코드 안에 + html -> 유지보수가 힘들다.
			// 1~10 더하기
			int sum = 0;
			for ( int i = 0; i< 10; i++) {
				sum += i;
			}
			
			out.print("<html><head><title>합계</title></head><body>");
			out.print("합계 : <b>" + sum + "</b>");
			out.print("</body></html>");
	}

}
