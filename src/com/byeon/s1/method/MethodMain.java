

package com.byeon.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		//1. Main Method
		//	 1) 프로그램 Start와 초기화
		//	 2) Test
		

		System.out.println("MainMethod Start");

		System.out.println("Conflict Test");

		System.out.println("Git-hub Write");

		
		//객체 생성 코드
		//new 클래스명();
		RuturnStudy rs = new RuturnStudy();
		
		//참조변수명.멤버들
		//rs.test1();
		
		//int num = rs.test2();
		//System.out.println(num);
		
//		String name = rs.test3();
//		System.out.println(name);
		
//		double math = Math.random();
//		System.out.println(math);
		
		Scanner sc = rs.test4();
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("age : " + age);
		
		System.out.println("MainMethod Finish");

	}

}












