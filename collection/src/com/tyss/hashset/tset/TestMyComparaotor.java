package com.tyss.hashset.tset;

import java.util.TreeSet;
k
public class TestMyComparaotor {
   public static void main(String[] args) {
	TreeSet<Integer> x =new TreeSet<Integer>(new MyComparator<>());
	   x.add(2);
	   x.add(68);
	   x.add(98);
	   x.add(64);
	   x.add(35);
	   System.out.println(x);
	  
	}
}
