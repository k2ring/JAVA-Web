package sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;




@WebServlet("/json")
public class JsonServlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		JSONObject jsonObj=new JSONObject();
		
		jsonObj.put("name", "박지성");
		jsonObj.put("age", "25");
		jsonObj.put("gender", "남자");
		jsonObj.put("nickname", "날센돌이");		
				
		
		JSONArray jsonArr =	new JSONArray();		
		System.out.println(jsonObj);
		
		jsonArr.add(jsonObj);
		
		
		JSONObject jsonObj2=new JSONObject();
		System.out.println(jsonObj2);
		jsonObj2.put("name", "김연아");
		jsonObj2.put("age", "21");
		jsonObj2.put("gender", "여자");
		jsonObj2.put("nickname", "칼치");
		jsonArr.add(jsonObj2);
		
		
		JSONObject totalObject = new JSONObject();
		
		
		totalObject.put("member", jsonArr);
		
		//반드시 문자열 변환
		String jsonInfo = totalObject.toJSONString();
		System.out.print(jsonInfo);
		writer.print(jsonInfo);
	}
	

}
