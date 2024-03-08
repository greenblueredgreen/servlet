<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
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
		String type = request.getParameter("type");
		//out.print(type);
		Date now = new Date();
		String result = null;
		
		if(type.equals("time")){
			SimpleDateFormat sdf= new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");
			result = sdf.format(now);
		}else{
			//date
		}
		
	
	
	%>
	
	<div class="container">
		<div><%= result %></div>
	</div>

</body>
</html>