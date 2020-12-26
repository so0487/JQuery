<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberVO vo = (MemberVO)request.getAttribute("vo");
	String id = (String)request.getAttribute("inputid");
	
	if(vo == null){
		//사용가능한 ID
		%>
		{"id":"사용가능"}
		<%
	}else{
		//사용불가능한 ID
		%>
		{"id":"사용불가능"}
		<%
	}
%>