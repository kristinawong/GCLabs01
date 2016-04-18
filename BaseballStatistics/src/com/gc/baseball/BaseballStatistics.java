package com.gc.baseball;

import java.util.Scanner;

public class BaseballStatistics {

	public static void main(String[] args) {
		int timesAtBat = 0;
		double average = 0;

		// 1. display message
		System.out.println("Welcome to Batting Average Calculator!");
		// 2. prompt user for number of at bats
		System.out.println("Enter number of times at bat: ");
		// 3. get user input
		Scanner scan = new Scanner(System.in);
		timesAtBat = scan.nextInt();
		// 4. calculate batting average t
		System.out.println("0= out, 1=single, 2=double, 3=triple, 4=home run");
		int[] atBat = new int[timesAtBat];
		float sum = 0.0f;
		for (int i = 0; i < atBat.length; i++) {
			System.out.println("Result for at-bat " + i + ":");
			atBat[i] = scan.nextInt();

			sum = sum + atBat[i];

		}

		System.out.println("Slugging Percentage is :" + sum / timesAtBat);
		float count = 0.0f;
		float sumOfNonZero = 0.0f;
		for (int i = 0; i < atBat.length; i++) {
			if (atBat[i] > 0) {
				count++;
				sumOfNonZero += atBat[i];
			}

		}
		System.out.println("Batting Average is: " + sumOfNonZero / count);

	}
}

// 5. calculate slugging percentage

// 6. display results

// 7. prompt user to continue
