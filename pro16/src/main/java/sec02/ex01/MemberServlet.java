package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mem")
public class MemberServlet extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html; charset=utf-8");
	PrintWriter writer = response.getWriter();
	
	String id = (String) request.getParameter("id");
	
	MemberDAO memberDAO = new MemberDAO();
	boolean overlappedID = memberDAO.overlappedID(id);
	
	if(overlappedID==true) {
		writer.print("not_usable");	
	}else {
		writer.print("usable");
	}	
	

	}
}
