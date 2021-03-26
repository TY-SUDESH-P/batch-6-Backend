package com.tyss.methodoverloading.test;

public class Son  extends Father{
 public void Bike(){
	 System.out.println("new bike");
 }
 public static void main(String[] args) {
//	Father f= new Father();
//	f.Bike();
//	Son s=new Son();
//	s.bike();
//	System.out.println("after modification");
	 Father f = new Son();
	 f.Bike();
}
 
}
