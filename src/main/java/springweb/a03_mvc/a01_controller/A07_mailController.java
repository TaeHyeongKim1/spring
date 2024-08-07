package springweb.a03_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import springweb.a03_mvc.a02_service.A07_MailService;
import springweb.z01_vo.MailVo;
import springweb.z01_vo.RegMember;

@Controller
public class A07_mailController {
	
	@Autowired(required =false)
	private A07_MailService service;
	
	
	@Value("${mailaccount}")
	private String mailaccount;
	
	//Controller 단에서 사용할 공통적인 모델 데이터를 선언할떄 활용
	@ModelAttribute("mailaccount")
	public String getMailAccount() {
		
		return mailaccount;
	}
	
	
	
	// http://localhost:7080/springweb/mail.do
	@GetMapping("mail.do")
	public String mailForm() {
		return "WEB-INF\\views\\a02_mvc\\a03_mailForm.jsp";
	}
	
	@PostMapping("mail.do")
	public String sendMail(MailVo mail, Model d) {
		d.addAttribute("msg",service.sendMail(mail));
		return "WEB-INF\\views\\a02_mvc\\a03_mailForm.jsp";
	}
	//자동 사원접속정보 발생
	// http://localhost:7080/springweb/regEmpTmp.do
	
		@GetMapping("regEmpTmp.do")
		public String repEmpTmpForm() {
			return "WEB-INF\\views\\a02_mvc\\a04_regEmpTmpForm.jsp";
		}
		
		@PostMapping("regEmpTmp.do")
		public String repEmpTmpMail(RegMember mem, Model d) {
			//mem.getEmpno(),mem.getEmail()
			d.addAttribute("msg",service.makeEmpMail(mem));
			return "WEB-INF\\views\\a02_mvc\\a04_regEmpTmpForm.jsp";
		}
}

