package Homework;

public abstract class Pen {
	private String brand;
	private int price;
	public Pen() {
		
	}
	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public abstract void write();

	public void battle(){
		System.out.print("去吧！傑尼龜");
		System.out.print("去吧！小火龍");
		System.out.print("去吧！妙蛙種子");
	}

}
