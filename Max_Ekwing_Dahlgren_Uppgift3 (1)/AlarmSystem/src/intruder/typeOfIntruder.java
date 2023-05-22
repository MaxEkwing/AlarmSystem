package intruder;
import java.util.Random;
public enum typeOfIntruder {
	
	HUMAN("Human"),
	BIRD("Bird"),
	RHINO("Rhino"),
	KID("Kid"),
	CAT("Cat");
	
	private final String label;
	
	private typeOfIntruder(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	private static final Random intruder = new Random();
	public static typeOfIntruder intruderRandom() {
		typeOfIntruder[] intruderList = values();
		return intruderList[intruder.nextInt(intruderList.length)];
	}
}
