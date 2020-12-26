package kr.or.ddit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.vo.ProdVO;

public class GetProdLguServlet {
private static final long serialVersionUTD = 1L;
	
	
	public GetProdLguServlet(){
		super();
	}
	
	
	
	
	protected void doGetProdLgu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String prod_lgu="";
		IProdService service = ProdServiceImpl.getInstacne();
		List<ProdVO>list = service.getProdId(prod_lgu);
		
		RequestDispatcher disp = request.getRequestDispatcher("prod/getProdLgu.jsp");
		disp.forward(request, response);
		
	}
}
