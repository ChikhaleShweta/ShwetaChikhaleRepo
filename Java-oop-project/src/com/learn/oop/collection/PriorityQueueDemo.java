package com.learn.oop.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> customers=new PriorityQueue<>();
		customers.add("shweta");
		customers.add("pallavi");
		customers.add("rani");
		
		System.out.println("Lead is "+customers.peek());
		//System.out.println("Lead is "+customers.poll());
		

		Iterator itr=customers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
