

package com.byeon.s1.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentView sv = new StudentView(); //stack 영역에 sv가 만들어지고 sv는 주소다, 
											//sv에 StudentView라는 객체를 heap영역에 생성해서 넣는다!
		
		
		
//		Student st = new Student(); //주소를 만든다고 생각하면 진짜 편하다
//		
//		st.name = "홍길동";
//		st.num = 32;
//		st.kor = 70;
//		st.eng = 80;
//		st.math = 90;
//		
//		sv.viewStudent(st); //그래서 이 주소를 viewStudent 메서드에서 꺼내쓸께! 이런 느낌인것임!
		
		System.out.println("학생수를 입력하시오 : ");
		int num = sc.nextInt();
		Student [] students = new Student[num];
		
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
			System.out.println((i+1) +"번째 학생의 이름을 입력하시오 : ");
			student.name = sc.next();
			System.out.println((i+1) +"번째 학생의 번호를 입력하시오 : ");
			student.num = sc.nextInt();
			System.out.println((i+1) +"번째 학생의 국어점수를 입력하시오 : ");
			student.kor = sc.nextInt();
			System.out.println((i+1) +"번째 학생의 영어점수를 입력하시오 : ");
			student.eng = sc.nextInt();
			System.out.println((i+1) +"번째 학생의 수학점수를 입력하시오 : ");
			student.math = sc.nextInt();
			
			students[i] = student;
		}
		
		//전체출력
		//sv.viewStudents(students);
		
		//번호검색
		StudentUtil su = new StudentUtil();
		su.search(students);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

		// makeStudent 호출
		// 이름, 번호, 국어, 영어, 수학

//		StudentUtil su = new StudentUtil();
//		
//		Student student = su.makeStudent();
//		
//		System.out.println("이름 : " + student.name);
//		System.out.println("번호 : " + student.num);
//		System.out.println("국어 점수 : " + student.kor);
//		System.out.println("영어 점수 : " + student.eng);
//		System.out.println("수학 점수 : " + student.math);
//		
		
		// makeStudent 호출
		// 이름, 번호, 국어, 영어, 수학

//		StudentUtil su1 = new StudentUtil();
//		
//		Student [] students = su1.makeStudents();
//		
//		for(int i=0; i<students.length; i++) {
//		
////			Student student = students[i] - 이렇게도 가능
//			System.out.println("이름 : " + students[i].name);
//			System.out.println("번호 : " + students[i].num);
//			System.out.println("국어 점수 : " + students[i].kor);
//			System.out.println("영어 점수 : " + students[i].eng);
//			System.out.println("수학 점수 : " + students[i].math);
//			System.out.println();
//			
//		}
//		
		
		
	}
 
}



