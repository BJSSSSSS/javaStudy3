

package com.byeon.s1.student;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		StudentUtil su = new StudentUtil();
		//su.initUtil(); // 스캐너 메서드 호출했음 
		StudentView sv = new StudentView();
		Student [] students = null;
		
		while(flag) {
			
			System.out.println("1. 학생들의 정보 입력");//util
			System.out.println("2. 학생들의 정보 출력");//view
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프 로 그 램  종료");
			//switch case
			int select = sc.nextInt();

			
			switch(select) {
			
			case 1:
				students = su.makeStudents();
				System.out.println();
				break;
				
			case 2:
				if(students != null) {
					sv.view(students);
				}else {
					sv.view("학생정보를 먼저 입력하세요");
				}
				System.out.println();
				break;
				
			case 3:
				if(students == null) { // 이렇게 if 하나로 끝낼수도 있다!
					sv.view("학생정보를 먼저 입력하세요");
					continue;
				}
				if(students != null) {
					Student student = su.search(students);//이건 그냥 여기서 만들어도 될듯
					if(student != null) {
						sv.view(student);
					}else {
						sv.view("입력하신 학생 정보가 없습니다.");
					}
				}
				System.out.println();
				break;
				
			case 4:
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


