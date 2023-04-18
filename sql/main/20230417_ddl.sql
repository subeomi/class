create table ddl_test (
    -- 컬럼들을 정의
    no number(3),
    name varchar(10),
    birth date default sysdate
);

desc ddl_test;

-- create table 테이블이름 (
--    걸럼이름 타입(제약조건),
--    걸럼이름 타입(제약조건),
--    걸럼이름 타입(제약조건),
--    걸럼이름 타입(제약조건),
-- );

-- 사원번호, 사원이름, 급여 3개의 칼럼으로 구성된 EMP01 테이블을 생성해 봅시다.
create table emp01 (
    empno number(4),
    ename varchar2(10),
    sal number(7,2)
);

desc emp01;

insert into emp01 (empno, ename, sal) values (1111, 'SON', 1000); -- 행 단위로 입력할 컬럼을 지정 (1열, 2열, 3열) (1열의 내용물, 2열의 내용물, 3열의 내용물)
select * from emp01;

-- 서브쿼리를 이용해서 기존 테이블의 구조로 테이블을 생성, 데이터도 저장, 제약조건은 복사되지 않는다!!!
create table emp02
as
select * from emp; -- emp02에 emp를 복사

desc emp02;
desc emp;

select * from emp02;

-- 원하는 컬럼만 또는 원하는 로우만 선택해서 테이블을 생성
create table emp03
as
select empno, ename, job, hiredate from emp;

desc emp03;

-- 30번 부서의 정보만 가지는 새로운 테이블 생성
select empno, ename, job from emp where deptno = 30;
create table emp04
as
select empno, ename, job from emp where deptno = 30;
select * from emp04;

-- 데이터 필요 없이 스키마만 복사
select * from emp where 1=1;
create table emp05
as
select * from emp where 1=0;
select * from emp05;

