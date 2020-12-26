package kr.or.ddit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.lprod.service.ILprodService;
import kr.or.ddit.lprod.service.LprodServiceImpl;
import kr.or.ddit.vo.LprodVO;

@WebServlet("/LProdServlet")
public class LprodServlet extends HttpServlet{
	private static final long serialVersionUID = 1L; 
	
	public LprodServlet(){
		super();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ILprodService service = LprodServiceImpl.getInstance();
		List<LprodVO> list = service.getLprodList();
		System.out.println(list);
		
		
		request.setAttribute("list", list);
		
		RequestDispatcher disp = request.getRequestDispatcher("lprod/lprod.jsp");
		disp.forward(request, response);
	}
}
