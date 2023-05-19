

-- tbl_board SQL
select * from tbl_board;

-- select

-- insert
insert into tbl_board (title, content, writer) values ('게시글 테스트1', '게시글 쓰기 테스트1', '테스터');
-- insert into tbl_board (title, content, writer) values (#{}, #{}, #{})

-- update
update tbl_board set title='test11', content='test22', writer='test33', file='aa.jpg' where bno=7;
-- update tbl_board set title = #{}, content = #{}, writer = #{}, file = #{} where bno = #{}

-- delete