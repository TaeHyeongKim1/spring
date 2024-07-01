package springweb.a04_mvc.a01_controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.z01_vo.Member;

public class A03_MvcExp {
	@RequestMapping("member114.do")
	public String member114(Member sch, Model d) {
		return "WEB-INF\\views\\a05_mvcexp\\a11_memberList.jsp";
	}
}
