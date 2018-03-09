package main;

public class PaddleBoard {
	private int x;
	private int y;
	private int length;
	private boolean horizontal;
	
	public boolean isSunk() {
		return true;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public boolean isHorizontal() {
		return horizontal;
	}
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}
	public PaddleBoard(int x, int y, int length, boolean horizontal) {
		super();
		this.x = x;
		this.y = y;
		this.length = length;
		this.horizontal = horizontal;
	}
	
	
	
	
}
