package com.gc.casino;
import java.util.Scanner;

public class GrandCircusCasino {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String play = new String();
		int sides = 0;

		System.out.println("Welcome to the Grand Circus Casino! Roll the Dice? (y/n): ");
		play = scan.nextLine();
		while (play.equalsIgnoreCase("y")) {

			// Ask the user to enter the number of sides on the dice
			System.out.println("Please enter the number of sides on the dice: ");
			sides = scan.nextInt();
			// Get the number of sides

			// Generate two random numbers between 1 and the number of sides
			// for the two dice
			double dice = Math.random() * sides;
			long result = (long) dice;
			result = result + 1;

			double diceTwo = Math.random() * sides;
			long resultTwo = (long) diceTwo;
			resultTwo = resultTwo + 1;

			// Print out the two numbers one on each line
			System.out.println("Roll 1: \n" + result + "\n" + resultTwo);
			System.out.println("Do you want to continue? (y/n)");

			play = scan.next();

		}

		System.out.println("\nThank you for playing!");

		scan.close();
	}

}
