package springweb.a03_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.a03_mvc.a02_service.A04_fulService;
import springweb.z01_vo.Calendar;

@Controller
public class A04_FullCalController {
	@Autowired(required = false)
	private A04_fulService service;
	// cmd 창..
	// 
	// http://localhost:7080/springweb/calendar.do
	@GetMapping("calendar.do")
	public String calendar() {
		return "WEB-INF\\views\\a03_mvc\\a07_fullcalendar.jsp";
	}
	// http://localhost:7080/springweb/callList.do
	@GetMapping("callList.do")
	public String callList(Model d) {
		d.addAttribute("calList", service.getListCalendar());
		return "jsonView";
	}
	// // http://localhost:7080/springweb/insertCalendar.do
	@PostMapping("insertCalendar.do")
	public String insertCalendar(Calendar insert, Model d) {
		d.addAttribute("msg", service.insertCalendar(insert));
		d.addAttribute("calList", service.getListCalendar());
		return "jsonView";
	}
	
	@PostMapping("updateCalendar.do")
	public String updateCalendar(Calendar upt, Model d) {
		d.addAttribute("msg",service.updateCalendar(upt));
		d.addAttribute("calList",service.getListCalendar());
		return "jsonView";
	}
	@PostMapping("deleteCalendar.do")
	public String deleteCalendar(@RequestParam("id") int id, Model d) {
		d.addAttribute("msg",service.deleteCalendar(id));
		d.addAttribute("calList",service.getListCalendar());
		return "jsonView";
		
	}
	
	
}
