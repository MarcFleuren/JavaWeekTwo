package main;

public class RunnerClass {
	public static void main(String[] args) {
		Room a = new Room(5, 5, 3.5);
		Paint b = new Paint("CheapoMax",20, 19.99, 10);
		Paint c = new Paint("OrphanTears",15,17.99,11);
		Paint d = new Paint("AnimalSacrifices",10,25,20);
		
		
		
		PaintWizard paintwizard = new PaintWizard();
		paintwizard.addPaint(b);
		paintwizard.addPaint(c);
		paintwizard.addPaint(d);
		
		
		System.out.println(paintwizard.cheapestPaint(a));
		System.out.println(paintwizard.leastWasteful(a));

	}
}
