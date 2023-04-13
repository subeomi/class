-- 2023.04.13

-- join
-- cross join
-- 스키마를 붙이고 결과 행은 모든 경우의 수 -> n * m
-- emp, dpet -> 14 * 4 = 56
select *
from emp, dept;

select *
from emp, dept
where emp.deptno = dept.deptno;

-- 별칭 등록 e, d
select e.deptno
from emp e, dept d
where e.deptno = d.deptno;

-- 이름이 scott인 사람의 부서명을 출력해봅시다.
select deptno from emp where ename='SCOTT';
-- 20
select dname from dept where deptno = 20;

-- join으로 해결
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno
      and e.ename = 'SCOTT';
      
select *
from emp cross join dept;

select *
from emp e, dept d
where e.deptno = d.deptno;


-- inner join : where절 대신 on으로 조건을 넣음. inner 생략하고 join만 넣고 on 설정해도 ok
select *
from emp inner join dept
on emp.deptno = dept.deptno;

select *
from emp join dept
on emp.deptno = dept.deptno;


-- natural join : 중복 열을 제외하고 join해준다.
select *
from emp natural join dept;

-- natural 생략하고 using() 안에 중복 열을 넣어줘도 동작
select *
from emp join dept
using(deptno);
      
      
-- 사원별 급여 등급 표현
select * from salgrade;

select e.ename, s.grade, s.losal, e.sal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and s.hisal
;

-- self join : 자기 자신의 테이블을 조인하는 경우
select *
from emp e, emp m
where e.mgr = m.empno
;

-- outer join : 조건에 만족하지 않는 행도 출력하는 join
select e.ename, nvl(m.ename, '없음')
from emp e, emp m
where e.mgr = m.empno (+) -- (+)를 붙이면 outer join이 된다
;


-- left/ right/ full outer join : 한 쪽의 데이터만 지정해서 outer join.
select *
from emp e join emp m
on e.mgr = m.empno;

select *
from emp e left outer join emp m
on e.mgr = m.empno;


-- 도서 판매 정보 출력
select * from orders;

select o.orderid, c.name, b.bookname, o.saleprice, o.orderdate
from orders o, customer c, book b
where o.custid = c.custid and o.bookid = b.bookid;