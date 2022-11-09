package com.learn.oop.abstraction;

public class ShwetaTech implements ITCompanies{


	@Override
	public void working() {
		System.out.println("ShwetaTech is working on java project");
		
	}
	

	public static void main(String[] args) {
		ShwetaTech shwetaTech=new ShwetaTech();
		shwetaTech.working();

	}

}
