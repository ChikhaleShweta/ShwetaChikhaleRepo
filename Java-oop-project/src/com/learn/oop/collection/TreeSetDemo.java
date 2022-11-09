package com.learn.oop.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> cars=new TreeSet<>();
		cars.add("honda");
		cars.add("ciaz");
		
		
		
		Iterator itr=cars.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
