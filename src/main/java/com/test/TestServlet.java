package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{
	
	//오버라이드 어노테이션 꼭 쓰고 해야함.
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out=response.getWriter();
		out.println("Hello world!");
		

		
	}
	
}
