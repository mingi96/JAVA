package java_modeling_ch01.asso2;

import java.util.ArrayList;

public class Course {
	//필드
	private String name;
	private ArrayList<Student> students; //양방향 관계
	
	//생성자
	public Course(String name) {
		this.name = name;
		students = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	//수강신청한 학생 추가
	public void addStudent() {}
	
	//수강취소한 학생 제거
	public void removeStudent(Student student) {
		
	}
}
