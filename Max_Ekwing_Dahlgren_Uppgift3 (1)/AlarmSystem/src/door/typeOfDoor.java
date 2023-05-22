package door;

public enum typeOfDoor {
	
	FRONT_DOOR("Front door"),
	INNER_DOOR("Inner door"),
	SLIDING_DOOR("Sliding door"),
	CELLAR_DOOR("Cellar door"),
	GARAGE_DOOR("Garage door");
	
	private final String label;
	
	private typeOfDoor(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
