package springweb.a03_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import springweb.a03_mvc.a02_service.A02_FileUploadService;

@Controller
public class A02_FileUploadCtrl {
	@Autowired(required =false)
	private A02_FileUploadService service;
	//  http://localhost:7080/springweb/uploadExp01.do
	@GetMapping("uploadExp01.do")
	public String uploadExp01() {
		
		return "WEB-INF\\views\\a04_fileUpload\\a01_upload.jsp";
	}
	@PostMapping("uploadExp01.do")
	public String uploadExp01Post(@RequestParam("report") MultipartFile mf, Model d) {
		System.out.println("서버에 온 multifile:"+mf.getOriginalFilename());
		d.addAttribute("msg", service.upload01(mf));
		return "WEB-INF\\views\\a04_fileUpload\\a01_upload.jsp";
	}
	

}