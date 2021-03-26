package com.tyss.interfacepro.test;

public class ShapeImplw {
	public static void main(String[] args) {
		Food f=new Food() {

			@Override
			public void Eat() {
				System.out.println("eating");				
			}
		};
		f.Eat();
	}


}
