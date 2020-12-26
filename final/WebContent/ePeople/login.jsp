<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	String mem_pass = (String)request.getAttribute("mem_pass");
    %>

 	{"mem_pass":"<%=mem_pass %>"}