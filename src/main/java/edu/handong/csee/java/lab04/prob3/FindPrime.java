package edu.handong.csee.java.lab04.prob3;

// Insert scanner
import java.util.Scanner;
/**
 * class FindPrime
 * there are three class variable; num1 is a starting number and num1 is a ending number. k is local variable to use other method  
 * and one method to check prime number and print prime number
 * 
 * @author smile
 *
 */
// Define Class
public class FindPrime {

	// define class variable
	int num1;
	int num2;
	
	// define the class variable to use store the 'j'(j initializing in method prime())
	// prime() method need the local variable to use all area of the method
	int k = 2;
	
	/**
	 * main program
	 * get two numbers from user to find prime numbers between two numbers
	 * print prime numbers between two numbers
	 * 
	 * @param args
	 */
	// Define main 
	public static void main (String []args) {
		
		// define main variable: num1 and num2
		int num1; // num1 is first number
		int num2; // num2 is second number
		
		// Create an object of the Scanner
		Scanner keyboard = new Scanner (System.in);
		// Instantiate an object of PrimeMethod
		FindPrime primeNumber = new FindPrime();
		
		// Use the println to enter the first number
		System.out.print("Enter 1st number : ");
		// use scanner object(keyboard) to enter the next number as num1
		num1 = keyboard.nextInt();
		// put the variable num1 in main into the variable num1 in class primeNumber
		primeNumber.num1 = num1;
		
		// Use the println to enter the second number
		System.out.print("Enter 2nd number : ");
		// use scanner object(keyboard) to enter the next number as num2
		num2 = keyboard.nextInt();
		// put the variable num2 in main into the variable num2 in class primeNumber
		primeNumber.num2 = num2;
		
		// Print the sentence for the result
		System.out.println("List of prime numbers between " + num1 + " and " + num2);
		// call the method to print list of prime numbers between num1 and num2
		primeNumber.prime();
	}
	
	/**
	 * find prime numbers and print the list of prime numbers
	 */
	// method to find prime numbers and print the list of prime numbers 
	public void prime() {
		
		if(num1!=num2) // execute the if statement, when there is the number between num1 and num2
		{			
			// Insert i and put num1 into i, because of to calculate without changing num1
			// Stop the loop when the num1 same to num2; it means there is no number between num1 and num2
			for(int i= num1; i!=num2; i++) // it is an loop statement to check the all numbers that are num1 and num2
			{				
				// Insert j and initialize j to 2, j is a variable used to divide the number to check if it is a prime. 
				// Stop the loop when j is bigger than i(num1)/2, because when j is bigger than i/2, It is impossible to divide.
				for(int j=2; j<=i/2; j++) // It is an loop statement to check that i(num1) is divided into other numbers other than 1 and itself.
				{
					// put j into k
					// k is the largest number that has ever divided i(num1)
					k = j;
					if(i % j == 0) // if i(num1) is divided the j(other numbers other than 1 and itself), it isn't a prime number
						break; // so break the loop statement. No further checks required.
				}
				
				// k is the last number that divided i(num1)
				// This if statement check the i is prime; if i(num1) isn't divided the j, it is a prime number.
				if(i % k != 0)
					// print i(num1) checked as prime
					System.out.println(i);
			}			
		}
		else // there isn't the number between num1 and num2
			// print warning letter
			System.out.println("There is no number between " + num1 + "and " + num2);
		
	}

}
