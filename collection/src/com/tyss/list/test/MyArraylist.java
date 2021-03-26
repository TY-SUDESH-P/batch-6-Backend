package com.tyss.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public abstract class MyArraylist<T> implements Iterable<T> {
	public static <E> void main(String[] args) {
		ArrayList<String> cars = new ArrayList();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Mazda");
		System.out.println(cars);

		// Biter cars.iterator();
//		cars.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
//
//		
//		  for (String string : cars) {
//			
//		}
		class OverIterator{
			 
		 }
	}
}
