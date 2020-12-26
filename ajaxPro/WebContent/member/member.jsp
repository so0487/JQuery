<%@page import="kr.or.ddit.vo.MemberVO"%>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
[ 
<%
	List<MemberVO> memlist = (List<MemberVO>)request.getAttribute("list");

	for(int i=0;i<memlist.size();i++){
		MemberVO vo = memlist.get(i);
				
		if(i>0) out.print(",");

	
	
	
		%>
		{
			"mem_id":"<%=vo.getMem_id() %>",
			"mem_name":"<%=vo.getMem_name() %>",
			"mem_zip":"<%=vo.getMem_zip() %>",
			"mem_addr": "<%=vo.getMem_add1() %> <%=vo.getMem_add2() %>"
		}
		<%
	}
%>
]