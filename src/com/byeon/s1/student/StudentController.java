

package com.byeon.s1.student;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		StudentUtil su = new StudentUtil();
		StudentView sv = new StudentView();
		Student [] students = null;
		
		while(flag) {
			
			System.out.println("1. 학생들의 정보 입력");//util
			System.out.println("2. 학생들의 정보 출력");//view
			System.out.println("3. 프 로 그 램  종료");
			//switch case
			int select = sc.nextInt();

			
			switch(select) {
			
			case 1:
				System.out.println("학생 정보를 입력합니다.");
				System.out.println();
				students = su.makeStudents();
				break;
				
			case 2:
				System.out.println("학생 정보를 출력합니다.");
				System.out.println();
				sv.viewStudents(students);
				break;
				
			case 3:
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
				
			default:
				System.out.println("1 ~ 3번 중 선택 요망.");
				System.out.println();
				break;

			}//switch 끝
			
		}//while 끝
		
	}//main 끝
	
}//class 끝


