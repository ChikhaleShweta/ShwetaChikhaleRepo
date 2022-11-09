package com.learn.oop.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("shweta");
	list.add("nikhil");
	list.add("pallavi");
	list.add("rani");
	list.removeFirst();
	list.removeLast();
	list.removeAll(list);
	
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("data updated");

	}

}
