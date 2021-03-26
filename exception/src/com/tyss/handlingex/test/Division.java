package com.tyss.handlingex.test;

public class Division {
     public static void main(String[] args) {
		try {
			System.out.println("statement 1");
			System.out.println("Division " + (10/0));  // if output is wrong then catch block will gets executed
			System.out.println("statement 2");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("statement 3");
			System.out.println("Division " + (10/2));
			System.out.println("statement 4");
			
		}
	}
}                             