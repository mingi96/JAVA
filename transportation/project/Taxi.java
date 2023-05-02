package transportation.project;

public class Taxi extends Transportation {
	public Taxi(String transNumber, String transName, int passengerCount) {
		super(transNumber, transName, passengerCount);
		
		
	}
	
	@Override
	public String showInfo() {
		super.money = 7000;
		return super.showInfo() + "수입은 " + money * passengerCount  + "원 입니다.";
	}
	
}
