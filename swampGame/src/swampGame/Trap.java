package swampGame;

public class Trap {
	private int positionX;
	private int positionY;

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

	public Trap() {
	}

	public boolean checkTrap(int trapPositionX, int trapPositionY, int playerPositionX, int playerPositionY, Person p) {
		 
		if (trapPositionX == playerPositionX && trapPositionY == playerPositionY) {
			System.out.println("You have hit a trap! You lose conciousness...");
			return true;
		} else {
			return false;

		}
		
	
	}
	public void checkNearTrap(int a, int b, int x, int y) {
		if ( a-1 == x || a+1 == x || b-1 == y || b+1 == y )
			 System.out.println("your compass flashes red");
	}
}
