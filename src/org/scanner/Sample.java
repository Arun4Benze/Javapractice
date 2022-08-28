package org.scanner;

import java.util.Scanner;

public class Sample {
	private static void information() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("Name is " +name);
		System.out.println("Enter your sal");
		float sal = scanner.nextFloat();
		System.out.println("Salary is "+sal);
		System.out.println("enter your id");
		int id = scanner.nextInt();
		System.out.println("Id is "+id);
		
		
		

	}
	public static void main(String[] args) {
		information();
		
		
	}

}
