package a01_diexp.z03_vo;

import org.springframework.stereotype.Component;

//a01_diexp.z01_vo.HPUser

@Component
public class HPUser {
	private String name;
	private HandPhone handPhone;  // 1:1 관계 객체
	public HPUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HPUser(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HandPhone getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(HandPhone handPhone) {
		this.handPhone = handPhone;
	}
	public void useMyPhone() {
		System.out.println(name+ "핸드폰 사용?");
		if(handPhone!=null) {
			System.out.println("소유한 핸드폰 정보");
			System.out.println("번호:"+handPhone.getNumber());
			System.out.println("제조사:"+handPhone.getCompany());
		}else {
			System.out.println("ㅠㅠ 핸드폰이 없네요");
		}
	}
	//setHp1 : set property명이 h1이라고 지정됨
	public void setHp1(HandPhone handPhone) {
		this.handPhone = handPhone;
	}
		
	
}
