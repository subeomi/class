-- 1 마당서점의 고객이 요구하는 다음 질문에 대해 SQL문을 작성하시오.
--(3) 박지성의총구매액(박지성의고객번호는1번으로놓고작성)
SELECT CUSTID, SUM(SALEPRICE)
FROM ORDERS
HAVING CUSTID = 1
GROUP BY CUSTID;

-- (4) 박지성이구매한도서의수(박지성의고객번호는1번으로놓고작성)
SELECT CUSTID, COUNT(*)
FROM ORDERS
HAVING CUSTID = 1
GROUP BY CUSTID;

-- 2 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL문을 작성하시오.
-- (1) 마당서점도서의총개수
SELECT COUNT(*)
FROM BOOK;

-- (2) 마당서점에도서를출고하는출판사의총개수
SELECT COUNT(distinct PUBLISHER)
FROM BOOK;