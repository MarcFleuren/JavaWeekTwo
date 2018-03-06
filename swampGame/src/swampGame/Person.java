package swampGame;

public class Person {

	public int positionX;
	public int positionY;

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

	public Person() {

	}

	public void movePerson(String direction) {
		if (direction.equals("East") || direction.equals("east")) {
			this.positionX = positionX + 1;

		}
		if (direction.equals("West") || direction.equals("west")) {
			this.positionX = positionX - 1;

		}
		if (direction.equals("North") || direction.equals("north")) {
			this.positionY = positionY + 1;
		}
		if (direction.equals("South") || direction.equals("south")) {
			this.positionY = positionY - 1;
		}
		

	}
}
