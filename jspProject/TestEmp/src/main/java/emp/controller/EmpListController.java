package emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/list")
public class EmpListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. 사용자 요청의 분석
		// 2. Seveice에 요청 -> 응답 데이터 반환
		

		
//		System.out.println(list);
		
		// 3. 응답 데이터 request의 속성에 저장 : view로 데이터 전달
//		request.setAttribute("todoList", list);
		
		// 4. view 지정 -> forward
		String viewPath = "/WEB-INF/views/emp/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);
	
	}


}
