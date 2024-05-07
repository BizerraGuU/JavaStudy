package com.exercises.loops;
import java.util.Scanner;
public class PrizeOne {

	public static void main(String[] args) {
		
		/*2) Make an PrizeOne class to:
		• Draw a number from 0 to 1000 (tip: use Math.random())
		• Ask the user for a guess. If he makes a mistake, inform whether the guess is greater or
		less than the number drawn.
		• Ask for new guesses until the user gets it right and, after that, show them in
		how many attempts he got right.*/
		
		int randomNumber = (int) (Math.random() * 1000); // here, we convert to integer, 'cause Math.random() get just double/float numbers  
		// and the *1000 is just to put it in range of 1000;
		
		int numberEnter;
		
		int cont = 0;
		
		Scanner prizeGuest = new Scanner(System.in);
		
		do {
			
			System.out.print("Enter a number to guess: ");
			numberEnter = prizeGuest.nextInt();	
			
			cont++;
			
		} while (numberEnter != randomNumber);
		
		
		System.out.println("You have tried " + cont + " time(s)!");
					
	}
}


