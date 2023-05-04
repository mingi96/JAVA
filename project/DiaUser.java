package project;

public class DiaUser extends Diablo {
	// 생성자
	public DiaUser(int userID, String userName) {
		super(userID, userName);

		super.userGrade = "DIAMOND";
		super.bonusRatio = 0.5;
	}

	@Override
	public int calcExp(int hour) {
		// 1. 경험치를 쌓는다
		for (int i = 0; i < hour; i++) {
			diabloExp += (int) (hour * (100 + (100 * bonusRatio)));
		}

		// 2. 레벨을 리턴
		if (diabloExp > 2000) {
			diabloLevel = 20;
		} else if (diabloExp > 1500) {
			diabloLevel = 15;
		} else if (diabloExp > 1000) {
			diabloLevel = 10;
		} else if (diabloExp > 500) {
			diabloLevel = 5;
		} else if (diabloExp > 300) {
			diabloLevel = 3;
		}
		return hour;
	}

}
