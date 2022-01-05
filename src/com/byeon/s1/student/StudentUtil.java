

package com.byeon.s1.student;

import java.util.Scanner;

public class StudentUtil {

	//학생 객체를 생성하고 정보를 입력 받는 곳
	//입력 전용
	
	public Student search(Student [] students) {
		//검색할 학생의 번호를 입력
		//입력 받은 번호와 일치하는 학생을 찾아서
		//리턴
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 학생의 번호를 입력하시오 : ");
		int stuNum = sc.nextInt();
		Student stu = null;
		
		for(int i = 0; i<students.length; i++) {
			if(stuNum == students[i].num) {
				stu = students[i];
				break;
			}
		}
		return stu;
	}
	
	
	

	
	public Student [] makeStudents() { // 뭐든지 리턴타입으로 가능! 생성 배열도 리턴타입
		//학생의 수 입력
		//키보드로부터 이름, 번호, 국어, 영어, 수학 입력 리턴
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 수를 입력하시오 : ");
		int num = sc.nextInt();
		Student [] students = new Student[num];

		for(int i=0; i<students.length; i++) {
			
			Student stu = new Student();
			
			System.out.println("이름을 입력하세요 : ");
			stu.name = sc.next();
			System.out.println("번호를 입력하세요 : ");
			stu.num = sc.nextInt();
			System.out.println("국어점수를 입력하세요 : ");
			stu.kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요 : ");
			stu.eng = sc.nextInt();
			System.out.println("수학점수를 입력하세요 : ");
			stu.math = sc.nextInt();
			
			students[i] = stu;
			
		}
	
		return students;
	}
	

	
	public Student makeStudent() {
		
		//키보드로부터 이름, 번호, 국어, 영어, 수학 입력 리턴
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.println("이름을 입력하세요 : ");
		stu.name = sc.next();
		System.out.println("번호를 입력하세요 : ");
		stu.num = sc.nextInt();
		System.out.println("국어점수를 입력하세요 : ");
		stu.kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요 : ");
		stu.eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요 : ");
		stu.math = sc.nextInt();
		
		//1. 배열 - 같은 데이터타입(X)
		//2. class 
		
		return stu;
		
	}
	

}








