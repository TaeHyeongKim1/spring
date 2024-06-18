package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Computer;
import a01_diexp.z01_vo.HPUser;

public class DIExp15 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String path = "a01_diexp\\di15.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
      HPUser hu = ctx.getBean("hu",HPUser.class);
      System.out.println("컨테이너 안에 객체 : "+hu);
      hu.useMyPhone();
      //ex) computer ,cpu 연관 설정후 호출
      Computer com =ctx.getBean("com", Computer.class);
      System.out.println("컨테이너 안에 객체 : "+com);
      com.useCpu();
      
      ctx.close();
   }

}
