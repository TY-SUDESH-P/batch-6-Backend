package com.tyss.handlingex.test;

public class DemoOne {
	public static void main(String[] args) {
		// int a[] = { 2, 3, 4, 5 };
		System.out.println("s1");
		try {
			System.out.println(10 / 0);
			try {

			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				System.out.println("finally");
			}
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.exit(0);
		} catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("bound exception");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundException");

		}

		System.out.println("rest of the code flows");
	}
}
