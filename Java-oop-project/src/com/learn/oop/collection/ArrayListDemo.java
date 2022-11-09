package com.learn.oop.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
	ArrayList<String> participantList=new ArrayList<>();
	participantList.add("shweta");
	participantList.add("nikhil");
	participantList.add("pallavi");
	participantList.add("rani");
	//participantList.add(1, "siya");
	
	participantList.remove(1);
	participantList.remove("rani");
	participantList.removeAll(participantList);

	
	Iterator itr=participantList.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
	}
	
	System.out.println("data updated");

	}

}
