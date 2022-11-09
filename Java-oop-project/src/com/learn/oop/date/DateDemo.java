package com.learn.oop.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateDemo {

	public static void main(String[] args) {
	LocalDate localDate=LocalDate.now();
	LocalDate yesterday=localDate.minusDays(1);
	LocalDate tommorrow=localDate.plusDays(1);
	LocalTime time=LocalTime.now();
	
	System.out.println("Todays Date: "+localDate);
	System.out.println("Yesterdays Date: "+yesterday);
	System.out.println("Tommorrows date: "+tommorrow);
	System.out.println(time);

	}

}
