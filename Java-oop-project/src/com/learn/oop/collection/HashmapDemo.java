package com.learn.oop.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.filechooser.FileNameExtensionFilter;

public class HashmapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> names=new HashMap<>();
		
		names.put(1, "shweta");
		names.put(2, "pallavi");
		names.put(3, "rani");
		
		//names.remove(3);
		names.remove(2, "pallavi");
		
		System.out.println(names);
		
		Set s=names.keySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			int i=(int) itr.next();
			System.out.println(i);
			System.out.println(names.get(i));
		}

	}

}
