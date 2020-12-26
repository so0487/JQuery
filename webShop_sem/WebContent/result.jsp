<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%request.setCharacterEncoding("UTF-8"); %> 
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>전송결과 화면</title>
	</head>
	<body>
		<!-- 
			1) get방식으로 데이터를 받는 경우
				기본 :  String id = request.getParameter("id");
				** getParameter("id") id에 해당하는 부분은 
				   html 입력태그에서 name값과 동일
				   
				한글이 깨져서 보일경우 : 
					String id_kr = 
					new String(request.getParameter("id").getBytes("8859_1"), "UTF-8");
		
			2)post 방식의 경우
				기본 :  String id = request.getParameter("id");
				한글이 깨지는 경우 : jsp파일의  html코드 상단에 
				  request.setCharacterEncoding("UTF-8");  넣어줌  
				
		 -->
	
		
		<!-- 
			앞단에서 보낸 데이터들을 가공해서 DB에 넣는다 
		 -->
		 
		ID: <%String id_kr = new String(request.getParameter("id").getBytes("8859_1"), "UTF-8");//get타입 %>
		<%=id_kr %>
		<br>
		PW:<%String pw = request.getParameter("pw"); 
		  out.print(pw);
		%>
		<br>	
		PW 확인 :<%String pwck = new String(request.getParameter("pwck").getBytes("8859_1"), "UTF-8");//get타입 %>
		<%=pwck %>
		<br>
	
		gender :<%String gender = new String(request.getParameter("gender").getBytes("8859_1"), "UTF-8");//get타입 %>
		<%=gender %>
		<br>
		
		
		hobby :<%
		String[] hobby = request.getParameterValues("hobby"); 
		
		//new String(request.getParameter("hobby").getBytes("8859_1"), "UTF-8");//get타입 
		for(String h: hobby){
			out.print(new String(h.getBytes("8859_1"),"UTF-8"));
		}
		%>
		<br>
		birth :<%String birth = request.getParameter("birth");//get타입 %>
		<%=birth %>
		<br>
		age :<%String age = request.getParameter("age");//get타입 %>
		<%=age %>
		<br>
		e_mail:<%String e_mail = request.getParameter("e_mail") + "@" +request.getParameter("domain");//get타입 %>
		<%=e_mail %>
		<br>
		memo:<%String memo = new String(request.getParameter("memo").getBytes("8859_1"), "UTF-8");//get타입 %>
		<%=memo %>
		<br>
	</body>
</html>






