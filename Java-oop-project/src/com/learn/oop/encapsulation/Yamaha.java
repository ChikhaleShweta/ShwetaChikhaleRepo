package com.learn.oop.encapsulation;

public class Yamaha {

	public static void main(String[] args) {
		//we are creating an object of encapsulated intances
	Bike bike=new Bike();
	bike.setName("Yamaha FZ");
	bike.setCc(150);
	bike.setColor("Blue");
	bike.setPrice(150000);
	
	System.out.println(bike.getName()+","+bike.getColor()+","+bike.getPrice());
	}

}
