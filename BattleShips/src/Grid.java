
public class Grid {
	public static int[][] grid = new int[9][9];

	public void addBattleship(int startx, int starty, int length, String direction) {

		if (direction.equals("right")) {
			if (((startx < 0 || startx > 9) || (starty < 0 || starty > 9))
					|| (startx + length > 9 || starty + length > 9)) {
				System.out.println("Out of Bounds");

			} else {
				boolean overlap = false;
				for (int i = 0; i < length; i++) {

					if (grid[startx][starty++] == 2) {
						System.out.println("Overlap");
						overlap = true;
					}
				}
				if (overlap = false) {
					for (int i = 0; i < length; i++) {
						grid[startx][starty++] = 2;

					}
				} else {
					System.out.println("Invalid boat placement");

				}

			}
		}
		if (direction.equals("up")) {
			if (((startx < 0 || startx > 9) || (starty < 0 || starty > 9))
					|| (startx + length > 9 || starty + length > 9)) {
				System.out.println("Out of Bounds");

			} else {

				for (int i = 0; i < length; i++) {

					grid[startx--][starty] = 2;

				}

			}

		}
		if (direction.equals("left")) {
			if (((startx < 0 || startx > 9) || (starty < 0 || starty > 9))
					|| (startx + length > 9 || starty + length > 9)) {
				System.out.println("Out of Bounds");

			} else {

				for (int i = 0; i < length; i++) {

					grid[startx][starty--] = 2;

				}

			}

		}
		if (direction.equals("down")) {
			if (((startx < 0 || startx > 9) || (starty < 0 || starty > 9))
					|| (startx + length > 9 || starty + length > 9)) {
				System.out.println("Out of Bounds");

			} else {

				for (int i = 0; i < length; i++) {

					grid[startx++][starty] = 2;

				}

			}

		}
	}

	public void printGrid() {
		for (int j = 0; j < 9; j++) {
			System.out.println();
			for (int i = 0; i < 9; i++) {
				System.out.print(Grid.grid[j][i]);
			}
		}
	}
}
