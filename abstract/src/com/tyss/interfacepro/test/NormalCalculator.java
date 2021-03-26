package com.tyss.interfacepro.test;

public abstract class NormalCalculator implements Calculator {

	@Override
	public void add() {
       System.out.println("addition");		
	}

	@Override
	public void sub() {
		System.out.println("subtraction");	
		
	}

	@Override
	public abstract void multiply() ;
//	{
//		System.out.println("multiplication");	
//		
//	}

	@Override
	public abstract void divide() ;
//	{
//		System.out.println("division");	
//		
//	}
    
	
}
