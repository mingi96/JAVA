package transportation.project;

public class Transportation {
	protected String transName;
	protected String transNumber; // 번호
	protected int passengerCount; // 승객 수
	int money; // 돈
	
	public Transportation(String transNumber, String transName, int passengerCount) {
		this.transNumber = transNumber;
		this.transName = transName;
		this.passengerCount = passengerCount;
	}
	
	public void take(int money)	{
		this.money = money;
	}
	
	public String showInfo() {
		return (transName + transNumber + "의 승객은 " + passengerCount + "명이고 ");
	}

	public String getTransName() {
		return transName;
	}

	public void setTransName(String transName) {
		this.transName = transName;
	}

	public String getTransNumber() {
		return transNumber;
	}

	public void setTransNumber(String transNumber) {
		this.transNumber = transNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	

	
	
	
	
}
