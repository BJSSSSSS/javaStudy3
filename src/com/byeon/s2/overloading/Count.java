

package com.byeon.s2.overloading;

public class Count {

	public void hap(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	public void hap(int num1, double num2) {
		double sum = num1 + num2;
		System.out.println(sum);
	}
	
	public double hap(int num1, double num2, int num3) {
		double sum = num1 + num2 + num3;
		return sum;
	}
}



