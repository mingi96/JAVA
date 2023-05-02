package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		
		System.out.println();
		
		//정적필드 호출 => 클래스명.상수
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		
		System.out.println();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
