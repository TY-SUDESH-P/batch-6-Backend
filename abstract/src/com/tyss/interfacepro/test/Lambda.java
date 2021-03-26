package com.tyss.interfacepro.test;

public class Lambda {
	public static void main(String[] args) {
		Food f =()->{
			System.out.println("eating");
		};
		f.Eat();
	}

}
