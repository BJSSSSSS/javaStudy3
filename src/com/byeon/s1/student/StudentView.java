

package com.byeon.s1.student;

public class StudentView {

	//출력 전용
	//viewStudents - 여러명의 학생의 모든 정보를 출력
	
	public void viewStudents(Student [] students) {
		
		for(int i = 0; i<students.length; i++) {
			System.out.println((i+1)+"번째 학생의 이름 : " + students[i].name);
			System.out.println((i+1)+"번째 학생의 번호 : " + students[i].num);
			System.out.println((i+1)+"번째 학생의 국어 점수 : " + students[i].kor);
			System.out.println((i+1)+"번째 학생의 영어 점수 : " + students[i].eng);
			System.out.println((i+1)+"번째 학생의 수학 점수 : " + students[i].math);
			System.out.println();
			
		}
		
	}
	

	
	//viewStudent - 학생의 모든 정보를 출력
	
	public void viewStudent(Student st) {
		
		System.out.println("이름 : " + st.name);
		System.out.println("번호 : " + st.num);
		System.out.println("국어 점수 : " + st.kor);
		System.out.println("영어 점수 : " + st.eng);
		System.out.println("수학 점수 : " + st.math);
		
	}
	
	
	public void viewMessage(String message) {
		//문자열 출력
		System.out.println("====================================");
		System.out.println(message);
		System.out.println("====================================");
	}
	
	
}


