package springweb.a01_start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class A04_Controller {

	//http://localhost:7080/springweb/reqexp01.do
	@RequestMapping("reqexp01.do")
	public String reqexp01() {
		return "WEB-INF\\views\\a01_form\\a02_requestShow.jsp";
	}
	@RequestMapping("reqexp02.do")
	public String reqexp02(@RequestParam("name") String name) {
		System.out.println("name:"+name);
		return "WEB-INF\\views\\a01_form\\a02_requestShow.jsp";
	}
	@RequestMapping("reqexp03.do")
	public String reqexp03(@RequestParam("age") int age) {
		System.out.println("age:"+age);
		return "WEB-INF\\views\\a01_form\\a02_requestShow.jsp";
	}
	@RequestMapping("gogo01.do")
	public String gogo01(@RequestParam("id") String id) {
		System.out.println("id:"+id);
		return "WEB-INF\\views\\a01_form\\a02_requestShow.jsp";
	}
}
