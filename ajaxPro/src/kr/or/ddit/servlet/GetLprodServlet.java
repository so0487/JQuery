package kr.or.ddit.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.prod.service.IProdService;
import kr.or.ddit.prod.service.ProdServiceImpl;
import kr.or.ddit.vo.LprodVO;



@WebServlet("/GetLprodServlet")
public class GetLprodServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	public GetLprodServlet(){
		super();
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		LprodVO vo = new LprodVO();
		
		try {
			BeanUtils.populate(vo, request.getParameterMap());
		} catch (InvocationTargetException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		IProdService service = ProdServiceImpl.getInstacne();
		
		List<LprodVO> lprod_id = service.getLprod();
		
		request.setAttribute("lprod_id", lprod_id);
		
		RequestDispatcher disp = request.getRequestDispatcher("prod/getLprod.jsp");
		disp.forward(request, response);
	}
}
