package springweb.a03_mvc.a03_dao;

import org.apache.ibatis.annotations.Select;

import springweb.z01_vo.Member;

public interface A05_MemberDao {
	@Select("Select * from member01 where id=#{id} and pwd = #{pwd}")
	Member login(Member mem);
	
}
