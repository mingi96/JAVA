package goodschool;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private Subject majorSubject;
	private static ArrayList<Score> scoreList;
	
	public Student(int studentId, String studentName, Subject majorSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	public static void addSubjectScore(Score score) {
		scoreList.add(score);
	}

}
