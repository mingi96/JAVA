package java_modeling.ch01.asso;

import java.util.ArrayList;

public class Student {
	private String name;
	
	//단방향 관계 => 학생은 자기가 수강하는 과목을 알고있다.
	private ArrayList<Course> courses;
	
	//생성자
	public Student(String name) {
		this.name = name;
		courses = new ArrayList<>();
	}
	
	//수강신청
	public void registerCourse() {}
	
	//수강취소
	public void dropCourse() {}
}
