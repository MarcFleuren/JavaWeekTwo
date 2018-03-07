package rPC;

import java.util.Scanner;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean running = true;
		System.out.println("Rock paper scissors game. Enter rock paper or scissors (case sensitive) "
				+ "to take a turn, type quit to end");
		while (running == true) {
			Scanner q = new Scanner(System.in);

			System.out.println("input move");

			String input = q.nextLine();
			if (input.equals("quit")) {
				running = false;

				System.out.println("Game has Ended");
				break;
			}

			String aiInput = GameLogic.aiInput();
			System.out.println(aiInput);

			String result = GameLogic.findWinner(input, aiInput);
			System.out.println(result);
			GameData.inputData(result);

		}
		System.out.println("Game Data:");

		GameData.displayData();
	}

}
