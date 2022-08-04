package com.johnpark;

public class Main {
	public static void main(String[] args) {
		int newScore = calculateScore("John", 100);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore();

		calcFeetAndIncesToCentimeters(6, 0);
		calcFeetAndIncesToCentimeters(7, 5);
		calcFeetAndIncesToCentimeters(-10, 1);

		double centimeters = calcFeetAndIncesToCentimeters(6, -1);

		if (centimeters < 0.0) {
			System.out.println("Invalid parameters");
		}

		calcFeetAndIncesToCentimeters(100);
		calcFeetAndIncesToCentimeters(157);
		calcFeetAndIncesToCentimeters(-10);
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points.");

		return score * 1000;
	}

	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points.");

		return score * 1000;
	}

	public static int calculateScore() {
		System.out.println("No player name, no player score");
		return 0;
	}

	public static double calcFeetAndIncesToCentimeters(double feet, double inches) {
		if (feet < 0 || inches < 0 || inches > 12) {
			System.out.println("Invalid feet or inches parameters");
			return -1;
		}

		double centimeters = (feet * 12 * 2.54) + (inches * 2.54);

		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");

		return centimeters;
	}

	public static double calcFeetAndIncesToCentimeters(double inches) {
		if (inches < 0) {
			return -1;
		}

		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");

		return calcFeetAndIncesToCentimeters(feet, remainingInches);
	}
}