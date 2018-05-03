package edu.handong.csee.java.lab04.prob4;

// Insert scanner
import java.util.Scanner;
/**
 * class PointDistance
 * there are two variable represent coordinate
 * and one method calculate the distance from origin to (x,y) 
 * 
 * @author smile
 *
 */
// Define Class
public class PointDistance {
	
	// define class variable for coordinate.
	int x;
	int y;
	
	/**
	 * calculate the distance of (0,0) to (x,y)
	 * 
	 * @return double variable represent the distance (0,0) to (x,y)
	 */
	// method that calculates the distance
	// the result is returned to double type
	public double distance() {
		// insert double variable dist and put square root(x*x)+(y*y) into dist
		// square root(x*x)+(y*y) is distance of (0,0) to (x,y)
		double dist = Math.sqrt(x*x + y*y);
		// return the calculated distance
		return dist;
	}

	/**
	 * main program
	 * get two variable for coordinate from user
	 * and print the distance from origin to (x,y)
	 * 
	 * @param args
	 */
	// Define main 
	public static void main (String[] args) {
	
		// define main variable for coordinate.
		int x,y;
		// define double variable for distance value
		double dist;
		
		// Create an object of the Scanner
		Scanner keyboard = new Scanner(System.in);
		// Instantiate an object of class Point
		PointDistance point = new PointDistance();
		
		// Use the println to enter coordinate x
		System.out.print("Enter x : ");
		// use scanner object(keyboard) to enter the next number as x
		x = keyboard.nextInt();
		// put the variable x in main into the variable x in class Point
		point.x = x;
		
		// Use the println to enter coordinate x
		System.out.print("Enter y : ");
		// use scanner object(keyboard) to enter the next number as 
		y = keyboard.nextInt();
		// put the variable y in main into the variable y in class Point
		point.y = y;
		
		// print the distance from origin to use method distance 
		System.out.printf("The distance from origin: %f", point.distance());
	}
}
