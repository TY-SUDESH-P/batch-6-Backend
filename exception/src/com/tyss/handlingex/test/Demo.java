package com.tyss.handlingex.test;

public class Demo {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		try {
			System.out.println("s1");
			System.out.println(a[6]);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("s2");
		System.out.println("s3");
	}
}
