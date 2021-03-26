package com.tyss.interfacepro.test;

public interface Job {
        public void display();
        
         default void show() {
        	System.out.println();
		}
         
}
