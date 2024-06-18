package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z03_vo.Cpu;
import a01_diexp.z03_vo.Computer;

public class DIExp18 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String path = "a01_diexp\\di18.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
      Cpu cpu = ctx.getBean("cpu",Cpu.class);
      Computer computer = ctx.getBean("computer",Computer.class);
    
      cpu.setCampany("인텔");
      cpu.setLevel("i9");
      computer.setCompany("삼성");
      computer.setCpu(cpu);  //객체안에 객체를 할당하는 코드가 있음      
      computer.useCpu();
      ctx.close();
      
   }

}
