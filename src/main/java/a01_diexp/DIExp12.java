package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Music;
import a01_diexp.z01_vo.Person;

public class DIExp12 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String path = "a01_diexp\\di12.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
     Person ob = ctx.getBean("p01" , Person.class);
      System.out.println("컨테이너 안에 객체 : "+ob);
	   System.out.println(ob.getName());
	   System.out.println(ob.getAge());
	   System.out.println(ob.getLoc());
	   Music m1 = ctx.getBean("m1" , Music.class);
	       System.out.println("컨테이너 안에 객체 : "+m1);
		   System.out.println(m1.getTitle());
		   System.out.println(m1.getSinger());
		   System.out.println(m1.getYear());
      ctx.close();
   }

}
