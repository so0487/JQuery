<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

//	post방식일 경우에만 한글표현이 가능하다.
 	request.setCharacterEncoding("UTF-8");
	String nameValue = request.getParameter("name") ;
%>

<%
//get방식일 경우에 한글표현이 아래와 같이 가능하다.
// 	String str = new String(request.getParameter("name").getBytes("8859_1"),"UTF-8");

%>



<!-- post방식 -->
<%=nameValue%>



<%--
//get방식

 <%=str%>
 
  --%>
