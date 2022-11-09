package com.learn.oop.exception;

public class Eligibility {

	public static void eligible(Integer exp) {
	if(exp<=10) {
		throw new ArithmeticException("This person is not eligible to be a Senior Architech");
		
	}else {
		System.out.println("This person is eligible");
	}

	}
	public static void main(String[] args) {
		eligible(11);
	}

}
