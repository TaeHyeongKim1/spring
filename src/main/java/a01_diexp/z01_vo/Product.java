package a01_diexp.z01_vo;

public class Product {
	private String prod;
	private int price;
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public Product(String prod, int price, int cnt) {
		super();
		this.prod = prod;
		this.price = price;
		this.cnt = cnt;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int cnt;
}
