package transportation.project;

public class Subway extends Transportation {
	public Subway(String transNumber, String transName, int passengerCount) {
		super(transNumber, transName, passengerCount);
		
		
		
	}

	@Override
	public String showInfo() {
		return super.showInfo() + "수입은 " + 1200 * passengerCount + "원 입니다.";
	}
}
