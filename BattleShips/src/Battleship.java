
public class Battleship {
	public int length;
	public int startX;
	public int startY;
	public String direction;

	public Battleship(int length, String direction) {

		this.length = length;
		this.direction = direction;

	}

	public Battleship(int startX, int startY, int length, String direction) {

		this.startX = startX;
		this.startY = startY;
		this.length = length;
		this.direction = direction;

	}

	public static void randomNumberStart(Battleship b, Grid g) {
		boolean valid = false;
		start: while (valid == false) {
			double result;

			result = Math.random() * 10;
			if (result == 0) {
				continue start;
			}

			b.setstartX((int) result);

			result = 0;
			result = Math.random() * 10;
			if (result == 0) {
				continue start;
			}

			b.setstartY((int) result);
			if (GameLogic.checkValidPlacement(b.getstartX(), b.getstartY(), b.getLength(), b.getDirection(), g) == true) {
				valid = true;

			}
		}
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getLength() {
		return length;
	}

	public int getstartX() {
		return startX;
	}

	public void setstartX(int startX) {
		this.startX = startX;
	}

	public int getstartY() {
		return startY;
	}

	public void setstartY(int startY) {
		this.startY = startY;
	}

}
