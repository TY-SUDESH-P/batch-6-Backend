package com.tyss.list.test;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(125);
		list.add(5);
		list.add(525);
		list.add(125);
		list.addFirst(555);
		list.addLast(9654);	
		System.out.println(list);
		
		
		Iterator<Integer > it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
