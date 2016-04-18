package com.gc.factorialcalculator;
import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number 1-1000");
		long i = scan.nextLong();
		System.out.println(fact(i));
		scan.close();

	}

	public static long fact(long i) {
		if (i == 1)
			return 1;
		return i * (fact(i - 1));
	}
	
}
