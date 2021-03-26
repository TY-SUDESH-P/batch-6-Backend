package com.tyss.constructor.test;

public class Demo {
   Demo() {
	   System.out.println("defaut constructor");
   }
   Demo(int x) {
	   System.out.println("single arg constructor" + x);
   }
   Demo(double x,int y) {
	   System.out.println("double arg constructor" + x + "" + y);
   }
} // End Of The Class
