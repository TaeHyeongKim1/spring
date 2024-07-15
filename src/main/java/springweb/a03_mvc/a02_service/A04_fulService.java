package springweb.a03_mvc.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a03_mvc.a03_dao.A04_fulDao;
import springweb.z01_vo.Calendar;

@Service
public class A04_fulService {
		
	@Autowired(required =false)
	private A04_fulDao dao;
	
	public List<Calendar> getListCalendar(){
		List<Calendar> list = dao.getListCalendar();
		System.out.println(dao);
		System.out.println("트래킹연습");
		return list;
	}
	
	public String insertCalendar(Calendar ins) {
		System.out.println(ins);
		return dao.insertCalendar(ins)>0?"등록성공":"등록실패";
	}
	public String updateCalendar(Calendar upt) {
		return dao.updateCalendar(upt)>0?"업데이트 성공":"업데이트실패";
	}
	
	public String deleteCalendar(int id) {
		return dao.deleteCalendar(id)>0?"삭제성공":"삭제실패";
	}
	
}
