package rPC;

import java.util.Scanner;

public class GameLogic {

	public static void runGame() {
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
	public static String findWinner(String player, String AI) {
		
		if(player.equals("rock")) {
			switch (AI) {
			
			case "rock" : return "draw";
			
			case "scissors" : return "win";
			
			case "paper" : return "lose and loooseooo";
			
			}
		}
		if(player.equals("scissors")) {
			switch (AI) {
			
			case "rock" : return "lose";
			
			case "scissors" : return "draw";
			
			case "paper" : return "win";
			
			}
		}
		if(player.equals("paper")) {
			switch (AI) {
			
			case "rock" : return "win";
			
			case "scissors" : return "lose";
			
			case "paper" : return "draw";
			
			}
		}
		
		
		
		return "Enter valid move";
		
	}


 public static String aiInput() {
	 
	 int selector = (int) (Math.random()*10);
	 
	 switch (selector) {
	 case 0 : return "rock";
	 case 1 : return "rock";
	 case 2 : return "scissors";
	 case 3 : return "paper";
	 case 4 : return "rock";
	 case 5 : return "scissors";
	 case 6 : return "paper";
	 case 7 : return "rock";
	 case 8 : return "scissors";
	 case 9 : return "paper";
	 case 10 : return "paper";
	 
	 }
	 
	 return null;
	 
 }




}
