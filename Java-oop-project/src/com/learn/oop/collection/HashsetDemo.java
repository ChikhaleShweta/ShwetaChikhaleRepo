package com.learn.oop.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("shweta");
		set.add("pallavi");
		set.add("rani");
		set.add("siya");
		
		set.remove("siya");
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
