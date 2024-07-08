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
		return dao.getListCalendar();
	}
	public int insertcal(Calendar ins) {
		return dao.insertcal(ins);
	}
	
}
