package main;

public class Paint {
	public String brand;
	public int litres;
	public double price;
	public int coverage;

	public Paint(String brand,int litres, double price, int coverage) {
		super();
		this.brand = brand;
		this.price = price;
		this.coverage = coverage;
		this.litres = litres;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

}
