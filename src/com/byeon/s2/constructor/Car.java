

package com.byeon.s2.constructor;

public class Car {

	String brand;
	String company;
	String color;
	int cc;
	
	//생성자 특수한 메서드
	public Car() {
		
		this("k9", 4000); // 자기자신의 또다른 생성자 호출!
		
		
//		this.company = "Kia";
//		this.brand = "k9";
//		this.color = "black";
//		this.cc = 5000;
	}
	
	public Car(String brand, int cc) {
		this.company = "Kia";
		this.brand = brand;
		this.color = "black";
		this.cc = cc;
	}
	
	//생성자
	public Car(String brand, String color) {
		this(brand, color, 5000); //코드가 줄어드는 효과를 볼 수 있다
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = color;
//		this.cc = 5000;
	}
	
	public Car(String brand, String color, int cc) {
		this.company = "Kia";
		this.brand = brand;
		this.color = color;
		this.cc = cc;
	}
	
	
	//멤버메서드
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
		
	}
	
}

