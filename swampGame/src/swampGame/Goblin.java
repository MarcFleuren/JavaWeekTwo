package swampGame;

public class Goblin {

	private int positionY;
	private int positionX;

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public void moveTreasure(int goblinLocationX, int goblinLocationY, int treasureLocationX, int treasureLocationY,
			Treasure t) {
		if (goblinLocationX == treasureLocationX && goblinLocationY == treasureLocationY) {
			gameLogic.startLocation(t);
		}
	}

	public static void randomGoblin(Goblin g) {
		gameLogic.startLocation(g);
	}

}
