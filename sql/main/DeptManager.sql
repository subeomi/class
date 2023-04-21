-- DEPT MANAGER
-- 1. LIST
select * from dept;

-- 2. search
select * from dept where deptno = 10;
-- select * from dept where deptno=
select * from dept where dname = 'ACCOUNTING';
-- select * from dept where dname = ?;

-- 3. insert
insert into dept values (70, 'DEV', 'PUSAN');
-- insert into dept values (?, ?, ?);
rollback;

-- 4. update 수정
update dept set dname = 'AAA', loc = 'BBB' where deptno = 60;
-- update dept set dname = ?, loc = ? where deptno = ?

-- 5. delete 삭제
delete from dept where deptno = 60;
-- delete from dept where deptno = ?;
commit;