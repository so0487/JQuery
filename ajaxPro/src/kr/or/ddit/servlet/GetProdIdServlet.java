package kr.or.ddit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.vo.ProdVO;

public class GetProdIdServlet extends HttpServlet {
	private static final long serialVersionUTD = 1L;
	
	
	public GetProdIdServlet(){
		super();
	}
	
	
	
	
	protected void doGetProdId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String prod_id = "";		
		IProdService service = ProdServiceImpl.getInstacne();
		List<ProdVO>list = service.getProdId(prod_id);
		
		RequestDispatcher disp = request.getRequestDispatcher("prod/getProdId.jsp");
		disp.forward(request, response);
		
	}
}
