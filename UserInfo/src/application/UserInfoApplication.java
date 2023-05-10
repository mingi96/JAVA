package application;

import StudentInfo.src.application.GenerateGradeReport;

public class UserInfoApplication {
	Game ezenGame = Game.getIntance(); // 게임 생성
	Weapon sword;
	Weapon bow;
	Weapon gun;
	Weapon wand;
	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) {
		UserInfoApplication test = new UserInfoApplication();
		test.createWeapon(); //무기 생성
		test.createUser();// 유저 생성
		
		String report = test.gradeReport.getReport(); // 
	}

}
