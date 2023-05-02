package transportation.project;

import java.util.Scanner;
import java.util.ArrayList;

public class TransExample {
	
	private static ArrayList<Transportation> TransportationList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		Bus bus521 = new Bus("521번", "버스", 15);
		Bus bus519 = new Bus("519번", "버스", 8);
		
		Subway subway1 = new Subway("1호선", "지하철", 30);
		Subway subway2 = new Subway("2호선", "지하철", 21);
		
		Taxi taxi1 = new Taxi("1", "택시", 3);
		Taxi taxi2 = new Taxi("2", "택시", 1);
		
		TransportationList.add(bus521);
		TransportationList.add(bus519);
		TransportationList.add(subway1);
		TransportationList.add(subway2);
		TransportationList.add(taxi1);
		TransportationList.add(taxi2);
		
		//1. 모든 대중교통 정보 출력하기
		showAllTransportation();
		
		//2. 상품구매시 id로 찾은 고객의 실제 지불금액과 보너스 포인트 출력
		Transportation transportation = findTransportation("521");		
		
		
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				//승객수 보여주기
				passengerCountList();
				break;
			case 2:
			
				accountList();
				break;
		
		
	}
	
	public static void showAllTransportation() {
		System.out.println("==========모든 대중교통 이용 정보 출력==========");
		
		for(Transportation transportation : TransportationList) {
			System.out.println(transportation.showInfo());
		}
	}
	
	//이름으로 
	public static Transportation findTransportation(String transName) {
		Transportation resultTransportation = null;
		
		for(Transportation transportation : TransportationList) {
			//이름이 같으면
			if(transportation.getTransName() == transName) {
				//id가 같은 transportation 객체를 resultTransportation에 넣어준다.
				resultTransportation = transportation;
				break;
				
				
			}
		}
		
		return resultTransportation;
	}
	
	

}
