package edu.handong.csee.java.lab04.prob2;

// Insert scanner
import java.util.Scanner;
/**
 * class Rectangle
 * there are two class variable that represent the width and height of a rectangle
 * having two method to calculate area and perimeter of rectangle
 *   
 * @author smile
 *
 */
// Define Class
public class Rectangle {
	
	// define class variable that represent the width and height of a rectangle
	int width;
	int height;
	
	/**
	 * calculate the area of the rectangle
	 * 
	 * @return integer variable represent the rectangle's area
	 */
	// method that calculate the area of the rectangle and return the area
	// the area of the rectangle is the value multiplies the width and height.
	public int Area()
	{
		// return the calculated area in type integer
		return width * height;
	}
	
	/**
	 * calculate the perimeter of the rectangle
	 * 
	 * @return integer variable represent the rectangle's perimeter
	 */
	// method that calculate the perimeter of the rectangle and return the perimeter
	// the perimeter of the rectangle is the value adds the width and height and multiplies 2.
	public int Perimeter() 
	{
		// return the calculated perimeter in type integer
		return (width+height)*2;
	}
	
	/** 
	 * main program
	 * get width and height of a rectangle from user
	 * print the area and perimeter of the rectangle
	 * 
	 * @param args
	 */
	// Define main 
	public static void main (String[] args) {
		
		// define main variable that represent the width and height of a rectangle
		int width;
		int height;
		
		// Create an object of the Scanner
		Scanner keyboard = new Scanner (System.in);
		// Instantiate an object of class Rectangle
		Rectangle rec = new Rectangle();
		
		// Use the println to enter the width
		System.out.print("Enter the width: ");
		// use scanner object(keyboard) to enter the next number as width
		width = keyboard.nextInt();
		// put the variable width in main into the variable width in class Rectangle
		rec.width = width;
		
		// Use the println to enter the height
		System.out.print("Enter the height: ");
		// use scanner object(keyboard) to enter the next number as height
		height = keyboard.nextInt();
		// put the variable height in main into the variable height in class Rectangle
		rec.height = height;
		
		// print area and perimeter using println and Area method and Perimeter method of Rectangle class 
		System.out.println("Area: " + rec.Area());
		System.out.println("Perimeter: " + rec.Perimeter());
		
	}

}
