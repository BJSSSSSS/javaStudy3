

package com.byeon.s1.student;

public class Student {

	//Data 저장 용도
	
	String name;
	int num;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	public void makeTotal() {
		
		//int total = 0;
//		System.out.println("참조변수 this");
//		System.out.println("참조변수 this : " + this);
		//this.total = kor + eng + math; //지역변수와 멤버변수명이 같을때 구분하기 위해서 this를 써준다
		//hello();// this.은 생략가능하다!
		
		//총점계산
		this.total = kor + eng + math;
		
		//평균계산
		this.avg = this.total/3.0;
	}
	
	public void hello() {
		System.out.println("안녕하세요!");
	}
	
}


