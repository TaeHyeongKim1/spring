package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A03_Controller {
	@RequestMapping("third.do")
	public String start(){
		
	return "a03_third.jsp";

}
}
