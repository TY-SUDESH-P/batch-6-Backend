package com.tyss.handlingex.test;

public class NestedTry {
	public static void main(String[] args) {
//		int a[] = { 2, 3, 4, 5 };
		System.out.println("s1");
		try {
			System.out.println((10 / 5));
			try {
				System.out.println((10 / 0));
			} catch (ArithmeticException e) {
				// TODO:handle exception
				System.out.println("ArithmeticException");
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		System.out.println("rest of the code flows");
	}
}
