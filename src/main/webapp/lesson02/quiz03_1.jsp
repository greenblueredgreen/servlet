<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int height = Integer.parseInt(request.getParameter("height"));
	int weight = Integer.parseInt(request.getParameter("weight"));
	
	double bmi = weight / ((height / 100.0) * (height / 100.0));
	
	String result;
	if (bmi <= 20) {
		result = "저체중";
	} else if (bmi <= 25) {
		result = "정상";
	} else if (bmi <= 30) {
		result = "과체중";
	} else {
		result = "비만";
	}
%>

	<div class="container"> 
		<h1>BMI 측정 결과</h1>
		
		<div class="display-4"> 당신은 <span class="text-info"><%=result %></span> 입니다. </div>
		
		<div class="mt-2">
			BMI 수치 : <%=bmi %>
		</div>
	</div>
</body>
</html>