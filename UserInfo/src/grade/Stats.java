package grade;

public class Stats implements StatsEvaluation {

	// 공격력 등급 구하는 메소드
	@Override
	public String getGrade(int offensepoint) {
		String grade;

		// 공격력 등급 산출 구현
		if (offensepoint >= 400000 && offensepoint <= 500000)
			grade = "고대";
		else if (offensepoint >= 300000 && offensepoint <= 390000)
			grade = "유물";
		else if (offensepoint >= 200000 && offensepoint <= 290000)
			grade = "전설";
		else if (offensepoint >= 100000 && offensepoint <= 190000)
			grade = "영웅";
		else if (offensepoint >= 10000 && offensepoint <= 90000)
			grade = "희귀";
		else
			grade = "일반";

		return grade;
	}

}
