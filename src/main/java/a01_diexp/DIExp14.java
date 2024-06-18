package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Computer;

public class DIExp14 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String path = "a01_diexp\\di14.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
      Computer com0 = ctx.getBean("com0",Computer.class);
      Computer com1 = ctx.getBean("com1",Computer.class);
      Computer com2 = ctx.getBean("com2",Computer.class);
      com0.useCpu();
      com1.useCpu();
      com2.useCpu();
      
      
      System.out.println("컨테이너 안에 객체 : "+com0);
      ctx.close();
   }

}
