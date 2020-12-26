<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   	request.setCharacterEncoding("UTF-8"); //한글 인코딩
   	String nameValue = request.getParameter("name");
   	String ageValue = request.getParameter("age");
   %>
   
    
[{"name":"<%=nameValue%>","age":"<%=ageValue %>"}]