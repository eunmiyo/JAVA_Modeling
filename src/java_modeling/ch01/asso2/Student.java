package java_modeling.ch01.asso2;

import java.util.Vector;

public class Student {
	/*
	 * 다대다 관계
	 * 양방향이면서 n:n관계를 지님
	 */
	
	//필드
	private String name; //학생이름
	private Vector<Course> courses; //수강신청한 과목리스트
	
	//생성자
	public Student(String name) {
		this.name = name;
		courses = new Vector<Course>();
	}
	
	//메소드
	//수강신청
	public void registerCourse(Course course) {
		courses.add(course);
	}
	//수강취소
	public void dropCourse(Course course) {
		courses.remove(course);
	}
	
}
