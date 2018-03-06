import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
	public ArrayList<Vehicle> garageInventory = new ArrayList<Vehicle>();

	public Garage() {
	}

	public void addVehicle(Vehicle v) {

		this.garageInventory.add(v);

	}

	public void removeVehicle(String type) {
		Iterator<Vehicle> it = garageInventory.iterator();
		while (it.hasNext()) {
			Vehicle v = it.next();
			if (v.getClass().getCanonicalName().equals(type)) {
				it.remove();
			}
		}
	}

	public void removeVehicle(int price) {
		Iterator<Vehicle> it = garageInventory.iterator();
		while (it.hasNext()) {
			Vehicle v = it.next();
			if (v.price == price) {
				it.remove();
			}
		}
	}

	public void searchGarage(String name) {
		for (Vehicle v : garageInventory) {
			if (v.getClass().getCanonicalName().equals(name)) {
				System.out.println(v.getClass().getCanonicalName() + " £"
						+ v.calculateMaintenanceBill(v.weight, v.price, v.getClass().getCanonicalName()) + " "
						+ "annually");
			}
		}
	}

	public void searchGarage(int maxPrice) {
		for (Vehicle v : garageInventory) {
			if (v.price < maxPrice) {
				System.out.println(v.getClass().getCanonicalName() + " " + v.toString() + " £"
						+ v.calculateMaintenanceBill(v.weight, v.price, v.getClass().getCanonicalName()) + " "
						+ "maintenace " + "annually");
			}
		}
	}

	public void displayGarage() {
		for (Vehicle v : garageInventory) {

			System.out.println(v.getClass().getCanonicalName() + " £"
					+ v.calculateMaintenanceBill(v.weight, v.price, v.getClass().getCanonicalName()) + " "
					+ "annually");
		}
	}

	public void emptyGarage() {
		Iterator<Vehicle> it = garageInventory.iterator();
		while (it.hasNext()) {
			Vehicle v = it.next();
			it.remove();
		}
	}
}
