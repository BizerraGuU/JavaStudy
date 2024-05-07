package com.exercises.loops;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
	
		/*
	Make an PrimeNumber class to:
	• Receive an integer N from the user
	• Test whether this integer is prime or not and report*/
	
		Scanner numerUser = new Scanner(System.in);
		
		int divNumber = 0;
		
		System.out.print("\nTell it a number: ");
		int numberType = numerUser.nextInt();
		
		if (numberType <= 0) {
			System.out.println("The number is not a prime one!");
		} 
		
		for (int i=2; i < numberType; i++) { // it starts with 2, 'cause every number can be divided by 1
			
			if (numberType % i == 0) { // here, it checks if the number can be divided by any between 2 and itself
				divNumber++;	// if it can, sum 1
			}
		}
		
		
		if (divNumber == 0) { // if not, divNumber stay 0 and we check this
			System.out.println("This number is a prime one!\n");
		} else {
			System.out.println("The number is not a prime one!");
		}
		
	}
}
