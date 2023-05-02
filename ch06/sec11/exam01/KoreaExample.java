package ch06.sec11.exam01;

public class KoreaExample {

	public static void main(String[] args) {
		Korea k1 = new Korea("감자바");
		
		//필드값 읽기
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//필드값 변경
		//k1.nation = "USA"; //X
		//k1.ssn = "1232"; //X
		//k1.name = "이자바"; //O
	}

}
