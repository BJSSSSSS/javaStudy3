

package com.byeon.s2.constructor;

public class Car {

	String brand;
	public static String company = "Kia";
	String color;
	int cc;
	
	//생성자 특수한 메서드
	public Car() {
		
		this("k9"); // 자기자신의 또다른 생성자 호출!
//		this.company = "Kia";
//		this.brand = "k9";
//		this.color = "black";
//		this.cc = 5000;
		
		System.out.println();
	}
	
	public Car(String brand) {
		this(brand, "orange");
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = "black";
//		this.cc = 5000;
		System.out.println();
	}
	
	//생성자
	public Car(String brand, String color) {
		this(brand, color, 4000); //코드가 줄어드는 효과를 볼 수 있다
//		this.company = "Kia";
//		this.brand = brand;
//		this.color = color;
//		this.cc = 5000;
		System.out.println();
	}
	
	public Car(String brand, String color, int cc) {
		
		this.brand = brand;
		this.color = color;
		this.cc = cc;
		System.out.println();
		
	}
	
	
	//멤버메서드
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(Car.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);
		
	}
	
}

