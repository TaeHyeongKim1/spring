package springweb.a03_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import springweb.a03_mvc.a02_service.A03_FileUpLoadService;

public class A03_FileUploadCtrl {
	  @Autowired(required = false)
	   private A03_FileUpLoadService service;
	   
	   // http://localhost:7080/springweb/uploadexp02.do
	   @GetMapping("uploadexp02.do")
	   public String uploadexp02() {
	      return "WEB-INF\\views\\a04_fileUpload\\a02_upload.jsp";
	   }
	   @PostMapping("uploadexp02.do")
	   public String uploadexp02(@RequestParam("report") MultipartFile[] reports,Model d) {
	      System.out.println("#다중 파일 업로드#");
	   for(MultipartFile mf:reports ) {
	      System.out.println(mf.getOriginalFilename());
	      }
	      d.addAttribute("msg",service.upload(reports));
	      return "WEB-INF\\views\\a04_fileUpload\\a02_upload.jsp";
	   }
	}
