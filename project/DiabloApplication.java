package project;

import java.util.ArrayList;

public class DiabloApplication {

	private static ArrayList<Diablo> userList = new ArrayList<>();

	public static void main(String[] args) {
		Diablo diabloAma = new Diablo(1, "아마존");
		Diablo diabloBaBa = new GoldUser(2, "바바");
		Diablo diabloSoSo = new DiaUser(3, "소소");

		// arrayList에 객체를 추가
		userList.add(diabloAma);
		userList.add(diabloBaBa);
		userList.add(diabloSoSo);

		// 1. 모든 유저 정보 출력하기
		showAllUser();

		// 2. 유저 정보
		showLevel(diabloAma, 2);
		showLevel(diabloBaBa, 2);
		showLevel(diabloSoSo, 2);

		// 3. 유저 레벨 출력하기
		Diablo diablo = findUser(3);

		if (diablo == null) {
			System.out.println("존재하지 않는회원입니다.");
		} else {
			playInfo();
		}
	}

	// 유저 찾기 메소드
	private static Diablo findUser(int userID) {
		Diablo resultUser = null;
		for (Diablo diablo : userList) {
			if (diablo.getUserID() == userID) {
				resultUser = diablo;
				break;
			}
		}
		return resultUser;
	}

	// 유저정보 출력 메소드
	public static void showAllUser() {
		System.out.println("==============모든 유저 정보 출력==============");

		for (Diablo diablo : userList) {
			System.out.println(diablo.userInfo());
		}
	}

	// 선택유저 게임 진행시간, 레벨 출력
	public static void showLevel(Diablo diablo, int hour) {
		System.out.println("============선택한 유저의 레벨과 경험치============");

		// 지불금액
		int play = diablo.calcExp(hour);

		System.out.println(diablo.getUserName() + "님의 진행 시간: " + play + "시간");
		System.out.println("현재 레벨: " + diablo.diabloLevel);

	}

	// 유저들의 진행시간, 레벨 정보 출력
	public static void playInfo() {
		System.out.println("==============게임 진행 시간과 현재 레벨==============");
		for (Diablo diablo : userList) {
			System.out.println(diablo.getUserName() + "님의 레벨: " + diablo.diabloLevel + ", 총 경험치: " + diablo.diabloExp);
		}
	}
}
