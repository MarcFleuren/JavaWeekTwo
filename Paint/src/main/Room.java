package main;

public class Room {
	public double roomX;

	public double roomY;
	public double roomZ;
	public double roomArea;

	public double getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(Room r) {
		this.roomArea = this.getRoomX() * this.getRoomY() + this.getRoomZ() * this.getRoomX()
				+ this.getRoomZ() * this.getRoomY();
	}

	public Room(double roomX, double roomY, double roomZ) {
		super();
		this.roomX = roomX;
		this.roomY = roomY;
		this.roomZ = roomZ;
		setRoomArea(this);

	}

	public double getRoomX() {
		return roomX;
	}

	public void setRoomX(int roomX) {
		this.roomX = roomX;
	}

	public double getRoomY() {
		return roomY;
	}

	public void setRoomY(int roomY) {
		this.roomY = roomY;
	}

	public double getRoomZ() {
		return roomZ;
	}

	public void setRoomZ(int roomZ) {
		this.roomZ = roomZ;
	}
}
