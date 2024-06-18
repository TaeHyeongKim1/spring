package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z05_vo.HPUser;
import a01_diexp.z05_vo.HandPhone;
import a01_diexp.z05_vo.Computer;
import a01_diexp.z05_vo.Cpu;

public class DIExp21 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String path = "a01_diexp\\di20.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
		/*
		 * Cpu cpu =ctx.getBean("cpu",Cpu.class); cpu.setCampany("인텔");
		 * cpu.setLevel("i9");
		 */
      Computer computer = ctx.getBean("computer",Computer.class);
      System.out.println("컨테이너 안에 객체 : "+computer);
      computer.setCompany("삼성컴");
      computer.useCpu();
      
      HandPhone handPhone =ctx.getBean("handPhone",HandPhone.class);
      handPhone.setCompany("샘숭");
      handPhone.setNumber("010-2244-3377");
      
      HPUser hp1 = ctx.getBean("hp1",HPUser.class);
      hp1.setName("김삼순");
      hp1.useMyPhone();
      
      ctx.close();
      
   }

}
