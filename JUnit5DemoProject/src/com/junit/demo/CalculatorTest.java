package com.junit.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	@DisplayName("Adding two numbers")
	public void testAddMethod() {
		Calculator c=new Calculator();
		int sum=c.add(10,10);
		assertEquals(20, sum);
		System.out.println("The summation is "+sum);
	}
	@Test
	public void testSubMethod() {
		Calculator c=new Calculator();
		int sub=c.sub(50,10);
		assertEquals(40, sub);
		System.out.println("The substraction is "+sub);
	}
	@Test
	public void testProductMethod() {
		Calculator c=new Calculator();
		int product=c.product(10,100);
		assertEquals(1000, product);
		System.out.println("The product is "+product);
	}

}
