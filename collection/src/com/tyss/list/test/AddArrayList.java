package com.tyss.list.test;

import java.util.ArrayList;
import java.util.Iterator;

public class AddArrayList implements Iterable {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();

		array.add(20);
		array.add(10);
		array.add(15);
		array.add(28);

		array.add(null);
		// array.add(28);
		// array.add("sp"); //
		System.out.println(array);
		 int size = array.size();
		 for (int i = 0; i < array.size(); i++) {
		 System.out.println("for loop " +i +" " + array.get(i));
		 }
		
		 for (Object list : array) {
		 System.out.println(list);
		 }
		
//		 Iterator<E> itr= array.iterator();
//		 for(Integer integer : array) {
//		 System.out.println(integer);
//		 }
//
//		private class Itr<E> implements Iterators<E> {
//			private int index;
//
//			public boolean hasNext() {
//
//				return (index < size) ? true : false;
//			}
//
//			public E next() {
//				E[] elementData;
//				E e = (E) elementData[index];
//				index++;
//				return e;
//
//			}
//
//		}
//
	}

	// @Override
	// public Iterator<?> iterator() {
	// // TODO Auto-generated method stub
	//
	// }

}
