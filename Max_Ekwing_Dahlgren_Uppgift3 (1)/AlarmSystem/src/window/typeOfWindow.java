package window;

public enum typeOfWindow {
	SINGLE_GLAZED("Single glazed"),
	DOUBLE_GLAZED("Double glazed"),
	TRIPLE_GLAZED("Triple glazed"),
	TEMPERED_LAMINATED("Tempered laminated");
	
	private final String label;
	
	private typeOfWindow(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
