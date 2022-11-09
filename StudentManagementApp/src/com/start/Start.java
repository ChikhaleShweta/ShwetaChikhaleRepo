package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Hello world");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to disply student");
			System.out.println("Press 4 to exit app");
			int choice = Integer.parseInt(br.readLine());

			if (choice == 1) {
				// Add student
			}
			else if (choice == 2) {
				// delete student
			}
			else if (choice == 3) {
				// display student

			}
			else if (choice == 4) {
				// exit app

			}
			System.out.println("Thanks for using Student management systems");

		}
	}

}
