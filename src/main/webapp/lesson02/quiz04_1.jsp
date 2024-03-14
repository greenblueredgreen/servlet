<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz04_1.jsp</title>
</head>
<body>
	<%
	int cm = Integer.valueOf(request.getParameter("cm"));
	//out.print(cm);
	String typeArr[] = request.getParameterValues("measure");

	%>
	<div class="container">
		<h1>길이 변환 결과</h1>
		<h1><%= cm %>cm</h1>
	
		<hr>
		<h2>
	<%
	if(typeArr != null){
		for(String i : typeArr){
			if(i.equals("인치")){
				double inch = cm/2.54;
				out.print(inch + "in <br>");
			}
			if(i.equals("야드")){
				double yard= cm/91.44;
				out.print(yard + "yd <br>");
			}
			if(i.equals("피트")){
				double feet = cm/30.48;
				out.print(feet + "ft <br>");
			}
			if(i.equals("미터")){
				double meter = cm/100.0;
				out.print(meter + "m <br>");
			}
		}
	}
	
	%>
	</h2>
	</div>
	
</body>
</html>