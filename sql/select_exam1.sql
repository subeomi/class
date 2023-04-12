
-- EMP 테이블과 DEPT 테이블을 이용해서 풀이해 주세요.

-- 1. 덧셈연산자를 이용하여 모든 사원에 대해서(행을 찾는 조건이 없다)
-- $300의 급여 인상을 계산한 후 
-- 사원의 이름, 급여, 인상된 급여를 출력하시오.

SELECT ENAME, SAL, SAL + 300 AS ADD_SAL
FROM EMP
ORDER BY 3 --3번째 열을 의미. --ADD_SAL
;

-- 2. 사원의 이름, 급여, 연간 총 수입을 
-- 총 수입이 많은 것부터 작은 순으로 출력하시오, - 총 수입 DESC
-- 연간 총수입은 월급에 12를 곱한 후 $100의 상여금을 더해서 계산하시오.

SELECT ENAME, SAL, SAL * 12 + 100 AS ANNUAL_SAL
FROM EMP
ORDER BY ANNUAL_SAL
;

-- 3. 급여가 2000을 넘는 사원의 - 행을 찾는 조건, WHERE 조건식(넘는다 = 초과) 
-- 이름과 급여를 표현, 
-- 급여가 많은 것부터 작은 순으로 출력하시오.

SELECT ENAME, SAL
FROM EMP
WHERE SAL > 2000
ORDER BY SAL DESC
;

-- 4. 사원번호가 7788인 
-- 사원의 이름과 부서번호를 출력하시오.

SELECT ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = 7788
;

-- 5. 급여가 2000에서 3000 사이에 포함되지 않는 
-- 사원의 이름과 급여를 출력하시오.

SELECT ENAME, SAL
FROM EMP
WHERE NOT SAL BETWEEN 2000 AND 3000;

-- 6. 1981년 2월 20일 부터 1981년 5월 1일 사이에 입사한 
-- 사원의 이름, 담당업무, 입사일을 출력하시오.

SELECT ENAME, JOB, HIREDATE
FROM EMP
WHERE HIREDATE BETWEEN '1981/02/20' AND '1981/05/01';

-- 7. 부서번호가 20 및 30에 속한 사원의 - 또는 = IN(A, B ...)
-- 이름과 부서번호를 출력, 
-- 이름을 기준(내림차순)으로 영문자순으로 출력하시오.

SELECT ENAME, DEPTNO
FROM EMP
WHERE DEPTNO IN (20, 30) -- DEPTNO = 20 OR DEPTNO = 30
ORDER BY ENAME DESC;

-- 8. 사원의 급여가 2000에서 3000사이에 포함되고(AND) 부서번호가 20 또는 30인 사원의 
-- 이름, 급여와 부서번호를 출력, 
-- 이름순(오름차순)으로 출력하시오.

SELECT ENAME, SAL, DEPTNO
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000 AND DEPTNO IN (20, 30)
ORDER BY ENAME;

-- 9. 1981년도에 입사한 사원의 
-- 이름과 입사일을 출력하시오. (like 연산자와 와일드카드 사용)

SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE LIKE '81%';

-- 10. 관리자가 없는 사원의 
-- 이름과 담당 업무를 출력하시오. - MGR = 바로 위 관리자(상사)

SELECT ENAME, JOB
FROM EMP
WHERE MGR IS NULL;

-- 11. 커미션을 받을 수 있는 자격이 되는 사원의 
-- 이름, 급여, 커미션을 출력하되 
-- 급여 및 커미션을 기준으로 내림차순 정렬하여 표시하시오.

SELECT ENAME, SAL, COMM
FROM EMP
WHERE COMM IS NOT NULL AND COMM > 0
ORDER BY SAL DESC, COMM DESC;

-- 12. 이름의 세번째 문자가 R인 사원의 
--     이름을 표시하시오.

SELECT ENAME
FROM EMP
WHERE ENAME LIKE '__R%';

-- 13. 이름에 A와 E를 모두 포함하고 있는 사원의 
-- 이름을 표시하시오.

SELECT ENAME
FROM EMP
WHERE ENAME LIKE '%A%' AND ENAME LIKE '%E%';

-- 14. 담당업무가 CLERK, 또는 SALESMAN이면서 
--     급여가 $1600, $950 또는 $1300이 아닌 사원의 
--     이름, 담당업무, 급여를 출력하시오.

SELECT ENAME, JOB, SAL
FROM EMP
WHERE JOB IN('CLEKR', 'SALESMAN') AND SAL NOT IN (1600, 950, 1300);

-- 15. 커미션이 $500 이상인 사원의 
--     이름과 급여 및 커미션을 출력하시오.

SELECT ENAME, SAL, COMM
FROM EMP
WHERE COMM >= 500; -- 값이 NULL이면 조건 연산을 하지않고 넘겨버린다.


