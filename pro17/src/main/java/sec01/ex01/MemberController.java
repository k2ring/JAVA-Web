package sec01.ex01;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/*")
public class MemberController extends HttpServlet {

	MemberDAO memberDAO;

	public MemberController() {
		memberDAO = new MemberDAO();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		String action = request.getPathInfo();
		System.out.println("액션값 : " + action + "###");

		String nextPage = null;
		if (action.equals("") || action.equals("listMembers.do")) {

			List<MemberVO> membersList = memberDAO.listMembers();

			request.setAttribute("membersList", membersList);
			nextPage = "/listMembers.jsp";
		} else if (action.equals("/addMember.do")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			System.out.println(id+","+pwd+","+name+","+email);
			MemberVO vo = new MemberVO(id, pwd, name, email);

			memberDAO.addMember(vo);
			
			request.setAttribute("msg", "addMember");
			nextPage = "/member/listMembers.jsp";
		}else if(action.equals("/modMemberForm.do")) {
			String id=request.getParameter("id");
			MemberVO memInfo = memberDAO.findMember(id);
			request.setAttribute("memInfo", memInfo);
			nextPage = "/modMemberForm.jsp";
		}else if(action.equals("/modMember.do")) {
			String id=request.getParameter("id");
		     String pwd=request.getParameter("pwd");
		     String name= request.getParameter("name");
	         String email= request.getParameter("email");
		     MemberVO memberVO = new MemberVO(id, pwd, name, email);
		     memberDAO.modMember(memberVO);
		     
		     request.setAttribute("msg", "modMember");
		     nextPage = "/member/listMembers.jsp";
		     
		}else if(action.equals("/delMember.do")) {
			String id=request.getParameter("id");
			memberDAO.delMember(id);
			
			request.setAttribute("msg", "delMember");
			nextPage = "/member/listMembers.jsp";
			
		}else {
			List<MemberVO> membersList = memberDAO.listMembers();

			request.setAttribute("membersList", membersList);
			nextPage = "/listMembers.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
	}

}
