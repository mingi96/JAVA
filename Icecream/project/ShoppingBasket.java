package Icecream.project;

public class ShoppingBasket {
	private String id; //아이디
	private String name; //이름
	private int phone; //번호
	private int balance; //잔고
	
	//생성자
	public ShoppingBasket(String id, String name, int phone, int balance) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.balance = balance;
	}

	//메소드
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
}
