package edu.handong.csee.java.lab04.prob1;

/**
 * Class that calculate the two number's addition, subtraction, multiplication, division and modulation
 * There are two variable for calculating
 * 
 * @author smile
 */

// Insert scanner
import java.util.Scanner;
// Define Class
public class Calculator {	
	
	/**
	 * main program
	 * get two number from user
	 * and calculate the addition, subtraction, multiplication, division, and modulation of two number
	 * 
	 * @param args
	 */
	// Define main 
	public static void main(String[] args) {
		
		// Create an object of the Scanner
		Scanner keyboard = new Scanner (System.in);
		// Instantiate an object of class Calculator
		Calculator calculator = new Calculator();

		// define main variable num1 and num2
		int num1;
		int num2;
		
		// Use the println to enter the first number
		System.out.println("Enter the first number: ");
		// use scanner object(keyboard) to enter the next number as num1
		num1 = keyboard.nextInt();
		// put the variable num1 in main into the variable num1 in class Calculator
		calculator.num1 = num1;
		
		// Use the println to enter the second number
		System.out.println("Enter the second number: ");
		// use scanner object(keyboard) to enter the next number as num2
		num2 = keyboard.nextInt();
		// put the variable num2 in main into the variable num2 in class Calculator
		calculator.num2 = num2;
		
		// Print calculated outputs: additions, subtraction, multiplication, division and modulation
		// use the method of calculator
		System.out.println(num1 + " + " + num2 + " = " + calculator.add());
		System.out.println(num1 + " - " + num2 + " = " + calculator.sub());
		System.out.println(num1 + " * " + num2 + " = " + calculator.mul());
		System.out.println(num1 + " / " + num2 + " = " + calculator.div());
		System.out.println(num1 + " % " + num2 + " = " + calculator.mod());
		
	}

	// define class variable: they are used in calculation
	int num1;
	int num2;
	
	/**
	 * method that calculate the outcome of addition
	 * @return type integer that represent result of addition
	 */
	
	// method that calculate the outcome of addition
	public int add()
	{
		// return addited number num1 and num2
		return num1+num2;
	}
	
	/**
	 * method that calculate the outcome of subtraction
	 * @return type integer that represent result of subtraction
	 */
	// method that calculate the outcome of subtraction
	public int sub()
	{
		// return subtracted number num1 and num2
		return num1-num2;
	}
	
	/**
	 * method that calculate the outcome of multiplication
	 * @return type integer that represent result of multiplication
	 */
	// method that calculate the outcome of multiplication
	public int mul()
	{
		// return multiplicated number num1 and num2
		return num1*num2;
	}
	
	/**
	 * method that calculate the outcome of division
	 * @return type integer that represent result of division
	 */
	// method that calculate the outcome of division
	public int div()
	{
		// if divisor number is 0, print warning letter and close the method
		if(num2 == 0) {
			System.out.println("Can't divide by 0!");
			System.exit(0);}
		// if divisor number isn't 0, return divided number: divide num1 into num2
		return num1/num2;
			
	}
	
	/**
	 * method that calculate the outcome of modulation
	 * @return type integer that represent result of modulation
	 */
	// method that calculate the outcome of modulation
	public int mod()
	{
		// if divisor number is 0, close the method
		if(num2 == 0)
			System.exit(0);
		//  if divisor number isn't 0, return modulated number: modulate num1 into num2
		return num1%num2;
	}
	
}
