package com.learn.oop.abstraction;

public class CSK extends IPL{


	@Override
	void play() {
		System.out.println("Csk is playing good in 2021 season");
	}
	public static void main(String[] args) {
		CSK csk=new CSK();
		csk.play();

	}

}
