package com.learn.oop;

public class Customer {// Method Overloading and Overriding(Customer+Sales)

	Integer baseSalary = 50000;

	void TotalSalry(Integer bs, Integer bonus) {//Method overloading
		Integer total = bs + bonus;
		System.out.println(total);
	}

	void TotalSalry(Integer bs, Integer bonus, Integer incentive) {
		Integer total = bs + bonus + incentive;
		System.out.println(total);
	}

	void working() {//Method overriding
		System.out.println("Employee is working ");
	}
}
