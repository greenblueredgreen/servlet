<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
<%
	String nickname = request.getParameter("nickname");
	String hobby = request.getParameter("hobby");
	String animal = request.getParameter("animal");
	String fruit= request.getParameter("fruit");
	
	
	// 중복 선택이라 여러 값이 넘어올 수 있기 때문에, 배열에 저장해준다. 
	// 선택 항목이 여러개일 때, 배열로 받아준다.
	String [] foodArr = request.getParameterValues("food"); 
%>

	<table border = "1">
		<tr>
			<th>별명</th>
			<td><%= nickname %></td>
		</tr>
		<tr>
			<th>취미</th>
			<td><%= hobby %></td>
		</tr>
		<tr>
			<th>선호하는 동물</th>
			<td><%= animal %></td>
		</tr>
		<tr>
			<th>선호하는 음식</th>
			<td>
				<%
				//out.print(foodArr);  // null 로 들어온다.
				// 따라서 null을 반복문 안에 넣으면 당연히 에러가 발생한다.
				if(foodArr != null){
					String result = "";
					for(String food : foodArr){
						result += food + ",";	
					}
					
					// 맨마지막 , 빼기 (마지막 , 제거)
					result = result.substring(0, result.length()-1);
					out.print(result);
				}
				%>
			</td>
		</tr>
		<tr>
			<th>좋아하는 과일</th>
			<td><%= fruit %></td>
		</tr>
	
	</table>

</body>
</html>