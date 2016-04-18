package com.gc.roomdetailgenerator;
import java.util.Scanner;

public class RoomDetailGenerator {

	public static void main(String[] args) {
		String userAnswer = new String();
		Scanner intro = new Scanner(System.in);
		userAnswer = "Y";

		while (userAnswer.equalsIgnoreCase("y")) {
			System.out.println("Welcome to Grand Circus' Room Detail Generator!");
			System.out.println("Enter Length:");
			double lengthInput = intro.nextDouble();

			System.out.println("Enter Width:");
			double widthInput = intro.nextDouble();

			System.out.println("Enter Height:");
			double heightInput = intro.nextDouble();

			double totalArea = lengthInput * widthInput;
			System.out.println("Area:" + totalArea);

			double totalPerim = (lengthInput * 2) + (widthInput * 2);
			System.out.println("Perimeter:" + totalPerim);

			double totalVolume = lengthInput * widthInput * heightInput;
			System.out.println("Volume:" + totalVolume);

			System.out.println("Do you want to continue? Y/N ");
			userAnswer = intro.next();

		}

		intro.close();
		
		System.out.println("Thank you for using the Grand Circus Room Detail Generator!");

	}

}
