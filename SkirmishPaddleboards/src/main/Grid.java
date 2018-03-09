package main;

public class Grid {
	public String[][] grid = new String[12][12];

	// array
	public void addBoat(PaddleBoard p, Grid g) {
		if (validatePlacement(p, g) == true) {
			if (p.isHorizontal() == true) {
				for (int i = 0; i < p.getLength(); i++) {
					g.grid[p.getX() + i][p.getY()] = "B";
				}
			} else {
				for (int i = 0; i < p.getLength(); i++) {
					g.grid[p.getX()][p.getY() + i] = "B";

				}
			}
		}
	}

	public void removeBoat() {

	}

	private boolean validatePlacement(PaddleBoard p, Grid g) {
		// if boat goes out of bounds
		if (p.getX() + p.getLength() == 0 || p.getY() + p.getLength() == 0) {
			System.out.println("Out of Bounds");
			return false;
		}
		// if boat overlaps
		for (int i = 0; i < p.getLength(); i++) {
			if (g.grid[p.getX() + i][p.getY()] == "B" || g.grid[p.getX()][p.getY() + i] == "B") {
				System.out.println("Overlap");
				return false;
			}
		}
		return true;
	}

	public void displayGrid(Grid g) {

		for (int j = 0; j < 12; j++) {
			
			System.out.println();
			for (int i = 0; i < 12; i++) {
				System.out.print(g.grid[j][i]);
			}
		}
		System.out.println();
	}

	public void populateGrid(Grid g) {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				g.grid[i][j] = "-";
			}
		}
	}
}
