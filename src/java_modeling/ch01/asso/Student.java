package java_modeling.ch01.asso;

import java.util.Vector;

public class Student {
	/*
	 * 단방향관계
	 * Student(학생)는 자신이 수강하는 Course(과목)을 알지만
	 * Course(과목)은 자신을 수강하는 Student(학생)의 존재를 모른다.
	 */
	
	//필드
	private String name; //학생이름
	/*
	 * course는 1..* : 1또는 1 이상 이므로 
	 * 배열에 저장해두어야 함
	 * Vector<타입>: Vector배열 저장(ArrayList<>와 비슷)
	 * 몇개가 저장될 지 모르기 때문에 자동으로 크기 조절이 되는 Vector를 씀
	 */
	private Vector<Course> courses; //수강신청한 과목리스트
	
	//생성자
	public Student(String name) {
		this.name = name;
		//과목 개수는 모르지만 수강신청 했을 때 과목을 저장하기 위해 
		courses = new Vector<Course>();
	}
	
	//메소드
	//수강신청
	public void registerCourse(Course course) {
		courses.add(course); //.add(매개변수) 추가
	}
	//수강취소
	public void dropCourse(Course course) {
		courses.remove(course); //.remove(매개변수) 삭제
	}
	
}
