package springweb.a03_mvc.a03_dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import springweb.z01_vo.Calendar;


public interface A04_fulDao {

	@Select("Select id,title,writer,start1 'start',end1 'end' ,content,backgroundColor,textColor,allDay,url values("
			+ "cal_seq.nextval , #{title}, #{writer}, #{start}, #{end} ,#{content},#{backgroundColor}, #{textColor}, #{allDay}, #{url}  )")
	public List<Calendar> getListCalendar();
	@Insert("INSERT INTO calendar values(cal_seq.nextval,#{title},#{writer},#{start},\r\n"
			+ "					#{end},#{content},#{backgroundColor},#{textColor},#{allDay},#{url})")
	public int insertcal(Calendar ins);
}
