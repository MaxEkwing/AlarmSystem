package intruder;
import application.HouseBuilder;
import room.typeOfRoom;
public class Intruder extends HouseBuilder{
	public static int temperature;
	public static typeOfIntruder intruder;
	public static typeOfTool tool;
	public static typeOfRoom room;
    static boolean fire;

	public Intruder(typeOfIntruder intruder, typeOfTool tool, typeOfRoom room, int temperature) {
		super();
		Intruder.temperature = temperature;
		Intruder.intruder = intruder;
		Intruder.tool = tool;
		Intruder.room = room;
	}
	public Intruder(typeOfIntruder intruder, typeOfTool tool, typeOfRoom room) {
		super();
		Intruder.intruder = intruder;
		Intruder.tool = tool;
		Intruder.room = room;
	}
	public static boolean alarm() {
		if (isHuman() == true || intruder == typeOfIntruder.RHINO) {
			System.out.println("Alarm system on");
			return true;
		}
		else {
			return false;
		}
	}

	public typeOfIntruder getIntruder() {
		return intruder;
	}
	
	public static boolean isHuman() {
		if(intruder == typeOfIntruder.HUMAN || intruder == typeOfIntruder.KID) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isFlammable() {
		if (tool == typeOfTool.BLOWTORCH || tool == typeOfTool.CUTTING_TORCH) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean fire() {
		if (Intruder.temperature >= 100 && Intruder.isHuman() == true && Intruder.isFlammable() == true && room != typeOfRoom.GARDEN) {
			System.out.println("fire");
			fire = true;
			return fire;
		}
		else {
			fire = false;
			return fire;
		}
	}
	public static boolean breakIn() {
		if (intruder == typeOfIntruder.HUMAN && tool == typeOfTool.CROWBAR || intruder == typeOfIntruder.KID && tool == typeOfTool.CROWBAR) {
			return true;
		}
		else if (intruder == typeOfIntruder.HUMAN && tool == typeOfTool.AXE || intruder == typeOfIntruder.KID && tool == typeOfTool.AXE){
			return true;
		}
		else if (intruder == typeOfIntruder.RHINO) {
			return true;
		}
		else {
			return false;
		}
	}

}
