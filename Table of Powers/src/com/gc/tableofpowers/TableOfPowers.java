package com.gc.tableofpowers;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int integer = 0;
		String border = "=======\t\t";

		String quit = "y";

		System.out.println("Learn your squares and cubes!");

		do {
			System.out.print("\nEnter an integer: ");
			
			integer = scan.nextInt();
			System.out.println("\nNumber\t\tSquared\t\tCubed\n" + border + border + border);

			for (int i = 1; i <= integer; i++) {
				System.out.println(i + "\t\t" + Math.pow(i, 2) + "\t\t" + Math.pow(i, 3));

			}
			System.out.print("\nContinue? y/n: ");
			quit = scan.next();
			
		} while (quit.equalsIgnoreCase("y"));
		System.out.println("\nThank you for using Table of Powers!");
		scan.close();
	}
	/*try {
		
		quit = scan.next();
	} catch (InputMismatchException e) {
		scan.next();
		System.out.println("Incorrect Entry. Please try again!\n");*/
	}

