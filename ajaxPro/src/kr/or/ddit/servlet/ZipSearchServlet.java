package kr.or.ddit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.IMemberServiceImpl;
import kr.or.ddit.vo.ZipVO;

@WebServlet("/ZipSearchServlet")
public class ZipSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ZipSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String dong = request.getParameter("dong");
		
		IMemberService   service = IMemberServiceImpl.getInstance();
		
		List<ZipVO> list = service.getZipSearch(dong);
		
		request.setAttribute("list", list);
		
		RequestDispatcher  disp =
						  request.getRequestDispatcher("member/zip.jsp");
				
		disp.forward(request, response);
		
		
		
	}

}
















