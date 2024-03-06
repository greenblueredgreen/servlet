package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz08")
public class GetMethodQuiz08 extends HttpServlet {
	
	@Override
	public void doGet( HttpServletRequest request,
			 HttpServletResponse response) throws IOException {
		
		
		//응답 헤더
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		//리퀘스트 파라미터 꺼내기
		String search = request.getParameter("search");
		
		//리스트
		List<String> list = new ArrayList<>(Arrays.asList(
		        "강남역 최고 맛집 소개 합니다.", 
		        "오늘 기분 좋은 일이 있었네요.", 
		        "역시 맛집 데이트가 제일 좋네요.", 
		        "집에 가는 길에 동네 맛집 가서 안주 사갑니다.",
		        "자축 저 오늘 생일 이에요."));
		
		// 검색어로 탐색 후 출력
		PrintWriter out = response.getWriter();
		Iterator <String> iter = list.iterator(); 
		while(iter.hasNext()) {
			String line = iter.next();
			if(line.contains(search)) {
				//out.print(line + "<br>");
				
				// 풀이 1)
				String[] words = line.split(search);  //맛집을 기준으로 자른다.
				out.print(words[0] + "<b>" +search + "</b>"+ words[1] + "<br>");
				
				// 풀이 2) 치환하는 방법
		
				
				//1. Get : request body 가 없다.
				// 1. 브라우저주소
				// 2. a태그
				// 3. form 태그
				
				//2. Post : request body에 넣는다. 
				// form 태그
				
				
				
			}
			
		}
		
		
	}

}
