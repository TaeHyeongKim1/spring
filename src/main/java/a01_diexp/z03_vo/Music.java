package a01_diexp.z03_vo;

import org.springframework.stereotype.Component;

@Component
public class Music {
	private String title;
	private String singer;
	private int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Music(String title, String singer, int year) {
		super();
		this.title = title;
		this.singer = singer;
		this.year = year;
	}
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}
}
