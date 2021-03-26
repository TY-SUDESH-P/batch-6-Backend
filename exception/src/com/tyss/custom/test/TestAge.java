package com.tyss.custom.test;

public class TestAge  {
 public void aged(int age) throws InvalidAge {
	 if(age<18){
		 throw new InvalidAge("Below 18");
	 }else{
		 System.out.println("welcome to cast vote");
	 }
 }
}
