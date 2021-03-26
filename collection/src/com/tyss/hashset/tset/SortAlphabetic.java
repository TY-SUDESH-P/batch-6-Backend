package com.tyss.hashset.tset;

import java.util.Comparator;

public class SortAlphabetic<String> implements Comparator<String> {
	public <T> int compares(T o1, T o2) {
		String i1 =  (String) o1;
		String i2 =  (String) o2;
		
		String character = "o1";    
		int ascii = (int) character;
		
		String character = "o2";    
		int asciis = (int) character;
		
		if (ascii> asciis)
			return +100;
		else if (ascii< asciis)
			return -100;
		else
			return 0;
	}
}
