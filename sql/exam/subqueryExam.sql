-- 43. 사원 번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원 이름과 담당업무)하시오.
select ename, job
from emp
where job = (select job from emp where empno = 7788);

select e1.ename, e1.job
from emp e1, emp e2
where e2.empno = 7788 and e1.job = e2.job;

-- 44. 사원번호가 7499인 사원보다 급여가 많은 사원을 표시하시오. 사원이름과 감당 업무
select ename, job
from emp
where sal > (select sal from emp where empno = 7499);

-- 45. 최소급여를 받는 사원의 이름, 담당업무 및 급여를 표시하시오. (그룹함수 사용)
select ename, job, sal
from emp
where sal = (select min(sal) from emp); -- 그룹함수는 서브쿼리 안에서 쓰므로 group by랑 having 넣으면 오류 발생

-- 46. 평균급여가 가장 적은 직급의 직급 이름과 직급의 평균(급여)을 구하시오.
select job, avg(sal)
from emp
group by job
having avg(sal) = (select min(avg(sal)) from emp group by job); -- 서브쿼리 안 select에서 그룹함수 썼으면 group by 넣는거 잊지 말기

-- 47. 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
select deptno, min(sal)
from emp
group by deptno;

select e.ename, e.sal, e.deptno
from emp e, (select deptno, min(sal) as sal
             from emp
             group by deptno) m
where e.sal = m.sal and e.deptno = m.deptno;

-- 48. 담당업무가 ANALYST 인 사원보다 급여가 적으면서  -> ANALYST 직급의 최소 급여보다 적아야 한다
-- 업무가 ANALYST가 아닌 사원들을 
-- 표시(사원번호, 이름, 담당 업무, 급여)하시오.
select *
from emp
where job != 'ANALYST' and sal < all (select distinct sal from emp where job = 'ANALYST'); -- all은 전부 비교

select distinct sal from emp where job = 'ANALYST';

-- 49. 부하직원이 없는 사원의 이름을 표시하시오.
-- 나의 사원번호가 다른 사원의 MGR에 있다면 -> 나는 관리자. 부하직원이 있다
-- 나의 사원번호가 다른 사원의 MGR에 없다면 -> 부하직원이 없다
select distinct mgr from emp where mgr is not null; -- null이 아닌 mgr 목록(중복제거)

select ename
from emp
where empno not in (select distinct mgr from emp where mgr is not null); -- null이 아닌 mgr에 내 사원번호가 없으면 부하직원이 없는 것

-- 50. 부하직원이 있는 사원의 이름을 표시하시오.
select ename
from emp
where empno in (select distinct mgr from emp where mgr is not null);

-- 51. BLAKE와 동일한 부서에 속한 
--     사원의 이름과 입사일을 표시하는 질의를 작성하시오. ( 단 BLAKE는 제외 )
select deptno from emp where ename = 'BLAKE';

select ename, hiredate
from emp
where deptno = (select deptno from emp where ename = 'BLAKE') and ename != 'BLAKE';

-- 52. 급여가 평균 급여보다 많은 사원들의 
-- 사원 번호와 이름을 표시하되 
-- 결과를 급여에 대해서 오름차순으로 정렬하시오.
select avg(sal) from emp;

select empno, ename
from emp
where sal > (select avg(sal) from emp)
order by sal;

-- 53. 이름에 K가 포함된 사원과 같은 부서에서 일하는 
-- 사원의 사원 번호와 이름을 표시하시오.
select distinct deptno from emp where ename like '%K%';

select empno, ename
from emp
where deptno in (select distinct deptno from emp where ename like '%K%');

-- 54. 부서위치가 DALLAS인 사원의 이름과 부서번호 및 담당업무를 표시하시오.
select deptno from dept where loc = 'DALLAS';

select ename, deptno, job
from emp
where deptno = (select deptno from dept where loc = 'DALLAS');

-- 55. KING에게 보고하는 사원의 이름과 급여를 표시하시오.
select empno from emp where ename = 'KING';

select ename, sal
from emp
where mgr = (select empno from emp where ename = 'KING');

-- 56. RESEARCH 부서의 사원에 대한 부서번호, 사원이름 및 담당 업무를 표시하시오.
select deptno from dept where dname = 'RESEARCH';

select deptno, ename, job
from emp
where deptno = (select deptno from dept where dname = 'RESEARCH');

-- 57. 평균 월급보다 많은 급여를 받고 
-- 이름에 M이 포함된 사원과 같은 부서에서 근무하는 사원의 
-- 사원 번호, 이름, 급여를 표시하시오.
select avg(sal) from emp;
select distinct deptno from emp where ename like '%M%';

select empno, ename, sal
from emp
where sal > (select avg(sal) from emp) and deptno in (select distinct deptno from emp where ename like '%M%');

-- 58. 평균급여가 가장 적은 업무를 찾으시오.
-- 중복문제

-- 59. 담당업무가 MANAGER 인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오.
select deptno from emp where job = 'MANAGER';

select *
from emp
where deptno in (select distinct deptno from emp where job = 'MANAGER');