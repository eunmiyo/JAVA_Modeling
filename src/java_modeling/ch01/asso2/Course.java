package java_modeling.ch01.asso2;

import java.util.Vector;

public class Course {
	//필드
	private String name; //과목명
	private Vector<Student> students; //수강신청한 학생들
	
	//생성자
	public Course(String name) {
		this.name = name;
		//수강신청한 학생들을 Vector<타입>배열에 저장 
		students = new Vector<Student>();
	}
	
	//메소드
	//과목명
	public String getName() {
		return name;
	}
	
	//수강신청한 학생 추가
	public void addStudent(Student student) {
		students.add(student); //.add() 추가
	}
	
	//수강취소한 학생 삭제
	public void removeStudent(Student student) {
		students.remove(student); //.remove() 삭제
	}
}
