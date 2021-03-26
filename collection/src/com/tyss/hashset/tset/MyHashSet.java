package com.tyss.hashset.tset;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(16);
		hashSet.add(35);
		hashSet.add(98);
		hashSet.add(10);
		System.out.println(hashSet);
		System.out.println(	hashSet.add(10));
	}
}
