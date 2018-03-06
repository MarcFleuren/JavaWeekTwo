
public class Battleship {
	public int length;
	public int startX;
	public int startY;
	public String direction;

	public Battleship(int startX, int startY, int length, String direction) {

		this.startX = startX;
		this.startY = startY;
		this.length = length;
		this.direction = direction;

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
