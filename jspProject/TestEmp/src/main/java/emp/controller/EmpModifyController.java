package emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/modify")
public class EmpModifyController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 수정 폼 : 이전에 입력했던 데이터가 화면에 출력
		
		// no 값을 받고
		String noStr = request.getParameter("empno");
		int empno = Integer.parseInt(noStr); // modify?empno=2
		
		// no 값에 해당하는 Todo 데이터를 Service를 통해서 받고
//		Todo todo = new Todo(no, "청소", "2023-05-04", "not");
//		TodoDTO todo = viewService.getTodo(no);
			
		// requst 속성에 결과 데이터를 저장
//		request.setAttribute("todo", todo);
		
		// view 지정
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/emp/modify.jsp");
		// forward
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
