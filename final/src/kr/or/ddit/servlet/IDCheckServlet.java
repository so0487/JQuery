package kr.or.ddit.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.vo.MemberVO;


@WebServlet("/IDCheckServlet")
public class IDCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public IDCheckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		
		IMemberService service = MemberServiceImpl.getInstance();
		
		Map<String, String> param = new HashMap<String, String>();
		
		param.put("id", id);

		MemberVO  vo = service.getMemberInfo(param);
		
		request.setAttribute("vo", vo);
		request.setAttribute("inputid", id);
		RequestDispatcher  disp = request.getRequestDispatcher("ePeople/idCheck.jsp");
		disp.forward(request, response);
		
		
	}

}















