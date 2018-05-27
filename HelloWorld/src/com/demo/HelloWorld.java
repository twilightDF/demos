package com.demo;

public class HelloWorld {

	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			sayHello("defeng");
		}
		
		sayHello("good bye");
	}
	
	private static void sayHello(String name) {
		System.out.println("Hello World " + name);
	}

}
