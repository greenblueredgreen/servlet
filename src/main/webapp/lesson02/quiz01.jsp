<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01</title>
</head>
<body>


	<%!
	// 합계
	int sum = 0;
	public int total(int n){
		for(int i =1; i<=n; i++){
			sum += i;
		}
		return sum;
	}%>
	
	<h1>1부터 50까지의 합은 <%= total(50) %> 입니다.</h1>
	
	
	<br>

	<% 
	int sum = 0;
	int[] scores = {81, 90, 100, 95, 80};
	for(int i=0; i<scores.length; i++){
		sum += scores[i];
	}
	
	%>
	
	<h1>평균 점수는 <%=sum/(double)scores.length %> 점입니다.</h1>

	<br>
	<%
		int cnt = 0;
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		for(String a : scoreList){
			if(a.equals("O")){
				cnt += 1;
			}
		}
	%>
	
	<h1>채점 결과는 <%= cnt*scoreList.size()%> 점 입니다. </h1>
	<br>
	
	<%
	
	String birthDay = "20010820";
	int year = Integer.valueOf(birthDay.substring(0, 4));
	%>
	
	<h1><%=birthDay%>의 나이는 <%=2024-year + 1 %> 입니다.</h1>

</body>
</html>