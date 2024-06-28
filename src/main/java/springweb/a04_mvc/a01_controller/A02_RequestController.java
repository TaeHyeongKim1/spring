package springweb.a04_mvc.a01_controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class A02_RequestController {
   
   //1. get 방식
   //http://localhost:7080/springweb/call100.do
   @GetMapping("call100.do")
   public String call100() {
      System.out.println("# get방식으로 받은 call100.do #");
      //이클립스 Console창에서 텍스트 결과확인
      return "WEB-INF\\views\\a05_mvcexp\\a02_get_post_method.jsp";
      
   }
   
   //2. post 방식 : url로 절대 받을 수 없음(불가능),
                 //form method = "post"로만 받을 수 있음(조건)
   //http://localhost:7080/springweb/call100.do
   @PostMapping("call100.do")
   public String call100Post() {
      System.out.println("# post방식으로 받은 call100.do #");
      return "WEB-INF\\views\\a05_mvcexp\\a02_get_post_method.jsp";
      
   }
   
   //3. get방식+post방식 => 두 방식으로 받기
   //http://localhost:7080/springweb/call101.do
    @RequestMapping("call101.do")
    public String call101(HttpServletRequest request) {
       System.out.println("# get/post방식으로 받은 call101.do #");
       System.out.println("현재요청된방식:"+request.getMethod());
       return "WEB-INF\\views\\a05_mvcexp\\a02_get_post_method.jsp";
       
    }
}
