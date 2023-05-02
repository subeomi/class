package emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class EmpRegisterController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// todo 입력 폼 화면 출력
		System.out.println("EmpRegisterController...doGet()...");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/emp/registerForm.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TodoRegisterConotroller...doPost()...");
		
		// post 방식의 데이터 전달 -> 파라미터 한글처리
//		request.setCharacterEncoding("utf-8");
		
		// 입력 폼에서 전달한 데이터를 받아서 처리
//		String todo = request.getParameter("todo");
//		String dueDate = request.getParameter("duedate");
//		
//		RequestTodo requestTodo = new RequestTodo(todo, dueDate);
		
		// Service에 요청
//		int result = insertService.register(requestTodo);
//		
//		if(result > 0) {
//			System.out.println("입력 성공...");
//		} else {
//			System.out.println("입력 실패...");
//		}
		
		// redirect : "list"
	}

}
