import java.util.Scanner;

public class GameLogic {
	public static boolean checkValidPlacement(int startx, int starty, int length, String direction, Grid Grid) {

		switch (direction) {
		case "right":
			if (((startx < 0 || startx > 12) || (starty < 0 || starty > 12))
					|| (startx + length > 12 || starty + length > 12)) {
				System.out.println("Out of Bounds");
				return false;

			} else {

				for (int i = 0; i < length; i++) {

					if (Grid.grid[startx][starty++] == 2) {
						System.out.println("Overlap");
						return false;
					}

				}

			}
			return true;

		case "up":
			if (((startx < 0 || startx > 12) || (starty <= 0 || starty > 12))
					|| (startx + length > 12 || starty - length < 0)) {
				System.out.println("Out of Bounds");
				return false;

			} else {

				for (int i = 0; i < length; i++) {

					if (Grid.grid[startx--][starty] == 2 || startx == 0) {
						System.out.println("Overlap");
						return false;
						
					}

				}

			}
			return true;
		case "left":
			if (((startx < 0 || startx > 12) || (starty <= 0 || starty > 12))
					|| (startx - length < 0 || starty + length > 12)) {
				System.out.println("Out of Bounds");
				return false;

			} else {

				for (int i = 0; i < length; i++) {

					if (Grid.grid[startx][starty--] == 2 || starty == 0) {
						System.out.println("Overlap");
						return false;
					}

				}

			}
			return true;
		case "down":
			if (((startx < 0 || startx > 12) || (starty < 0 || starty > 12))
					|| (startx + length > 12 || starty + length > 12)) {
				System.out.println("Out of Bounds");
				return false;

			} else {

				for (int i = 0; i < length; i++) {

					if (Grid.grid[startx++][starty] == 2) {
						System.out.println("Overlap");
						return false;
					}

				}

			}
			return true;

		}

		return true;
	}

	public static Grid startBoatsAI(Grid g) {

		Battleship bs11 = new Battleship(2, "up");
		Battleship bs12 = new Battleship(2, "down");
		Battleship bs13 = new Battleship(3, "down");
		Battleship bs14 = new Battleship(3, "right");
		Battleship bs15 = new Battleship(3, "up");
		Battleship bs16 = new Battleship(4, "right");
		Battleship bs17 = new Battleship(5, "left");
		
		Battleship.randomNumberStart(bs11,g);
		Battleship.randomNumberStart(bs12,g);
		Battleship.randomNumberStart(bs13,g);
		Battleship.randomNumberStart(bs14,g);
		Battleship.randomNumberStart(bs15,g);
		Battleship.randomNumberStart(bs16,g);
		Battleship.randomNumberStart(bs17,g);
		
		
		

		g.addBattleship(bs11, g);
		g.addBattleship(bs12, g);
		g.addBattleship(bs13, g);
		g.addBattleship(bs14, g);
		g.addBattleship(bs15, g);
		g.addBattleship(bs16, g);
		g.addBattleship(bs17, g);

		return g;

	}

	public static String shoot(Grid g) {
		
		Scanner q = new Scanner(System.in);
		System.out.println("Type in first coordinate X");

		String tempshotX = q.nextLine();

		System.out.println("Type in first coordinate Y");

		String tempshotY = q.nextLine();

		int shotX = Integer.parseInt(tempshotX);
		int shotY = Integer.parseInt(tempshotY);

		System.out.println(shotX + " " + shotY);
		
		return hitOrMiss(shotX, shotY, g);
		
			
		}
				

	

	public static String hitOrMiss(int a, int b, Grid g) {
		if (g.grid[a][b] == 2) {
			g.grid[a][b] = 1;
			return "Hit!";

		} else {
			return "Miss :(";
		}

	}

}
