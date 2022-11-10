package com.junit.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testMethod() {
		Calculator c=new Calculator();
		int sum=c.add(10, 100);
		System.out.println("The total is"+sum);
	}

}
