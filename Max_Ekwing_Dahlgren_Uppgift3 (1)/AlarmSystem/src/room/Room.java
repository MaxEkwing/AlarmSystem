package room;

import intruder.Intruder;

public class Room {
	int floor;
	int squareMeters;
	protected typeOfRoom room;

	public Room(int floor, int squareMeters, typeOfRoom room) {
		super();
		this.floor = floor;
		this.squareMeters = squareMeters;
		this.room = room;
	}
	public static boolean sprinklers() {
		if (Intruder.fire() == true) {
			System.out.println("Sprinkler system on");
			return true;
		}
		else {
			return false;
		}
	}
	
}
