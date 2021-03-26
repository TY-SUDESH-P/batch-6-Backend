package com.tyss.interfacepro.test;

public class SimpleCalculator extends NormalCalculator {

	@Override
	public void multiply() {
		System.out.println("mult");
	}

	@Override
	public void divide() {
		System.out.println("div");
	}

}
