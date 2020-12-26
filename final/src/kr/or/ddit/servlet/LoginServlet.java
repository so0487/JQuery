package kr.or.ddit.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String mem_id = request.getParameter("id");
		
		IMemberService service = MemberServiceImpl.getInstance();
		
		String mem_pass = service.getMemberPass(mem_id);
		
		request.setAttribute("mem_pass", mem_pass);

		RequestDispatcher  disp =
						  request.getRequestDispatcher("ePeople/login.jsp");
				
		disp.forward(request, response);
		
		
		
	}

}
















