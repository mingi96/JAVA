package Icecream.project;

import java.util.Scanner;

import quiz.Account;

public class IcecreamExample {

	// 계좌객체를 저장할 수 있는 배열(디폴트 값: null)
	private static Icecream[] accountArray = new Icecream[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Icecream icecream1 = new Icecream("메로나", "빙그레", 1500);
		Icecream icecream2 = new Icecream("죠스바", "롯데", 1000);
		Icecream icecream3 = new Icecream("쌍쌍바", "해태", 700);

		Scanner scanner = new Scanner(System.in);

		System.out.println("1: 메로나 2: 죠스바 3: 쌍쌍바");

		int input = scanner.nextInt();

		if (input == 1) {
			System.out.println("제품명: " + icecream1.name);
			System.out.println("회사명: " + icecream1.companyName);
			System.out.println("가격: " + icecream1.price);

		} else if (input == 2) {
			System.out.println("제품명: " + icecream2.name);
			System.out.println("회사명: " + icecream2.companyName);
			System.out.println("가격: " + icecream2.price);

		} else {
			System.out.println("제품명: " + icecream3.name);
			System.out.println("회사명: " + icecream3.companyName);
			System.out.println("가격: " + icecream3.price);
		}

		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				// 구매
				buy();
				break;
			case 2:
				// 구매X
				noBuy();
				break;
			case 3:
				run = false;
				break;
			default:
				System.out.println("1, 2 선택하세요.");
				break;
			}
		}
	}
	
	private static void buy() {
		
	};
}

//	private static void createAccount(icecream1, companyName, price) {
//		
//		Icecream newIcecream = new Icecream(name, companyName, price);
//
//		for (int i = 0; i < accountArray.length; i++) {
//			// accountArray[0]에만 계좌객체가 저장되므로 아래와 같이 처리한다.
//			if (accountArray[i] == null) {
//				accountArray[i] = newIcecream; // 생성한 계좌객체를 배열에 넣어준다.
//				System.out.println("결과: 계좌가 생성되었습니다.");
//				break; // 계좌를 생성하면 for문을 나온다.
//			}
//		}
//
//		// 계좌가 잘 생성이 되었나 확인(객체이므로 주소가 찍힌다.)
//
//		for (Icecream account : accountArray) {
//			System.out.println(account);
//		}
//	}
//
//	private static void buy() {
//		System.out.println("-------");
//		System.out.println("구매");
//		System.out.println("-------");
//		// 계좌번호, 예금액 입력
//		System.out.println("구매할 아이스크림 제품명: ");
//		String name = scanner.next(); // String타입으로 입력을 받는다.
//
//		// 계좌찾기
//
//		// 리턴해 주는 값을 같은 타입인 Account로 받는다.
//		// account 변수에는 찾은 계좌가 들어있다.
//		ShoppingBasket account = findAccount(name);
//
//		if (account == null) {
//			System.out.println("결과: 계좌가 없습니다.");
//			return; // 메소드를 끝낸다.
//		}
//
////		account.setBalance(account.getBalance() + money);
//		System.out.println("결과: 예금이 성공되었습니다.");
//
//	}
//
//	// 아이스크림 구매
//	private static void icecreambuy() {
//		System.out.println("-------");
//		System.out.println("아이스크림 구매");
//		System.out.println("-------");
//
//		// 계좌번호, 예금액 입력
//		System.out.println("아이디: ");
//		String id = scanner.next(); // String타입으로 입력을 받는다.
//
//		System.out.println("아이스크림 종류: ");
//		icecreamtype();
//
//		System.out.println("가격: ");
//		int money = scanner.nextInt(); // int타입으로 입력을 받는다.
//
//		// 계좌찾기
//
//		// 리턴해 주는 값을 같은 타입인 Account로 받는다.
//		// account 변수에는 찾은 계좌가 들어있다.
//		ShoppingBasket account = findAccount(id);
//
//		if (account == null) {
//			System.out.println("결과: 아이디가 없습니다.");
//			return; // 메소드를 끝낸다.
//		}
//
//		account.setBalance(account.getBalance() - money);
//		System.out.println("결과: 아이스크림 구매성공!");
//	}
//
//	// 아이스크림 종류
//	private static void icecreamtype() {
//		boolean run = true;
//
//		while (run) {
//			System.out.println("-----------------------------------------");
//			System.out.println("1.메로나 | 2.ㅇㅇ | 3.ㅇㅇ | 4.구매X");
//			System.out.println("-----------------------------------------");
//			System.out.println("선택>");
//			int selectNo = scanner.nextInt();
//
//			switch (selectNo) {
//			case 1:
//				//
////				show();
//				break;
//			case 2:
//				// 지갑
////				accountList();
//				break;
//			case 3:
//				// 아이스크림 구매
//				icecreambuy();
//				icecreamtype();
//				break;
//			case 4:
//				run = false;
//				break;
//			default:
//				System.out.println("1~4사이의 숫자를 입력해주세요.");
//				break;
//			}
//		}
//
//		// 아이디찾기
////	private static ShoppingBasket findAccount(String id) {
////		ShoppingBasket resultAccount = null;
////		for (ShoppingBasket account : accountArray) {
////			// 배열의 값이 null이 아닐때만 실행한다. => account객체를 가지고 있을때
////			if (account != null) {
////				if (id.equals(account.getId())) {
////					/*
////					 * 여기서 return을 하면 안되므로 아래와 같이 찾은 계좌를 Account타입의 변수인 resultAccount에 넣어준다.
////					 */
////					resultAccount = account;
////					break;
////				}
////			}
////		}
//
////		return resultAccount; // 찾은 계좌를 리턴해준다.
//	}
//}
