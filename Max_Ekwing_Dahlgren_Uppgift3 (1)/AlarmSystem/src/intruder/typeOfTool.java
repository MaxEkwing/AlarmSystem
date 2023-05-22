package intruder;

import java.util.Random;

public enum typeOfTool {
	
	AXE("Axe"),
	BLOWTORCH("Blowtorch"),
	CUTTING_TORCH("Cutting torch"),
	CROWBAR("Crowbar");
	
	private final String label;
	
	private typeOfTool(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	private static final Random tool = new Random();
	public static typeOfTool toolRandom() {
		typeOfTool[] toolList = values();
		return toolList[tool.nextInt(toolList.length)];
	}
}
