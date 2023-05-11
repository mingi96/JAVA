package application;

import game.*;
import gamereport.GenerateGradeReport;

public class UserInfoApplication {
	Game ezenGame = Game.getInstance(); // 게임 생성
	Weapon sword; //검
	Weapon bow; //활
	Weapon gun; //총
	Weapon wand; //지팡이
	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) {
		UserInfoApplication test = new UserInfoApplication();
		test.createWeapon(); //무기 생성
		test.createUser();// 유저 생성
		
		String report = test.gradeReport.getReport(); //무기별 합산 결과 생성
		System.out.println(report);
	}
	
	//무기 생성
	public void createWeapon() {
		sword = new Weapon("SWORD",17); // 검 생성
		bow = new Weapon("BOW", 21); // 활 생성
		gun = new Weapon("GUN", 25); // 총 생성
		wand = new Weapon("WAND", 18); // 지팡이 생성
		
		//게임에 무기를 넣어준다.
		ezenGame.addWeapon(sword);
		ezenGame.addWeapon(bow);
		ezenGame.addWeapon(gun);
		ezenGame.addWeapon(wand);
	}
	
	//유저 생성
	public void createUser() {
		//유저 생성
		User user1 = new User("Warrior", "전사");
		User user2 = new User("Hunter", "사냥꾼");
		User user3 = new User("Gunner", "거너");
		User user4 = new User("Wizard", "마법사");
		User user5 = new User("Wizard", "마법사");

		//게임에 등록
		ezenGame.addUser(user1);
		ezenGame.addUser(user2);
		ezenGame.addUser(user3);
		ezenGame.addUser(user4);
		ezenGame.addUser(user5);
		
		//무기등록
		sword.register(user1);
		
		bow.register(user2);
		
		gun.register(user3);
		
		wand.register(user4);
		wand.register(user5);
		
		//유저의 무기별 공격력 추가
		addOffensePowerForUser(user1, sword, 17);
		
		addOffensePowerForUser(user2, bow, 21);
		
		addOffensePowerForUser(user3, gun, 25);
		
		addOffensePowerForUser(user4, wand, 18);

		addOffensePowerForUser(user5, wand, 19);
	}
	
	//유저마다 무기별 공격력 추가, 유저의 공격력 등록하는 메소드
	public void addOffensePowerForUser(User user, Weapon weapon, int weaponLevel) {
		OffensePower offensePower = new OffensePower(user.getUserId(), weapon, weaponLevel);
		user.addWeaponOffensePower(offensePower);
	}

}
