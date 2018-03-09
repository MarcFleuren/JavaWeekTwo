package main;

import java.util.ArrayList;

public class PaintWizard {

	public ArrayList<Paint> listOfPaints = new ArrayList<Paint>();

	public void addPaint(Paint p) {

		this.listOfPaints.add(p);

	}

	public String cheapestPaint(Room r) {
		Paint cheapest = listOfPaints.get(0);

		for (Paint p : listOfPaints) {
			if (numberOfTins(r, p) * p.getPrice() < numberOfTins(r, cheapest) * cheapest.getPrice()) {
				cheapest = p;
			}
		}
		return toString(cheapest);
	}

	public double numberOfTins(Room r, Paint p) {
		return r.getRoomArea() / p.getCoverage();
	}

	public String toString(Paint p) {
		return( p.getBrand() + " £" + p.getPrice());
	}
	public String leastWasteful(Room r) {
		Paint leastWasteful = listOfPaints.get(0);

		for (Paint p : listOfPaints) {
			if (r.getRoomArea() % p.getCoverage() <  r.getRoomArea() % leastWasteful.getCoverage()){
				leastWasteful = p;
			}
		}
		return toString(leastWasteful);
	}
}
