package edu.handong.csee.java.lab04.prob5;

// Insert scanner
import java.util.Scanner;
/**
 * class Fan
 * there are two method
 * check the power condition of fan
 * set the speed, color, and radius
 * 
 * @author smile
 *
 */
// Define Class
public class Fan {

	/**
	 * check whether the user's sigh is 'Y(turnOn)' or 'N(turnOff)'
	 * 
	 * @param turn String variable turn is Y, y, N, or n.
	 * @return boolean variable 
	 * 
	 * turn on is true
	 * turn off is false
	 */
	// method that check whether the user's sign is 'Y(turnOn)' or 'N(turnOff)'
	public boolean Turn(String turn) {
		// execute when user's sign is Y or y (turn on the fan) 
		if(turn.equals("Y") || turn.equals("y"))
			// return the boolean type result true indicating turn on
			return true;
		// execute when user's sign isn't Y or y (turn on the fan)
		else
			// return the boolean type result false indicating turn off
			return false;
	}
	
	/**
	 * get three variable and print this variable
	 * 
	 * @param s
	 * @param r
	 * @param c
	 */
	// method that get three variable and print this variable
	// s is speed, r is radius, c is color
	public void display(int s, int r, String c) {
		
		// print speed, color, and radius
		System.out.println("the speed is " + s);
		System.out.println("the color is " + c);
		System.out.println("the radius is " + r);
	}
	
	/**
	 * main program
	 * get the power condition, speed, radius, color from the user
	 * print the fan' status
	 * 
	 * @param args
	 */
	// Define main 
	public static void main (String[] args) {
		
		// define five main variable 
		String power; // Variables Parameters to enter the wanted power state
		int speed = 0; // variable for fan's speed. initialize to zero
		int radius = 4; // variable for fan's radius. initialize to 4
		String color = "blue"; // variable for fan's color. initialize blue
		boolean turn; // Variables for Power Condition 
		
		// Create an object of the Scanner
		Scanner keyboard = new Scanner (System.in);
		// Instantiate an object of class Fan
		Fan fan = new Fan();
		
		// Use the print to enter fan's power condition
		System.out.print("Trun on(Y/N): ");
		// use scanner object(keyboard) to enter the next string as power
		power = keyboard.next();
		
		// call the method Turn() to put fan's power condition into turn 
		turn = fan.Turn(power); // if fan turn on, variable turn is true and if fan turn off, variable turn is false.
		
		if(turn) // execute the if statement when fan turn on  
		{	
			// Use the print to enter fan's speed
			System.out.print("Enter the speed(1-3): ");
			// use scanner object(keyboard) to enter the next number as speed
			speed = keyboard.nextInt();
			// Use the print to enter fan's radius
			System.out.print("Enter the radius: ");
			// use scanner object(keyboard) to enter the next number as radius
			radius = keyboard.nextInt();
			// Use the print to enter fan's color
			System.out.print("Enter the color: ");
			// use scanner object(keyboard) to enter the next string as color
			color = keyboard.next();
			
			// print the fan power condition
			System.out.println("Fan is on");
			// call the method display() 
			fan.display(speed, radius, color);
		}
		else // execute the if statement when fan turn off
		{
			// print the fan power condition
			System.out.println("Fan is off");
			// call the method display() 
			fan.display(speed, radius, color);
		}
	}
}
