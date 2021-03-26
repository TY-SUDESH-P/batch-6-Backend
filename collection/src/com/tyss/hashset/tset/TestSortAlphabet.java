package com.tyss.hashset.tset;

import java.util.TreeSet;

public class TestSortAlphabet {
	public static void main(String[] args) {
		TreeSet<String> x = new TreeSet<String>(new SortAlphabetic<>());
		x.add("a");
		x.add("C");
		x.add("b");
		x.add("D");
		x.add("c");
		x.add("A");
		x.add("d");
		x.add("B");
	
		System.out.println(x);
	}
}
