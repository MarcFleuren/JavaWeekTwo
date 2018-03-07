package rPC;

import java.util.ArrayList;

public class GameData {

	public static ArrayList<String> score = new ArrayList<String>();

	public static void inputData(String result) {
		score.add(result);

	}

	public static void displayData() {
		float totalGamesPlayed = 0;
		float winCounter = 0;
		int drawCounter = 0;

		for (String s : score) {
			totalGamesPlayed++;
			if (s.equals("win")) {
				winCounter = winCounter + 1;
			}
			if (s.equals("draw")) {
				drawCounter = drawCounter + 1;
			}
		}
		float aiWinCounter = totalGamesPlayed - winCounter - drawCounter;
		float winPercentage1 = (winCounter / totalGamesPlayed) * 100;

		System.out.println("total games played : " + (int) totalGamesPlayed);
		System.out.println("total wins" + (int) winCounter);
		System.out.println("win%" + " " + (int) winPercentage1 + "%");
		System.out.println("aiWins" + " " + (int) aiWinCounter);
		System.out.println("#draws" + " " + (int) drawCounter);
		System.out.println("Amrit and Marc Dream Team");
	}
}
