package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> laptops = new LinkedHashSet<String>();
		laptops.add("shweta");
		laptops.add("nikhil");
		
		Iterator itr=laptops.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
