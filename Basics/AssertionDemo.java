package com.kg.demo;

import java.util.Scanner;

public class AssertionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your lucky number..");
		num = scanner.nextInt();
		
		assert(num > 10) : "number should be greater than 10" ;
		System.out.println("Good! Great");
		
		
		System.out.println("some other code here");
		
	}

}
