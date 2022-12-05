package java_modeling.ch01.asso3;

import java.util.Vector;

public class Student {
	//필드
	private String name; //학생이름
	//Vector<> 객체를 배열에 저장
	private Vector<Transcript> transcripts; //수강신청 리스트

	
	//생성자
	public Student(String name) {
		this.name = name;
		//main에서 Student객체를 생성하면
		//-> Vector 객체가 생성
		transcripts = new Vector<Transcript>();
	}
	
	public String getName() {
		return name;
	}

	//메소드 
	//수강신청리스트에 추가
	public void addTranscript(Transcript transcript) {
		//transcripts에 저장
		transcripts.add(transcript);
	}
}
