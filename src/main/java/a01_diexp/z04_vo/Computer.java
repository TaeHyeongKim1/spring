package a01_diexp.z04_vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
	private String Company;
	//코드상 자동으로 객체할당 처리(컨테이너 안에있는경우)
	@Autowired
	private Cpu cpu;
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public Computer(String company) {
		super();
		Company = company;
	}
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void useCpu() {
		System.out.println(Company+ "컴퓨터 사용?");
		if(cpu!=null) {
			System.out.println("pc CPU 정보");
			System.out.println("cpu제조사:"+cpu.getCampany());
			System.out.println("cpu성능:"+cpu.getLevel());
		}else {
			System.out.println("cpu가 없네요?");
		}
	}
	public void setCpu2(Cpu cpu) {
		this.cpu = cpu;
	}
}
