

package com.byeon.s2.constructor;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		
		Car.company = "BMW";
		
		//변수 선언 = new 생성자호출
		Car car = new Car(); //값을 강제로 넣게 하기위해 기본생성자를 지워버리는 경우도 있다
//		car.brand = "k7";
//		car.company = "kia";
//		car.cc = 2000;

		car.info();
		//car.Car(); error!!!
		
		Car car2 = new Car("k5");
		car2.info();
		
		Car car3 = new Car("k3", "red");
		car3.info();
		
		Car car4 = new Car("sorrento", "white", 2000);
		car4.info();
		
		Car car5 = new Car("k9", "Yello", 5000);
		car5.info();
		
		
	}

}


