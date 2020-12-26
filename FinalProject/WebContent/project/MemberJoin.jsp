<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

    
<%
	String inputname = (String)request.getAttribute("inputname");
	String resname = (String)request.getAttribute("resname");
	

	
	
	if(resname!=null){
		//값 insert 성공
		%>
		{"result":"<%=resname %>님 환영합니다."}
		
		<%
	}else{
		//값 insert 실패
		%>
		{"result":"실패하였습니다."}
		<%
	}
%>



