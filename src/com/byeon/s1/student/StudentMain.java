

package com.byeon.s1.student;

public class StudentMain {

	public static void main(String[] args) {
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

		StudentUtil su1 = new StudentUtil();
		
		Student [] students = su1.makeStudents();
		
		for(int i=0; i<students.length; i++) {
		
//			Student student = students[i] - 이렇게도 가능
			System.out.println("이름 : " + students[i].name);
			System.out.println("번호 : " + students[i].num);
			System.out.println("국어 점수 : " + students[i].kor);
			System.out.println("영어 점수 : " + students[i].eng);
			System.out.println("수학 점수 : " + students[i].math);
			System.out.println();
			
		}
		
		
	}
 
}



