package ch07.sec06.package1;

public class B {
	public void method() {
		//클래스가 서로 같은 패키지에 있으면 가져다 쓸 수 있다.
		A a = new A();
		a.field = "value";
		a.method();		
	}
}
