package com.tyss.maps.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
	HashMap<String, Integer> map=	new HashMap<String,Integer>();
	map.put("ID",102 );
	map.put("Roll",10252 );
	map.put("CardID",102 );

	 System.out.println(map);
	 
	 Set<String> s=map.keySet();
	 System.out.println(s);
	 
	 int id=map.get("ID");
	 System.out.println(id);
	 
	 Iterator<String> iterator = s.iterator();
		while(iterator.hasNext()){
			String lst =(String) iterator.next();
			System.out.println(lst);
		}
	 
	
	}
}
