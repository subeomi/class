<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>사원 정보 상세보기</h1>
	
	사원번호 : <input type="text" name="empno" readonly> <br>
	이름 : <input type="text" name="ename" readonly> <br>
	직급 : <input type="text" name="job" > <br>
	매니저 : <input type="text" name="mgr" > <br>
	입사일 : <input type="date" name="hiredate" readonly> <br>
	급여 : <input type="text" name="sal" > <br>
	커미션 : <input type="text" name="comm" > <br>
	부서번호 : <input type="text" name="deptno" > <br>
	
	<a href="modify?empno=1">수정</a>
	<%-- <a href="delete?no=${no}">삭제</a> --%>
	
	<form action="delete" method="post">
		<input type="hidden" name="empno" <%-- value="${todo.tno}" --%>>
		<input type="submit" value="삭제">
	</form>

</body>
</html>