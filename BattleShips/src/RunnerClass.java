
public class RunnerClass {
	public static void main(String[] args) {
		Grid grid = new Grid();
		Grid aigrid = new Grid();

		aigrid = GameLogic.startBoatsAI(aigrid);

		Battleship bs1 = new Battleship(5, 4, 3, "up");
		Battleship bs2 = new Battleship(3, 1, 2, "right");

		grid.addBattleship(bs1, grid);
		grid.addBattleship(bs2, grid);

		grid.printGrid(grid);

		System.out.println(" ");

		grid.printGrid(aigrid);

		while (true) {
			System.out.println(GameLogic.shoot(aigrid));

			grid.printGrid(aigrid);
		}
	}
}