-- 테이블의 변경 : 저장구조 ( 스키마의 구조 : 컬럼들의 집합 )가 변경
-- 켤렴 변경 (테이블에 컬럼을 추가, 테이블에 있는 컬럼을 삭제, 컬럼의 내용이나 이름을

-- 테이블의 변경
-- alter table [add, modify, drop]()
-- add(추가), modify(변경), drop(삭제)

-- emp01 테이블에 job 컬럼을 추가해보자.

desc emp01;
alter table emp01 add (job varchar2(9));

-- 직급(job) 칼럼을 최대 30글자까지 저장할 수 있게 변경해 보도록 하자.
desc emp01;
alter table emp01 modify (job varchar2(20) not null)
;
alter table emp01 modify (job varchar2(50));

select * from emp01;

delete from emp01 where empno = 1111;
commit; -- 커밋


-- emp01 테이블에서 job 컬럼을 삭제
alter table emp01 drop column job;
desc emp01;


-- 테이블 객체의 삭제
-- drop table 테이블이름 -> 스키마 삭제와 저장데이터 삭제
-- DDL : 자동 commit, DML 작업중 DDL 작업은 신중하게!!

-- emp01 테이블을 삭제해보자
drop table emp01;
desc emp01;
select * from emp01;

-- 테이블의 모든 행을 삭제 : truncate table 테이블이름
select * from emp02;
truncate table emp02;

select * from emp03;
delete from emp03;
rollback;


-- 테이블 이름 변경
-- rename 이전이름 to 새이름
desc ddl_test;
-- ddl_test -> test
rename ddl_test to test;
desc test;

-- -------------------------------------------------------------
-- 제약조건의 필요성
insert into dept values (10, 'test', 'test');


-- not null 제약조건 : 설정한 컬럼에 null값 입력을 금지하는 제약조건
-- 컬럼 수준에서만 정의가 가능
drop table emp02;
-- 사원테이블 생성 : 사원번호, 사원이름, 직급, 부서명
-- 사원번호, 사원이름에 not null 제약조건을 설정
create table emp02(
    empno number(4) not null,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);
insert into emp02 values (null, null, 'MANAGER', 30);
insert into emp02 (job, deptno) values ('MANAGER', 10);


-- emp03 생성 : 사원번호, 사원이름, 직급, 부서번호
-- empno : unique
-- ename : not null
drop table emp03;
create table emp03(
    empno number(4) unique,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);
desc emp03;
-- unique : 컬럼 내부에 중복된 데이터가 있으면 입력 실패, 수정 실패
insert into emp03 values (1111, 'KING', 'MANAGER', 10);
insert into emp03 values (1112, 'SON', 'MANAGER', 20);

select * from emp03;

-- not null + unique 함께 사용
drop table emp01;
create table emp01 (
    empno number(4) not null unique,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);
insert into emp01 values (1111, 'KING', 'MANAGER', 40);


-- 기본 키 제약조건
-- 컬럼 옆에 primary key 키워드 사용
drop table emp01;
create table emp01 (
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(2)
);
desc emp01;
insert into emp01 values (null, 'KING', 'MANAGER', 40);


-- constraint 제약 조건명 부여
drop table emp01;
create table emp01 (
    empno number(4) constraint PK_emp01_empno primary key, -- 기본 키 primary key 약자 PK_emp01(테이블명)_empno(컬럼명)
    ename varchar2(10) constraint NN_emp01_ename not null, -- not null 약자 NN
    job varchar2(9) constraint UK_emp01_job unique, -- unique 약자 UK
    deptno number(2)
);
desc emp01;
insert into emp01 values (1111, 'KING', 'MANAGER', 40);


-- 외래키 제약조건
drop table emp01;
create table emp01 (
    empno number(4) constraint PK_emp01_empno primary key,
    ename varchar2(10) constraint NN_emp01_ename not null,
    job varchar2(9) constraint UK_emp01_job unique,
    -- 외래키 foreign key 약자 FK // references 참조할 테이블명(컬럼명)
    deptno number(2) constraint FK_emp01_deptno references dept(deptno) 
);
desc emp01;
insert into emp01 values (1111, 'KING', 'MANAGER', 90);


-- check : 범위, 값을 확인 후 입력 또는 수정
drop table emp01;
create table emp01 (
    empno number(4) constraint PK_emp01_empno primary key,
    ename varchar2(10) constraint NN_emp01_ename not null,
    job varchar2(9) constraint UK_emp01_job unique,
    sal number(7, 2) constraint CK_emp01_sal check (sal between 800 and 5000), -- 800 ~ 5000인지 확인 후 등록.
    gender char(1) constraint CK_emp01_gender check (gender in ('M', 'F')), -- M 또는 F만 등록 가능
    deptno number(2) constraint FK_emp01_deptno references dept(deptno) 
);
desc emp01;
insert into emp01 values (1111, 'KING', 'MANAGER', 1500, 'F', 40);


-- default : 컬럼에 입력값이 없을 때 기본값을 설정해서 데이터 입력
drop table emp01;
create table emp01 (
    empno number(4) constraint PK_emp01_empno primary key,
    ename varchar2(10) constraint NN_emp01_ename not null,
    job varchar2(9) constraint UK_emp01_job unique,
    sal number(7, 2) constraint CK_emp01_sal check (sal between 800 and 5000),
    gender char(1) constraint CK_emp01_gender check (gender in ('M', 'F')),
    deptno number(2) constraint FK_emp01_deptno references dept(deptno),
    hiredate date default sysdate -- 입력 없이 기본값이 필요한 예) 가입 시간
);
desc emp01;
insert into emp01 values (1111, 'KING', 'MANAGER', 1500, 'F', 40, sysdate);
select * from emp01;

insert into emp01 (empno, ename, job, sal, gender, deptno) 
            values(1112, 'SON' ,'FREE', 3000, 'M', 40); -- hiredate 미 입력 시 default로 입력한 sysdate 자동기입
            

-- 테이블 레벨에서의 제약조건
drop table emp01;
create table emp01 (
    empno number(4),
    ename varchar2(10) constraint NN_emp01_ename not null,
    job varchar2(9),
    sal number(7, 2) constraint CK_emp01_sal check (sal between 800 and 5000),
    gender char(1) constraint CK_emp01_gender check (gender in ('M', 'F')),
    deptno number(2),
    hiredate date default sysdate,
    constraint PK_emp01_empno primary key (empno),
    constraint UK_emp01_job unique (job),
    constraint FK_emp01_deptno foreign key (deptno) references dept(deptno)
);
desc emp01;
insert into emp01 values (1112, 'KING', 'MANAGER1', 1500, 'F', 40, sysdate);

select * from emp01;

insert into emp01 (empno, ename, job, sal, gender, deptno) 
            values(1112, 'SON' ,'FREE', 3000, 'M', 40);