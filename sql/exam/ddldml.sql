-- 제시된 테이블 정의서를 보고 DDL 을 완성해봅시다.

create table phoneInfo_basic (
    idx number(6) constraint PK_pib_idx primary key,
    fr_name varchar2(20) not null,
    fr_phonenumber varchar2(20) not null,
    fr_email varchar2(20),
    fr_address varchar2(20),
    fr_regdate date default sysdate
);

create table phoneInfo_univ (
    idx number(6) constraint PK_piu_idx primary key,
    fr_u_major varchar2(20) default 'N' not null,
    fr_u_year number(1) default 1 not null check (0 < fr_u_year and fr_u_year < 5),
    fr_ref number(7) references phoneInfo_basic(idx) not null
);

create table phoneInfo_com (
    idx number(6) constraint PK_pic_idx primary key,
    fr_c_company varchar2(20) default 'N' not null,
    fr_ref number(6) references phoneInfo_basic(idx) not null
);


-- 전화번호부 테이블을 기준으로 DML 을 작성해봅시다.
-- 1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_basic;

insert into phoneInfo_basic (idx, fr_name, fr_phonenumber, fr_email, fr_address) values (123456, '수범', '010-4944-2396', 'tnqjarnqja@gmail.com', '일산');

update phoneInfo_basic
set fr_name = '이수범'
where fr_phonenumber = '010-4944-2396';

delete from phoneInfo_basic where fr_name = '이수범';

-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_univ;

insert into phoneinfo_univ (idx, fr_u_major, fr_u_year, fr_ref) values (123456, 'N', 1, 123456);

update phoneInfo_univ
set fr_u_year = 2
where idx = 123456;

delete from phoneinfo_univ where idx = 123456;

-- 3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneinfo_com;

insert into phoneinfo_com (idx, fr_c_company, fr_ref) values (123456, 'feral', 123456);

update phoneinfo_com
set fr_c_company = 'catopia'
where idx = (select idx from phoneInfo_basic where fr_name = '이수범');

delete from phoneinfo_com where idx = 123456;