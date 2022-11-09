package com.learn.oop.collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> names=new PriorityQueue<>();
		 names.add("shweta");
		 names.add("pallavi");
		 names.add("rani");
		 
		 names.remove("rani");
		 names.removeAll(names);
		 
		 
		 
		 Iterator itr=names.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("Operation done");
		

	}

}
