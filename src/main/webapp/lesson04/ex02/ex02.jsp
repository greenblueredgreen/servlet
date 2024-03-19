<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>
	<%-- 
		흐름 
		1. 유저 추가 : ex02.jsp(input 폼)
		-> InsertEx02 서블릿
		-> ex02_1.jsp(유저목록화면, DB select)
	 --%>
	 <form method="post" action="/lesson04/ex02_insert">
	 	<p>
	 		<b>이름</b>
	 		<input type="text" name="name">
	 	</p> 
	 		<b>생년월일</b>
	 		<input type="text" name="yyyymmdd">
	 	<p>
	 	</p> 
	 		<b>이메일</b>
	 		<input type="text" name="email">
	 	<p>
	 	</p> 
	 		<b>자기소개</b><br>
	 		<textarea name="introduce" rows="5" cols="50"></textarea>
	 	<p>
	 	</p> 
	 		<input type="submit" value="추가">
	 	<p>
	 </form>
</body>
</html>