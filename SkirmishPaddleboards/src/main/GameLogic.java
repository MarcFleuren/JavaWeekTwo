package main;

import java.util.Scanner;

public class GameLogic {
	public boolean shoot(int x, int y, Grid player, Grid chart) {

		if (player.grid[x][y] == "B") {
			player.grid[x][y] = "x";
			chart.grid[x][y] = "x";

			System.out.println("Hit!");
			return true;

		} else {
			chart.grid[x][y] = "o";
			System.out.println("Miss :( ");
			return false;
		}
	}

	public void addRandomBoats() {

	}

	public void playGame(GameLogic gL) {

		Grid playerGrid = new Grid();
		Grid playerShotGrid = new Grid();

		// populate and display game
		playerGrid.populateGrid(playerGrid);
		playerShotGrid.populateGrid(playerShotGrid);
		// ai grid
		PaddleBoard p1 = new PaddleBoard(5, 5, 3, true);
		PaddleBoard p2 = new PaddleBoard(4, 3, 3, false);
		playerGrid.addBoat(p1, playerGrid);
		playerGrid.addBoat(p2, playerGrid);
		playerGrid.displayGrid(playerGrid);
		int hitCounter = 0;
		
		// take a Shot
		while(hitCounter <=6){
		Scanner shot = new Scanner(System.in);
		System.out.println("Input your x-coordinate shot");
		int shotx = shot.nextInt();
		System.out.println("Input your y-coordinate shot");
		int shoty = shot.nextInt();
		
		 if(gL.shoot(shotx, shoty, playerGrid, playerShotGrid) == true) {
			 hitCounter = hitCounter +1;
		 }
		System.out.println(shotx + " " + shoty);

		playerShotGrid.displayGrid(playerShotGrid);
		playerGrid.displayGrid(playerGrid);
		}
	}
}
