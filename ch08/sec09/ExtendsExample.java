package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		
		InterfaceA ia = new InterfaceCImpl();
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = new InterfaceCImpl();
		ib.methodB();
		
		System.out.println();
		
		//InterfaceC가 InterfaceA, InterfaceB를 
		//상속하고 있으므로 InterfaceA, InterfaceB에 있는 메소드 사용가능
		InterfaceC ic = new InterfaceCImpl();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
