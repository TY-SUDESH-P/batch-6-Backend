package com.tyss.hashmap.test;

import java.util.HashSet;

public class MyHashSet {
	public static void main(String[] args) {
		HashSet h = new HashSet();

		h.add("Hello");
		h.add("Sudesh");
		h.add("bye");

		System.out.println(h);

		h.remove("sudesh");

		System.out.println("after removing the objecrt " + h);

	}
}
