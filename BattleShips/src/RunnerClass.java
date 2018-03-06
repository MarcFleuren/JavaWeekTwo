
public class RunnerClass {
	public static void main(String[] args) {
		Grid grid = new Grid();
		Battleship bs1 = new Battleship(5,4,2,"up");
		Battleship bs2 = new Battleship(3,1,3,"right");
		
		grid.addBattleship(4, 1, 2, "up");
		grid.addBattleship(3, 1, 3, "right");
		GameLogic.checkOverlap(bs1,bs2);
		
		grid.printGrid();
	}
}
// next add check if battleships overlap.