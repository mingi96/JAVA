package Icecream.project;

public class Icecream {
	String name;
	String companyName;
	int price;

	public Icecream(String name, String companyName, int price) {
		this.name = name;
		this.companyName = companyName;
		this.price = price;
	}

	public void show() {
		System.out.println("이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("이름: " + price);
	}
	
}
