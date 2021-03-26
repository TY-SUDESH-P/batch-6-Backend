package com.tyss.methodover.test;

public class TestDemo {
	public static void main(String[] args) {
		Demo d=new Demo();
		int result=d.addition(1,2);
		System.out.println(result);
		d.addition(2.3,3.6);
		d.addition((byte) 0x3f,(byte) 0x3f );
		d.addition(5.1, 5);
	}
}
