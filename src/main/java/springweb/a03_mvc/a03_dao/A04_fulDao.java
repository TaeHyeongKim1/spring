package springweb.a03_mvc.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import springweb.z01_vo.Calendar;


public interface A04_fulDao {

	@Select("	select id, title, writer, start1 \"start\", end1 \"end\", content, backgroundcolor,\r\n"
			+ "			textcolor, allday, url urlLink\r\n"
			+ "	from calendar")
	public List<Calendar> getListCalendar();
	
	@Insert("INSERT INTO calendar values(cal_seq.nextval,#{title},#{writer},#{start},\r\n"
			+ "					#{end},#{content},#{backgroundColor},#{textColor},#{allDay},#{urlLink})")
	public int insertCalendar(Calendar ins);
	
	@Update("Update calendar set title =#{title}, start1=#{start}, end1=#{end} , writer =#{writer} ,"
			+ "content = #{content}, backgroundColor = #{backgroundColor}, textColor=#{textColor}"
			+ ", allDay =#{allDay}, url=#{urlLink} Where id=#{id}")
	public int updateCalendar(Calendar upt);
	
	@Delete("Delete from calendar where id = #{id}")
	int deleteCalendar(@Param("id") int id);
}
