package com.junit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BeforeAndAfterTest {
	Calculator c;
	
	@BeforeEach
	public void init() {
		c=new Calculator();
		System.out.println("Before each method is being called right now");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("after each method is  called ");
	}

	@Test
	@DisplayName("Adding two numbers")
	public void testAddMethod() {
		
		int sum=c.add(10,10);
		assertEquals(20, sum);
		System.out.println("The summation is "+sum);
	}
	@Test
	public void testSubMethod() {
	
		int sub=c.sub(50,10);
		assertEquals(40, sub);
		System.out.println("The substraction is "+sub);
	}
	@Test
	public void testProductMethod() {
		
		int product=c.product(10,100);
		assertEquals(1000, product);
		System.out.println("The product is "+product);
	}

}
