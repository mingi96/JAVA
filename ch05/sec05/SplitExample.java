package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		//문자열 분리
		String[] tokens = board.split(",");
		
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		System.out.println(tokens[3]);
	}

}
