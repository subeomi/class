<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>사원 등록</h1>

<form method="post">

	사원번호 : <input type="text" name="empno"> <br>
	이름 : <input type="text" name="ename"> <br>
	직급 : <input type="text" name="job"> <br>
	매니저 : <input type="text" name="mgr"> <br>
	입사일 : <input type="date" name="hiredate"> <br>
	급여 : <input type="text" name="sal"> <br>
	커미션 : <input type="text" name="comm"> <br>
	부서번호 : <input type="text" name="deptno"> <br>
	<input type="reset"> <input type="submit">

</form>

</body>
</html>