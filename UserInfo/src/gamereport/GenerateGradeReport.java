package gamereport;

import java.util.ArrayList;

import game.*;
import grade.*;

public class GenerateGradeReport {
	Game game = Game.getInstance(); // school 싱글톤 객체 생성

	public static final String TITLE = "유저 랭킹 \t\t\n";
	public static final String HEADER = "아이디 | 직업 | 무기정보 | 랭킹       \n";
	public static final String LINE = "--------------------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();

	// 헤더, 몸통, 푸터를 합쳐주는 메소드
	public String getReport() {
		// 유저가 보유중인 무기 리스트를 불러온다.
		ArrayList<Weapon> weaponList = game.getWeaponList();

		// 유저가 보유중인 무기를 하나씩 가져온다.
		for (Weapon weapon : weaponList) {
			makeHeader(weapon);
			makeBody(weapon);
			makeFooter();
		}

		return buffer.toString(); // StringBuffer => String 타입으로 변경해준다.
	}

	// 헤더를 만들어주는 메소드
	public void makeHeader(Weapon weapon) {
		// str += GenerateGradeReport.LINE;
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + weapon.getWeaponName()); // 무기명
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}

	// 몸통을 만들어주는 메소드
	public void makeBody(Weapon weapon) {
		ArrayList<User> userList = weapon.getUserList();
		ArrayList<User> weaponList = weapon.getUserList();

		for (User user : userList) {
			buffer.append(user.getUserId()); // 유저이름
			buffer.append(" | ");
			buffer.append(user.getJob()); // 유저직업
			buffer.append(" | ");
			buffer.append(user.getOffensePowerList());
//				buffer.append(" | ");
//				buffer.append(user.getMajorSubject().getSubjectName()); // 학생 필수과목
//				buffer.append(" | ");

			// 유저별 보유중인 무기의 공격력, 등급 계산
			getOffensePowerGrade(user, weapon.getWeaponLevel());
			buffer.append("\n");
			buffer.append(GenerateGradeReport.LINE);
		}
		
	}

	// 유저의 공격력과
	public void getOffensePowerGrade(User user, int weaponLevel) {
		// 유저가 보유한 무기의 공격력 리스트
		ArrayList<OffensePower> OffensePowerList = user.getOffensePowerList();

//			// 해당 유저의 필수과목 코드를 가져온다.
//			int majorId = student.getMajorSubject().getSubjectId(); // ★이해

		// GradeEvaluation gradeEvaluation1 = new MajorEvaluation();
		// GradeEvaluation gradeEvaluation2 = new BasicEvaluation();

		// GradeEvaluation 타입의 배열에 BasicEvaluation객체와 MajorEvaluation객체를 저장한다.
		StatsEvaluation[] statsEvaluation = { new Stats() }; // ★이해

		for (OffensePower offensePower : OffensePowerList) {
			// 공격력에 해당하는 무기의 무기레벨를 얻어온다.
			if (offensePower.getWeapon().getWeaponLevel() == weaponLevel) {
				String grade;
				grade = statsEvaluation[0].getGrade(offensePower.getWeaponLevel());

				buffer.append(" | ");
			}
		}

	}

	// 푸터를 만들어주는 메소드
	public void makeFooter() {
		buffer.append("\n"); // 줄바꿈
	}
}
