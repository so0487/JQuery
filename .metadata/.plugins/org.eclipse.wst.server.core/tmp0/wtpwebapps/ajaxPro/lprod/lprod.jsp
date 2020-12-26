<%@page import="kr.or.ddit.vo.LprodVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    
    [
    <%
    	List<LprodVO>lprodList = (List<LprodVO>)request.getAttribute("list");
    
    
    	for(int i = 0;i<lprodList.size();i++){
    		LprodVO vo = lprodList.get(i);
    		
    		if(i>0)out.print(",");
    		
    		%>
    		{
    			"lprod_id":"<%=vo.getLprod_id() %>",
    			"lprod_gu":"<%=vo.getLprod_gu() %>",
    			"lprod_nm":"<%=vo.getLprod_nm()%>"
    	
    		}
    		<%
    	}
    %>
    ]