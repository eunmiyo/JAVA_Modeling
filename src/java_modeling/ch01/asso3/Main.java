package java_modeling.ch01.asso3;

public class Main {

	public static void main(String[] args) {
		//학생두명생성
		Student s1 = new Student("eunmi");
		Student s2 = new Student("siru");
		
		//과목두개생성
		Course jv = new Course("JAVA");
		Course dp = new Course("Design Pattern");
		
		//수강신청생성
		Transcript t1 = new Transcript(s1, jv); //은미는 자바 수강신청
		Transcript t2 = new Transcript(s1, dp); //은미는 디자인패턴 수강신청
		Transcript t3 = new Transcript(s2, dp); //사여는 디자인패턴 수강신청
		
		//은미의 2022년 자바 성적은 B0
		t1.setDate("2022");
		t1.setGrade("B0");
		
		//은미의 2022년 디자인패턴 성적은 D+
		t2.setDate("2022");
		t2.setGrade("D+");
		
		//사여는 2023년 디자인패턴 성적은 C+
		t3.setDate("2023");
		t3.setGrade("C+");
		
		System.out.println(s1.getName() + "의 " + t1.getDate() + "년 " + jv.getName() + " 성적은 " + t1.getGrade());
		System.out.println(t2.getStudent().getName() + "의 " + t2.getDate() + "년 " + t2.getCourse().getName() + " 성적은 " + t2.getGrade());
		System.out.println(t3.getStudent().getName() + "의 " + t3.getDate() + "년 " + t3.getCourse().getName() + " 성적은 " + t3.getGrade());
	}

}
