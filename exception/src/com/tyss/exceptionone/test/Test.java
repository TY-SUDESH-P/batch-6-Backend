package com.tyss.exceptionone.test;

public class Test {
	public static void stuff() {
		System.out.println(10/0);
	}

	public static void stuff1() {
		System.out.println("inside stuff1()");
		stuff();
	}
 static void stuff2() {
		System.out.println("inside stuff2()");
		stuff1();
	}

	public static void main(String[] args) {
		stuff2();

	}
}
