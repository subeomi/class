package emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class EmpReadController extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 상세보기 페이지는 get 방식의 요청에 화면을 보여주는 처리
		// 어떤 Todo의 데이터인지 식별할 수 있는 키 데이터를 받아서 처리
		String noStr = request.getParameter("empno");
		int empno = Integer.parseInt(noStr);
		
		// no 값으로 Service를 통해서 Todo 정보를 받아온다!
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/emp/read.jsp");
		dispatcher.forward(request, response);
		
	}

}