package ch08.sec11.exam01;

import ch07.sec08.exam01.Tire;

public class Car {
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	//메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
