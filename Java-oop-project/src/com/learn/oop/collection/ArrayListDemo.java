package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList<String> participantList=new ArrayList<>();
	participantList.add("shweta");
	participantList.add("nikhil");
	participantList.add("pallavi");
	participantList.add("rani");
	participantList.add(1, "siya");
	
	Iterator itr=participantList.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	
	System.out.println(participantList);

	}

}
