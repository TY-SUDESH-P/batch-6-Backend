package com.tyss.handlingex.test;

public class TestOne {
	public static void stuff() throws Exception {
		System.out.println(10 / 0);
	}

	public static void stuff1() throws Exception {
		System.out.println("inside stuff1()");
		stuff();
	}

	public static void stuff2() throws Exception {
		System.out.println("inside stuff2()");
		stuff1();
	}

	public static void main(String[] args) throws Exception {
		try {
			stuff2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//			e.printStackTrace();
			//			System.out.println(e.toString());
		}

	}
}
