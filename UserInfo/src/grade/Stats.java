package grade;

public class Stats implements StatsEvaluation {

	// 공격력 등급 구하는 메소드
	@Override
	public String getGrade(int offensepoint) {
		String grade;

		// 공격력 등급 산출 구현
		if (offensepoint >= 400000 && offensepoint <= 500000)
			grade = "S";
		else if (offensepoint >= 300000 && offensepoint <= 390000)
			grade = "A";
		else if (offensepoint >= 200000 && offensepoint <= 290000)
			grade = "B";
		else if (offensepoint >= 100000 && offensepoint <= 190000)
			grade = "C";
		else if (offensepoint >= 10000 && offensepoint <= 90000)
			grade = "D";
		else
			grade = "F";

		return grade;
	}

}
