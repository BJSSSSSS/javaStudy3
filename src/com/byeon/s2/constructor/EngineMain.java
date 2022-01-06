

package com.byeon.s2.constructor;

public class EngineMain {

	public static void main(String[] args) {
		Engine engine = new Engine();
		System.out.println("객체생성후 대입");
		engine.name = "v4";
		engine.fuel = "f4";
		engine.info();

	}

}


