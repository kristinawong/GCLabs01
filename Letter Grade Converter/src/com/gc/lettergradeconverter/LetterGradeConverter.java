package com.gc.lettergradeconverter;
import java.util.Scanner;

public class LetterGradeConverter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int grade = 0;
		String quit = "y";
do {
		System.out.print("Enter your numeric grade (0 - 100): ");
		grade = scan.nextInt();
		if (grade >= 99) {
			System.out.println("A+");
		}
			if (grade >= 90) {
				System.out.println("A");
			}
			if (grade >= 80 && grade < 90) {
				System.out.println("B");
			}
			if (grade >= 70 && grade < 80) {
				System.out.println("C");
			}
			if (grade >= 60 && grade < 70) {
				System.out.println("D");
			}
			if (grade <= 59) {
				System.out.println("F");
			}
			System.out.println("\nDo you want to continue? y/n");
			quit = scan.next();

}while (quit.equalsIgnoreCase("y"));

				System.out.println("Thank you for using Factorial Calculator!");
			}
}

