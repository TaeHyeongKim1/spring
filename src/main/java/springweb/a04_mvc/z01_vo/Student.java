package springweb.a04_mvc.z01_vo;

public class Student {
	   private String sname;
	   private int kor;
	   private int eng;
	   private int math;
	   private int no;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Student(String sname, int kor, int eng, int math) {
		super();
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int no, String sname, int kor ) {
		super();
		this.sname = sname;
		this.kor = kor;
		this.no = no;
	}
	      }