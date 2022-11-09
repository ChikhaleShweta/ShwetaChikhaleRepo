package com.learn.oop;

public class HR extends Employee {

	Integer bonus=25000;
	Integer total=bonus+baseSalary;
	

	public static void main(String[] args) {
	HR hr=new HR();
	System.out.println("Total salary is "+hr.total);

	}

}
