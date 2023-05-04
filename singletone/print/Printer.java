package singletone.print;

public class Printer {
	// 필드
	private static Printer printer = null;

	// 생성자
	private Printer() {
	}

	public static Printer getPrinter() {
		if (printer == null) {
			printer = new Printer(); // printer 인스턴스 생성
		}
		return printer; //맨 처음이 아니라면 원래 쓰던 프린터 객체가 리턴이 된다.
	}

	public void print(String str) {
		System.out.println(str);
	}
}
