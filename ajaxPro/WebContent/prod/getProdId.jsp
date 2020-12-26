<%@page import="kr.or.ddit.vo.ProdVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
[
<%
	List<ProdVO> prodList = (List<ProdVO>)request.getAttribute("list");

	for(int i=0;i<prodList.size();i++){
		ProdVO vo = prodList.get(i);
		
		if(i>0) out.print(",");


%>
{
	"prod_id":"<%=vo.getProd_id() %>"
	"prod_name":"<%=vo.getProd_name() %>"
}
<%

}
%>
]