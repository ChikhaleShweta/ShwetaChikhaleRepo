package com.junit.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	
	//Value Source
	@ParameterizedTest(name="{index} -Run with the args = {0}")
	@ValueSource(ints= {1,5,3,7})
	public void valueSourceTest(int args) {
		System.out.println(args);
	}
	
	
	
	//enum Source
	enum Tv{
		LG,Samsung,Toshiba;
	}
	@ParameterizedTest
	@EnumSource(Tv.class)
	 public void enumSourceTest(Tv tv) {
		System.out.println(tv);
	}
	
	
	
	//method Source
	private static String[] cars() {
		return new String[] {"Maruti","Swift","Honda"};
	}
	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars) {
		System.out.println(cars);
	}
	
	
	
	//Csv Source
	@ParameterizedTest
	@CsvSource({"shweta","nikhil","pallavi","rani"})
	public void csvSourceTest(String name) {
		System.out.println(name);
	}
	

}
