package com.tyss.constructorthis.test;

public class Demo {
	public Demo() {
		this(7);
		System.out.println("Default constructor");
	}

	public Demo(int i) {
		this(2,3.24);
		System.out.println("Single parameter " + i);
	}
	public Demo(int x , double y) {
		System.out.println("Two parameter " + x +" "+ y);
	}
}
