package door;

public enum typeOfLock {
	
	DIGITAL("Digital"),
	KEY("Key"),
	LATCH("Latch");
	
	private final String label;
	
	private typeOfLock(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
