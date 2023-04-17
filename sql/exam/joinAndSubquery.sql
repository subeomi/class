-- 1 마당서점의고객이요구하는다음질문에대해SQL 문을작성하시오.
-- (5) 박지성이 구매한 도서의 출판사 수
select count(publisher)
from orders o, book b
where o.bookid = b.bookid
      and o.custid = 1;
      
select count(distinct b.publisher)
from orders o, book b, customer c
where o.bookid = b.bookid and o.custid = c.custid and c.name = '박지성';
      
-- (6) 박지성이구매한도서의이름, 가격, 정가와판매가격의차이
select b.bookname, abs(o.saleprice - b.price) as pricegap
from orders o, book b
where o.bookid = b.bookid
      and o.custid = 1;
      
select b.bookname, b.price ,b.price - o.saleprice as gap
from orders o, book b, customer c
where o.bookid = b.bookid and o.custid = c.custid and c.name = '박지성';
      
-- (7) 박지성이 구매하지 않은 도서의 이름
select b.bookname
from book b
where not exists (select * from orders o where o.custid = 1 and b.bookid = o.bookid) ;

select distinct bookid
from orders o, customer c
where o.custid = c.custid and c.name = '박지성';

select bookname
from book
where bookid not in (select distinct bookid
              from orders o, customer c
              where o.custid = c.custid and c.name = '박지성');

-- 2 마당서점의운영자와경영자가요구하는다음질문에대해SQL 문을작성하시오.
-- (8) 주문하지 않은 고객의 이름(부속질의사용)?
select name 
from customer 
where custid not in (select custid from orders);



-- (9) 주문금액의총액과주문의평균금액
select sum(saleprice) as total, avg(saleprice) as avgsaleprice
from orders;

-- (10) 고객의이름과고객별구매액
select c.name, sum(o.saleprice)
from customer c, orders o
where c.custid = o.custid
group by c.custid, c.name;

-- (11) 고객의이름과고객이구매한도서목록
select c.name, b.bookname
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
order by name;

-- (12) 도서의가격(Book 테이블)과판매가격(Orders 테이블)의차이가가장많은주문
select *
from orders o, book b 
where o.bookid = b.bookid
      and (b.price - o.saleprice) = (select max(price-saleprice) from orders o, book b where o.bookid = b.bookid);
-- 도서가격과 판매가격의 차이 값들 중, 차이가 가장 큰(max, price가 saleprice보다 크다) 값과 비교해서 참인 o와 b의 *를 출력

-- (13) 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
select c.name
from orders o, customer c
where o.custid = c.custid
group by c.name
having avg(saleprice) > (select avg(saleprice) from orders); -- 중첩질의. where는 조인만 해주고 그룹함수를 위해 having에서 써준다

select c.custid, c.name, avg(o.saleprice)
from orders o, customer c
where o.custid = c.custid
group by c.custid, c.name
having avg(o.saleprice) > (select avg(saleprice) from orders)
order by c.custid;

-- 3. 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
-- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select distinct c.name
from customer c, orders o, book b
where b.publisher in (select publisher from book b, orders o where o.custid = 1 
    and o.bookid = b.bookid) 
    and c.custid = o.custid 
    and o.bookid = b.bookid 
    and name != '박지성'; -- 본인 제외


-- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select name 
from (select name, count(distinct publisher) count 
    from customer c, book b, orders o 
    where c.custid = o.custid 
    and b.bookid = o.bookid
    group by name) 
where count >= 2;
    
select c.custid, c.name, count(distinct b.publisher)
from orders o, book b, customer c
where o.bookid = b.bookid and o.custid = c.custid
group by c.custid, c.name
having count(distinct b.publisher) > 1;

-- 2개 이상의 출판사의 책을 구매한 회원 id
select *
from customer
where custid in (select o.custid
                 from orders o, book b
                 where o.bookid = b.bookid
                 group by o.custid
                 having count(distinct b.publisher) > 1);

select o.custid
from orders o, book b
where o.bookid = b.bookid
group by o.custid
having count(distinct b.publisher) > 1;