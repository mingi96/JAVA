package java_modeling.ch01.asso3;

public class Main {

	public static void main(String[] args) {
		//학생 두명 생성
		Student mingi = new Student("mingi");
		Student gildong = new Student("gildong");
		
		//과목 2개 생성
		Course java = new Course("java");
		Course dp = new Course("Design pattern");
		
		//성적객체생성 => 수강신청도 동시에 발생
		Transcript t1 = new Transcript(mingi, java); //민기는 자바를 수강신청
		Transcript t2 = new Transcript(mingi, dp);
		Transcript t3 = new Transcript(gildong, dp); //길동은 디자인패턴 수강신청
		
		t1.setDate("2023-05-04");
		t1.setGrade("B");
		
		t2.setDate("2023-05-04");
		t2.setGrade("D+");
		
		t2.setDate("2023-05-04");
		t2.setGrade("C+");
	}

}
