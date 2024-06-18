package a01_diexp.z03_vo;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandPhone hp01 = new HandPhone("010-9090-8080","아이폰");
		HandPhone hp02 = new HandPhone();
		hp02.setNumber("010-5555-7777");
		hp02.setCompany("갤럭시");
		
		HPUser hpu01 =new HPUser("마길동");
		hpu01.useMyPhone();  //객체가 할당되지 않았을떄 호출내용
		hpu01.setHandPhone(hp01); 
		hpu01.useMyPhone(); //hp01 객체가 할당되었을때 호출내용
		System.out.println("핸드폰 교체");
		hpu01.setHandPhone(hp02);
		hpu01.useMyPhone(); //hp02 객체가 할당 되었을때, 호출 내용
		
		Cpu cp1 = new Cpu("인텔","i5");
		Cpu cp2 = new Cpu();
		cp2.setCampany("amd");
		cp2.setLevel("rayzen5");
		
		Computer com1 = new Computer("삼성");
		com1.useCpu();
		com1.setCpu(cp1);
		com1.useCpu();
		System.out.println("cpu교체");
		com1.setCpu(cp2);
		com1.useCpu();
		
	}

}
