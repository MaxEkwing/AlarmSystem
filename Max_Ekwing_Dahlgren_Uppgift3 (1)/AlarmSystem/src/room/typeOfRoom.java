package room;

import java.util.Random;

public enum typeOfRoom {
	BEDROOM1("Bedroom1"),
	BEDROOM2("Bedroom2"),
	BEDROOM3("Bedroom3"),
	BEDROOM4("Bedroom4"),
	MASTER_BEDROOM("Master bedroom"),
	KITCHEN("Kitchen"),
	GARAGE("Garage"),
	CELLAR("Cellar"),
	DININGROOM("Dining room"),
	LIVINGROOM("Living room"),
	FAMILYROOM("Family room"),
	TOILET("Toilet"),
	BATHROOM1("Bathroom"),
	BATHROOM2("Bathroom"),
	GARDEN("Garden");
	
	private final String label;
	
	private typeOfRoom(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	private static final Random room = new Random();
	public static typeOfRoom roomRandom() {
		typeOfRoom[] roomList = values();
		return roomList[room.nextInt(roomList.length)];
	}
}
