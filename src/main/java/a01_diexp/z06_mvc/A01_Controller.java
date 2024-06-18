package a01_diexp.z06_mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A01_Controller {
	@Autowired
	private A02_Service service;
	
	
	//요청처리 : url + 요청key/val
	@RequestMapping("/empList.do")
	public String getEmpList(String sch, Model d) {
		d.addAttribute("empList", service.getList(sch));
		System.out.println("서비스단 호출"+service.getList(sch));
		return "";  //view단 호출
	}
	
	
}
