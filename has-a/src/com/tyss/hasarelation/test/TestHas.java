package com.tyss.hasarelation.test;

public class TestHas {
	public static void main(String[] args) {
		Address	a=new Address(101, 2565760,"katruguppe", "bengaluru");
		Employee e = new Employee(102, "sudesh", a);

		System.out.println(e.eid);
	}
}
