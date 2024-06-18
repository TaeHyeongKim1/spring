package a01_diexp.z05_vo;

import org.springframework.stereotype.Component;

@Component
public class Cpu {
	private String Level;
	private String Campany;
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public String getCampany() {
		return Campany;
	}
	public void setCampany(String campany) {
		Campany = campany;
	}
	public Cpu(String level, String campany) {
		super();
		Level = level;
		Campany = campany;
	}
	public Cpu() {
		super();
		// TODO Auto-generated constructor stub
	}

}
