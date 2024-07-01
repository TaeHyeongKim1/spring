package springweb.a04_mvc.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import springweb.z01_vo.Dept;
import springweb.z01_vo.Member;

public interface A02_ExpDao {
	/*
	 dao 선언시, 중복정의 오버로딩으로 메서드는 서넝ㄴ할수 있으나 mybatis 프레임워크 내부적으로 식별하는 기준이
	 메서드명이기때문에 서로 다르게 선언되어야한다 (에러발생의 원인)
	  
	  */
	
	// ex1) grade 매개변수로 입력처리..(#)
	@Select("SELECT hisal\r\n"
			+ "FROM SALGRADE\r\n"
			+ "WHERE grade = 1 ")
	int getHiSal1();
	
	
	@Select("SELECT hisal\r\n"
			+ "FROM SALGRADE\r\n"
			+ "WHERE grade = #{grade}")
	int getHiSal(@Param("grade") int grade);
	
	// ex1)
	@Select("SELECT empno\r\n"
			+ "FROM emp\r\n"
			+ "WHERE deptno = #{deptno01} ")
	List<Integer> getEmpnos(@Param("deptno01") int deptno);
	// ex2)
	@Select("SELECT ename\r\n"
			+ "FROM emp\r\n"
			+ "WHERE sal BETWEEN #{start1} AND #{end1} ")
	List<String> getEnames(@Param("start1") int start1, 
						   @Param("end1") int end1 );
	/*
	@Insert("INSERT INTO dept01 values(#{deptno},#{dname},#{loc})")
	int insertDept01(@Param("deptno") int deptno,
	                 @Param("dname") String dname,
	                 @Param("loc") String loc);
	*/
	@Insert("INSERT INTO dept01 values(#{deptno},#{dname},#{loc})")                                  
	int insertDept01(Dept ins);     	
	
	@Select("select *\r\n"
	         + "from member01\r\n"
	         + "where id like #{id}\r\n"
	         + "and name like #{name}\r\n"
	         + "and auth like #{auth}")
	   List<Member> memberList(Member sch);
	
}




