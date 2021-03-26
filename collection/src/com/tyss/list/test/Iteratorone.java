package com.tyss.list.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorone {
	public static void main(String[] args) {
		List list =new ArrayList();

		list.add(20);
		list.add(10);
		list.add(15);
		list.add(28);
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println("for loop== " + list.get(i));
		}

		for (Object lists : list) {
              System.out.println(lists);
		}
		Iterator iterator =list.iterator();
		while(iterator.hasNext()){
			Integer lst =(Integer) iterator.next();
			System.out.println(lst);
		}
		
	}

}
