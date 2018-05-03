package edu.handong.csee.java.lab04.prob6;

/**
 * class QuadraticEquation
 * there are three double variable and one boolean variable
 * five method for check that there are the solutions
 * 
 * @author smile
 */
// Insert scanner
import java.util.Scanner;
// Define Class
public class QuadraticEquation {
	
	// define class variable to check quadratic equation
	double a = 0, b = 0, c = 0; // initializing double variable to 0 
	boolean hasSolutions; // variable to enter existence and nonexistence of solution
	
	/**
	 * get three coefficients and put that coefficients into double variable a,b and c
	 * 
	 * @param coefa
	 * @param coefb
	 * @param coefc
	 */
	// method that get three coefficients and put that coefficients into double variable a,b, and c 
	public void set(double coefa, double coefb, double coefc) 
	{
		// put coefa into a
		a = coefa;
		// put coefb into b
		b = coefb;
		// put coefc into c
		c = coefc;
	}

	/**
	 * calculate the discriminant
	 * 
	 * @return double type variable, calculated number in discriminant
	 */
	// method that calculate the discriminant 
	public double discriminant()
	{
		// return calculated number in discriminant
		return (Math.pow(b, 2) - 4 * a * c);
	}
	
	/**
	 * compare the discriminat value with 0 to check the solution is existing
	 *  false: there is no solution
	 *  true: there are solutions
	 *  
	 * @return boolean type variable 
	 */
	// method that check the solution is existing
	public boolean check_solution()
	{
		// Compare the discriminant with 0 to check the existence of solution..
		if(discriminant() < 0) // if discriminant is smaller than 0, the solution doesn't exist
			// put false means there is no solution into hasSolutions 
			hasSolutions = false;
		else // if discriminant is bigger than 0, the solution exist
			// put true means there are solutions into hasSolutions
			hasSolutions = true;
		// return checked status about existence and nonexistence of solution 
		return hasSolutions;
	}
	
	/**
	 * calculate the quadratic formula when middle operate is +
	 * 
	 * @return double type variable, solution of quadratic formula
	 */
	// method that calculate the quadratic formula when middle operate is +
	public double get_root1()
	{
		// return calculated number of the quadratic formula
		return ((-b + Math.sqrt(discriminant())) / (2 * a));
	}
	
	/**
	 * calculate the quadratic formula when middle operate is -
	 * 
	 * @return double type variable, solution of quadratic formula
	 */
	// method that calculate the quadratic formula when middle operate is -
	public double get_root2()
	{
		// return calculated number of the quadratic formula
		return ((-b - Math.sqrt(discriminant())) / (2 * a));
	}
	
	/**
	 * main program
	 * get three coefficient a,b and c
	 * 
	 * if the solution is existing, calculate the solutions
	 * if the solution isn't existing, print the sentence meaning the solution does not exist
	 * 
	 * @param args
	 */
	// Define main 
	public static void main(String[] args) {
		
		// Instantiate an object of class QuadraticEquation
		QuadraticEquation eqn = new QuadraticEquation();
		// Create an object of the Scanner
		Scanner keyboard = new Scanner (System.in);
		
		// Use the println to enter coefficient a
		System.out.print("Please enter coefficient a: ");
		// use scanner object(keyboard) to enter the next number as a
		double a = keyboard.nextDouble();
		// Use the println to enter coefficient b
		System.out.print("Please enter coefficient b: ");
		// use scanner object(keyboard) to enter the next number as 
		double b = keyboard.nextDouble();
		// Use the println to enter coefficient c
		System.out.print("Please enter coefficient c: ");
		// use scanner object(keyboard) to enter the next number as 
		double c = keyboard.nextDouble();
		
		// call the method set()
		eqn.set(a, b, c);
		
		// It is an 'If statement' to get the solution of the quadratic equation.
		if(eqn.check_solution()) // when the solution is existing
		{
			// print the solutions of the quadratic equation
			System.out.println("x1 = " + eqn.get_root1());
			System.out.println("x2 = " + eqn.get_root2());
		}
		else // when the solution isn't existing
			// print the a sentence meaning the solution does not exist
			System.out.println("There is no real root");
	}
}
