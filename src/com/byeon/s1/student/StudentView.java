

package com.byeon.s1.student;

public class StudentView {

	//출력 전용
	//viewStudents - 여러명의 학생의 모든 정보를 출력
	
	public void view(Student [] students) {
		

		for(int i = 0; i<students.length; i++) {
			//Student student = students[i];
			this.view(students[i]);//클래스내 메서드 호출 가능하므로 이런식으로 코드를 줄인다
			
			
//			System.out.println((i+1)+"번째 학생의 이름 : " + students.name);
//			System.out.println((i+1)+"번째 학생의 번호 : " + students.num);
//			System.out.println((i+1)+"번째 학생의 국어 점수 : " + students.kor);
//			System.out.println((i+1)+"번째 학생의 영어 점수 : " + students.eng);
//			System.out.println((i+1)+"번째 학생의 수학 점수 : " + students.math);
//			System.out.println((i+1)+"번째 학생의 점수 평균 : " + students.avg);
//			System.out.println();
//			
		}
		
		
	}
	
	//viewStudent - 학생의 모든 정보를 출력
	
	public void view(Student st) {
		
		System.out.println("이름 : " + st.name);
		System.out.println("번호 : " + st.num);
		System.out.println("국어 점수 : " + st.kor);
		System.out.println("영어 점수 : " + st.eng);
		System.out.println("수학 점수 : " + st.math);
		System.out.println("평균 점수 : " + st.avg);
		System.out.println();
	}
	
	
	public void view(String message) {
		//문자열 출력
		System.out.println("====================================");
		System.out.println(message);
		System.out.println("====================================");
	}
	
	
}


