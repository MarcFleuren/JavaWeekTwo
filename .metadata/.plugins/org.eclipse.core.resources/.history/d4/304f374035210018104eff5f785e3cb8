public abstract class Vehicle{
	public String type;
	public int weight;
	public String colour;
	public int topSpeedKMPH;
	public int price;
	
	
	
	public Vehicle(int weight, String colour, int topSpeedKMPH, int price) {
//		this.type = type;
		this.weight = weight;
		this.colour = colour;
		this.topSpeedKMPH = topSpeedKMPH;
		this.price = price;
		
	}
		
	public String toString() {
		return this.weight  + "kg " + this.colour + " "+ this.topSpeedKMPH +"kmph " +"£" + this.price; 
	}
		
	public double calculateMaintenanceBill(int weight, int price, String type) {
		double result = (weight * price) * 0.00005;
		if (type == "Airplane") {
			result = result + 2500;
		}
		return result;

	}
	}
	

