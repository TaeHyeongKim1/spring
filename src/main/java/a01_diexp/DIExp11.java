package a01_diexp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.z01_vo.Person;
import a01_diexp.z01_vo.Product;

public class DIExp11 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String path = "a01_diexp\\di11.xml";
      AbstractApplicationContext ctx = new GenericXmlApplicationContext(path);
      Object ob = ctx.getBean("obj",Object.class);
      System.out.println("컨테이너 안에 객체 : "+ob);
      Person p01 =ctx.getBean("p01", Person.class);
      System.out.println("컨테이너 안에 있는 p01 객체name:"+p01.getName());
      System.out.println("컨테이너 안에 있는 p01 객체Age:"+p01.getAge());
      System.out.println("컨테이너 안에 있는 p01 객체Loc:"+p01.getLoc());
      Product p02 =ctx.getBean("p02", Product.class);
      System.out.println("컨테이너 안에 있는 p01 객체prod:"+p02.getProd());
      System.out.println("컨테이너 안에 있는 p01 객체price:"+p02.getPrice());
      System.out.println("컨테이너 안에 있는 p01 객체cnt:"+p02.getCnt());
      ctx.close();
   }

}
