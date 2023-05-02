package transportation.project;

public class Student {
	int grade;
	int money;
	String studentName;
	
	public Student(String studentName, int money)
	{
		this.studentName = studentName;
		this.money = money;
	}
	
	// 객체간의 협업 (핵심부분), 다른 클래스에 영향을 주는 것.
	public void takeBus(Bus bus) // 버스에 대한 정보를 매개변수로 받아온다. bus는 객체이다.
	{
		bus.take(1000); // 버스라는 클래스에 1000원을 지불하는 것 
		money -= 1000; // 1000원이 소비된다.
	}
	
	// 객체간의 협업 (핵심부분), 다른 클래스에 영향을 주는 것.
	public void takeSubway(Subway subway) // 지하철에 대한 정보를 매개변수로 받아온다. Subway는 객체이다.
	{
		subway.take(1500); // 지하철 클래스에 1500원을 지불하는 것 
		money -= 1500; // 1500원이 소비된다.
	}
	
	public void showInfo()
	{
		System.out.println(studentName + "님의 남은 잔액은 " + money + "원 입니다.");
	}
}
