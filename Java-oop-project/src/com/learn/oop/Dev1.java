package com.learn.oop;

public class Dev1 extends Employee{

	Integer bonus=25000;
	Integer total=bonus+baseSalary;
	

	public static void main(String[] args) {
	Dev1 dev=new Dev1();
	System.out.println("Total salary is "+dev.total);

	}

}
