
public class Grid {
	public int[][] grid = new int[12][12];

	public void addBattleship(Battleship b, Grid g) {

		int startX = b.getstartX();
		int startY = b.getstartY();
		if (b.getDirection().equals("right")) {

			if (GameLogic.checkValidPlacement(b.getstartX(), b.getstartY(), b.getLength(), b.getDirection(),
					g) == true) {
				for (int i = 0; i <= b.getLength(); i++) {
					g.grid[b.getstartX()][startY++] = 2;

				}
			} else {
				System.out.println("Invalid boat placement");

			}

		}

		if (b.getDirection().equals("up")) {
			if (GameLogic.checkValidPlacement(b.getstartX(), b.getstartY(), b.getLength(), b.getDirection(),
					g) == true) {
				for (int i = 0; i <= b.getLength(); i++) {

					g.grid[startX--][b.getstartY()] = 2;
				}

			} else {
				System.out.println("Invalid boat placement");

			}

		}
		if (b.getDirection().equals("left")) {
			if (GameLogic.checkValidPlacement(b.getstartX(), b.getstartY(), b.getLength(), b.getDirection(),
					g) == true) {
				for (int i = 0; i <= b.getLength(); i++) {

					g.grid[b.getstartX()][startY--] = 2;

				}

			} else {

				System.out.println("Invalid boat placement");

			}

		}
		if (b.getDirection().equals("down")) {
			if (GameLogic.checkValidPlacement(b.getstartX(), b.getstartY(), b.getLength(), b.getDirection(),
					g) == true) {
				for (int i = 0; i <= b.getLength(); i++) {

					g.grid[startX++][b.getstartY()] = 2;

				}

			} else {
				System.out.println("Invalid boat placement");

			}

		}
	}

	public void printGrid(Grid g) {
		for (int j = 0; j < 11; j++) {
			System.out.println();
			for (int i = 0; i < 11; i++) {
				System.out.print(g.grid[j][i]);
			}
		}
	}
}
