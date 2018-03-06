
public class Battleship {

	private int startX;
	private int startY;
	private int length;
	private String direction;

	public Battleship(int startX, int startY, int length, String direction) {
		super();
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

	public void setLength(int length) {
		this.length = length;
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
