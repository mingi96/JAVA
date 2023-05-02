package Icecream.project;

import java.util.Scanner;

import quiz.Account;

public class IcecreamExample {

	// 계좌객체를 저장할 수 있는 배열(디폴트 값: null)
	private static ShoppingBasket[] accountArray = new ShoppingBasket[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.회원등록 | 2.지갑 | 3.아이스크림 구매 | 4.종료");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				// 회원등록
				createAccount();
				break;
			case 2:
				// 지갑
				accountList();
				break;
			case 3:
				// 아이스크림 구매
				icecreambuy();
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("1~4사이의 숫자를 입력해주세요.");
				break;
			}
		}

	}

	// 회원등록
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("아이디 생성");
		System.out.println("-------");

		System.out.println("아이디:");
		String id = scanner.next(); // String 타입으로 입력을 받는다.

		System.out.println("이름:");
		String name = scanner.next(); // String 타입으로 입력을 받는다.

		System.out.println("번호:");
		int phone = scanner.nextInt(); // int 타입으로 입력을 받는다.

		System.out.println("초기입금액:");
		int balance = scanner.nextInt(); // int 타입으로 입력을 받는다.

		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
		System.out.println(balance);

		// 지갑생성
		ShoppingBasket newAccount = new ShoppingBasket(id, name, phone, balance);
		/*
		 * 참고: String이 참조 타입이기 때문에 아래와 같이 사용하는 것처럼 Account도 참조 타입이다. String[] arr =
		 * {"a", "b"};
		 * 
		 * for(String a : arr) { system.out.println(a)};
		 */
		// 중요. 배열안에 객체를 넣는게 포인트.
		for (int i = 0; i < accountArray.length; i++) {
			// accountArray[0]에만 아이디객체가 저장되므로 아래와 같이 처리한다.
			if (accountArray[i] == null) {
				accountArray[i] = newAccount; // 생성한 아이디객체를 배열에 넣어준다.
				System.out.println("결과: 아이디가 생성되었습니다.");
				break; // 아이디를 생성하면 for문을 나온다.
			}
		}

		// 아이디가 잘 생성이 되었나 확인(객체이므로 주소가 찍힌다.)

		for (ShoppingBasket account : accountArray) {
			System.out.println(account);
		}

	}

	// 지갑 보여주기
	private static void accountList() {
		System.out.println("-------");
		System.out.println("장바구니");
		System.out.println("-------");

		for (ShoppingBasket account : accountArray) {
			// 배열이 null이 아닐때만 실행하기 위해
			if (account != null) {
				System.out.print(account.getId());
				System.out.print(" ");
				System.out.print(account.getName());
				System.out.print(" ");
				System.out.print(account.getPhone());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}

		}
	}

	//아이스크림 구매
	private static void icecreambuy() {
		System.out.println("-------");
		System.out.println("아이스크림 구매");
		System.out.println("-------");

		// 계좌번호, 예금액 입력
		System.out.println("아이디: ");
		String id = scanner.next(); // String타입으로 입력을 받는다.

		System.out.println("가격: ");
		int money = scanner.nextInt(); // int타입으로 입력을 받는다.

		// 계좌찾기

		// 리턴해 주는 값을 같은 타입인 Account로 받는다.
		// account 변수에는 찾은 계좌가 들어있다.
		ShoppingBasket account = findAccount(id);

		if (account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return; // 메소드를 끝낸다.
		}

		account.setBalance(account.getBalance() - money);
		System.out.println("결과: 아이스크림 구매성공!");
	}

	// 아이디찾기
	private static ShoppingBasket findAccount(String id) {
		ShoppingBasket resultAccount = null;
		for (ShoppingBasket account : accountArray) {
			// 배열의 값이 null이 아닐때만 실행한다. => account객체를 가지고 있을때
			if (account != null) {
				if (id.equals(account.getId())) {
					/*
					 * 여기서 return을 하면 안되므로 아래와 같이 찾은 계좌를 Account타입의 변수인 resultAccount에 넣어준다.
					 */
					resultAccount = account;
					break;
				}
			}
		}

		return resultAccount; // 찾은 계좌를 리턴해준다.
	}
}
