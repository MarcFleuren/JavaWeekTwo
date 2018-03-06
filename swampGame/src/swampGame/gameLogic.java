package swampGame;

import java.util.Scanner;

public class gameLogic {

	public static void startLocation(Person p) {
		p.setPositionX((int) Math.round(Math.random() * 10));
		p.setPositionY((int) Math.round(Math.random() * 10));

	}

	public static void startLocation(Treasure t) {
		t.setPositionX((int) Math.round(Math.random() * 10));
		t.setPositionY((int) Math.round(Math.random() * 10));
	}

	public static void startLocation(Trap tr) {
		tr.setPositionX((int) Math.round(Math.random() * 10));
		tr.setPositionY((int) Math.round(Math.random() * 10));
	}

	public static void startLocation(Goblin g) {
		g.setPositionX((int) Math.round(Math.random() * 10));
		g.setPositionY((int) Math.round(Math.random() * 10));
	}

	public static double distanceToTreasure(Person p, Treasure t, int a, int b, int c, int d) {
		// if (p.getPositionX() != t.getPositionX() || (p.getPositionY() !=
		// t.getPositionY())) {
		double distance = Math.sqrt((Math.abs((a - b) * (a - b)) + Math.abs(((c - d) * (c - d)))));
		return distance;
		// } else {
		// return 0;
		// }

	}

	

	public void mainGame() {

		Treasure treasure = new Treasure();
		Person player = new Person();
		Trap trap = new Trap();
		Goblin goblin = new Goblin();

		gameLogic.startLocation(goblin);
		gameLogic.startLocation(trap);
		gameLogic.startLocation(player);
		gameLogic.startLocation(treasure);

		// Checks if any of the objects spawned on top of each other, if so re randomises start location
		if ((player.getPositionX() == treasure.getPositionX() && player.getPositionY() == treasure.getPositionY())
				|| (player.getPositionX() == trap.getPositionX() && player.getPositionY() == trap.getPositionY())
				|| (treasure.getPositionX() == trap.getPositionX() && treasure.getPositionY() == trap.getPositionY())) {
			gameLogic.startLocation(goblin);
			gameLogic.startLocation(trap);
			gameLogic.startLocation(player);
			gameLogic.startLocation(treasure);
		}

		System.out.println("player" + " " + player.getPositionX() + " " + player.getPositionY());
		System.out.println("treasure" + " " + treasure.getPositionX() + " " + treasure.getPositionY());
		System.out.println(trap.getPositionX() + " " + trap.getPositionY());
		System.out.println(goblin.getPositionX() + " " + goblin.getPositionY());

		boolean searching = true;
		start: while (searching == true) {
			Scanner look = new Scanner(System.in);
			System.out.println(
					"You awaken to find yourself lost in a barren moor looking for a rumoured lost treasure, be wary of traps.  Try 'look'");

			look.nextLine();
			System.out.println(">look");
			System.out.println(
					"You notice a small watch-like device on the floor. You pick it up and look at it. It has hands like a watch, but the hands do not seem to tell time.");
			System.out.println(
					"It is getting late and you still haven't found the treasure. Try north east south or west");

			while ((player.getPositionX() != treasure.getPositionX())
					|| (player.getPositionY() != treasure.getPositionY())) {
				Scanner q = new Scanner(System.in);
				System.out.println("Which direction will you move?");

				String Direction = q.nextLine();

				player.movePerson(Direction);
				Goblin.randomGoblin(goblin);
				goblin.moveTreasure(goblin.getPositionX(), goblin.getPositionY(), treasure.getPositionX(),
						treasure.getPositionY(), treasure);
				System.out.println(goblin.getPositionX() + " " + goblin.getPositionY());
				if ((trap.checkTrap(trap.getPositionX(), trap.getPositionY(), player.positionX, player.positionY,
						player) == true)) {
					continue start;
				}
				trap.checkNearTrap(trap.getPositionX(), trap.getPositionY(), player.positionX, player.positionY);

				System.out.println(
						gameLogic.distanceToTreasure(player, treasure, player.getPositionX(), treasure.getPositionX(),
								player.getPositionY(), treasure.getPositionY()) + " m displayed on your watch");
				System.out.println(player.getPositionX() + " " + player.getPositionY());
			}
			System.out.println("You have found the Treasure!");
			searching = false;

		}
	}
}