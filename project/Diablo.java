package project;

public class Diablo {
	// 필드
	protected int userID;// 유저 아이디
	protected String userName;// 유저이름
	protected String userGrade;// 유저등급
	protected int diabloLevel; // 캐릭터레벨
	protected int diabloExp; // 캐릭터경험치
	double bonusRatio;// 보너스경험치비율
	protected int nowLevel; // 현재 레벨
	
	// 생성자
	public Diablo() {
		initUser();
	}

	public Diablo(int userID, String userName) {
		this.userID = userID;
		this.userName = userName;
		initUser();
	}

	// 메소드
	// 캐릭터 레벨 초기화
	private void initUser() {
		userGrade = "SILVER";
		diabloLevel = 0;
		diabloExp = 0;
		bonusRatio = 0;
	}

	// 유저정보 출력 메소드
	public String userInfo() {
		return userName + "님의 등급: " + userGrade + ", 경험치 보너스 비율: " + bonusRatio;
	}

	// 경험치 계산, 레벨 리턴
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

	// getter setter
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGrade() {
		return userGrade;
	}

	public void setUserGrade(String userGrade) {
		this.userGrade = userGrade;
	}

}
