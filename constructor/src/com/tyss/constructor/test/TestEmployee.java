package com.tyss.constructor.test;

public class TestEmployee {
   public static void main(String[] args) {
//	Employee emp =new Employee();
//	emp.id=102;
//	emp.name="sudesh";
//	emp.email ="syds@gmail.com";
//	
//	System.out.println(emp.id);
//	System.out.println(emp.name);
//	System.out.println(emp.email);
//
//	Employee emp1 =new Employee();
//	emp1.id=103;
//	emp1.name="suresh";
//	emp1.email ="srds@gmail.com";
//	
//	System.out.println(emp1.id);
//	System.out.println(emp1.name);
//	System.out.println(emp1.email);
	   
	Employee emp= new Employee(101,"sudesh","sudesh@gmail.com");
	System.out.println(emp.id);
	System.out.println(emp.name);
	System.out.println(emp.email);
	
	Employee emp1= new Employee(103,"suresh","suresh@gmail.com");
	System.out.println(emp1.id);    
	System.out.println(emp1.name);
	System.out.println(emp1.email);
}
}

