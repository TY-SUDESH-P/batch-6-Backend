package com.tyss.interfacepro.test;

public class Demo implements Game,Office {

	@Override
	public void working() {
		System.out.println("working");		
	}

	@Override
	public void playing() {
		System.out.println("playing");		
	}

}
