package kr.or.ddit.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberServiceImpl;
import kr.or.ddit.vo.MemberVO;


@WebServlet("/MemberJoinServlet")
public class MemberJoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public MemberJoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//MemberVO
		MemberVO  vo = new MemberVO();
		
		try {
			BeanUtils.populate(vo, request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IMemberService  service = MemberServiceImpl.getInstance();
	
		String  name = service.insertMemberInfo(vo);
		request.setAttribute("resname", name);			
		request.setAttribute("inputname", vo.getMem_name());

		RequestDispatcher  disp = request.getRequestDispatcher("project/MemberJoin.jsp");
		disp.forward(request, response);

	}

}

