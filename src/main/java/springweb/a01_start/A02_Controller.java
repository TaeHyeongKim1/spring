package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class A02_Controller {

	@RequestMapping("second.do")
	public String start(){
		
	
	return "a02_Second.jsp";
	
}
}
