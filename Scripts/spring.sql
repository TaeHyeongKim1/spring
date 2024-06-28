-- 1.급여가 단일컬럼 여러행(연습문제)
-- 급여가 1000~2000 사이의 의 사원명
SELECT ename
FROM emp
WHERE sal BETWEEN 1000 and 3000;

--2. 직책이 salesman인 사원의 입사일
SELECT hiredate
FROM emp
WHERE job ='salesman';

--3. 부서번호가 30인 사원의 급여
SELECT sal
FROM emp
WHERE deptno=30;

--4. 보너스가 null인 사원의 급여
SELECT sal
FROM emp
WHERE comm IS NULL;

--5. 관리자 번호가 7902인 사원의 사원명
SELECT ename
form emp
WHERE mgr = 7902;


-- 사원번호가 7369인 사원의 이름 직책 급여를 조회하세요
SELECT ename,job,sal
FROM emp
WHERE empno=7369;

-- 부서번호가 20인 부서의 부서이름과 위치를 조회하세요
SELECT dname, loc
FROM dept
WHERE deptno= 20

-- 사원명 allen인 사원번호 이름 부서명 부서위치를 조회하세요
SELECT empno, ename, dname, deptno
FROM emp e
where e.deptno = d.deptno
and ename = 'ALLEN';
--기장 낮은 급여를 받는 사원의 이름 직책 급여를 조회하세요
SELECT e.ename, e.job, e.sal
FROM emp e
JOIN salgrade s ON e.sal BETWEEN s.losal AND s.hisal
WHERE e.sal = (SELECT MIN(sal) FROM emp);

-- accounting 부서에 속한 가장 급여가 높은 사원의 이름 직책 입사 날짜를 조회하세요
Select *
from emp
where (deptno, sal) in(
select deptno, max(sal)
from emp
where deptno=(select deptno
from dept
where dname like 'ACCOUNTING')
group by deptno
);

1. 부서번호가 10인 모든사원의 이름 직책 급여 조회
select ename,job, sal
from emp
where deptno=10;



















