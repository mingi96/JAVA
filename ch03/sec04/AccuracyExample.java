package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		// 정확한 계산은 정수 연산으로 해야한다.
		
		int apple = 1; //사과 1조각
		int totalpieces = apple * 10; //10
		int number = 7;
		
		int result = totalpieces - number; //10 - 7 = 3
		System.out.println("사과 1개에서 남은양:" + result/10.0);
	}

}
