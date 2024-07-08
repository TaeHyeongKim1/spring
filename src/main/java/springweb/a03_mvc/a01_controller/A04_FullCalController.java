package springweb.a03_mvc.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A04_FullCalController {

		// http://localhost:7080/springweb/calendar.do
		@GetMapping("calendar.do")
		public String calendar() {
			return"WEB-INF\\views\\a03_mvc\\a07_fullcalendar.jsp";
		}
		@RequestMapping("callList.do")
		public String callList() {
			
			return "";
		}
}
