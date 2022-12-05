package java_modeling.ch01.asso3;

import java.util.Vector;

public class Course {
	//필드
	private String name; //과목명
	private Vector<Transcript> transcripts;
	
	//생성자
	public Course(String name) {
		//main에서 Course객체를 생성하면
		//-> Vector 객체가 생성
		this.name = name;
		transcripts = new Vector<Transcript>();
	}
	
	//메소드
	//과목명
	public String getName() {
		return name;
	} 
	
	//수강리스트에 추가
	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript); //.add() 추가
	}
}
