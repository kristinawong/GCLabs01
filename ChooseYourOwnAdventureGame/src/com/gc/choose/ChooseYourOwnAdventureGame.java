package com.gc.choose;
import java.util.Scanner;

public class ChooseYourOwnAdventureGame {

	public static void main(String[] args) {
		String userName = null;
		String answer = null;
		String doors = null;
		String trolls = null;
		String weapon = null;
		String decision = null;

		Scanner scan = new Scanner(System.in);

		System.out.println("What is your name?");
		userName = scan.nextLine();

		System.out.println("Would you like to play a game? Y/N");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("n")) {
			System.out.println("Have a great day!");
			answer = scan.nextLine();
		} else if (answer.equalsIgnoreCase("y")) {
			System.out.println("Wonderful, " + userName + "!");
			System.out.println(
					"You are walking in a dark cave\n and you reach two doors. If you want to enter\n the left door, type left. If you want to enter the right\n door, type right.\n");

		}
		doors = scan.nextLine();
		if (doors.equalsIgnoreCase("left")) {
			System.out.println(
					"You are outside, and you see a troll. If you want to stay\n and talk to him, type talk. If you want to run away,\n type run.");
		} else if (doors.equalsIgnoreCase("right")) {
			System.out.println("Okay," + userName + ". ");
			System.out.println(
					"You are outside, and you see a troll. If you want to stay\n and talk to him, type talk. If you want to run away,\n type run.");
		}
		trolls = scan.nextLine();
		
		if (trolls.equalsIgnoreCase("run")) {
			System.out.println(
					"The troll chases you, and kicks you in the knee. You wake\n up back in the cave alone. The End!");
		} else if (trolls.equalsIgnoreCase("talk")) {
			System.out.println("The troll offers you a weapon. Do you want the sword or the dagger? type your answer.");
		}
		weapon = scan.nextLine();
		if (weapon.equalsIgnoreCase("sword")) {
			System.out.println(
					"The troll gives you directions to the deadly honeycomb.\n Your mission is to take out the queen bee and take\n the hive as your own. Do you accept the challenge? type 1 for yes or 2 for no.");

		} else if (weapon.equalsIgnoreCase("dagger")) {
			System.out.println(
					"\n Your mission is to take out the queen bee and take\n the hive as your own. Do you accept the challenge? type 1 for yes or 2 for no.");
		}
		decision = scan.nextLine();
		switch (decision) {
		case "1":
			decision = "Don't be ridiculous. Go Home," + userName + "!";
			break;
		case "2":
			decision = "Good Decision," + userName + "! You have conquered the hive! The End";

		}
		System.out.println(decision);
	}
}
