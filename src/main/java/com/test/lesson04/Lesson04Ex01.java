package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex01")
public class Lesson04Ex01 extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		
		//text/plain 설정 
		response.setContentType("text/plain");
		
		//DB연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();  // 실질적인 DB연결 이루어짐(꼭 넣기!);
		
		// 쿼리문 수행(insert)
		String insertQuery ="insert into `used_goods`"
				+ "(`sellerId`,`title`,`description`,`price`)"
				+ "values"
				+ "(1, '고양이 간식 팝니다.' , '저희 고양이 입맛 대단함', 2000)";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//쿼리문 수행(select) & 결과출력
		String selectQuery = "select * from `used_goods`";
		PrintWriter out = response.getWriter();
		
		try {
			ResultSet resultSet = ms.select(selectQuery);
			while(resultSet.next()) { //결과 행이 있는 동안 반복문 순회
				out.println(resultSet.getInt("id"));
				out.println(resultSet.getString("title"));
				out.println(resultSet.getInt("price"));
				out.println(resultSet.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		// DB연결 해제
		ms.disconnect();  //꼭 해줘야한다.
		
	}

}
