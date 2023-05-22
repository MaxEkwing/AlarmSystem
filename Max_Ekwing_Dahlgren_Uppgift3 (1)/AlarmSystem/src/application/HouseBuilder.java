package application;

import door.Door;
import door.typeOfDoor;
import door.typeOfLock;
import intruder.Intruder;
import intruder.Temperature;
import intruder.typeOfIntruder;
import intruder.typeOfTool;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import room.Room;
import room.typeOfRoom;
import window.Window;
import window.typeOfWindow;

public class HouseBuilder extends Application{
	
		public void lockAllDoors() {
	    	masterBedroomDoor.lockDoor();
	    	bath2door.lockDoor();
	    	bedDoor1.lockDoor();
	    	bedDoor2.lockDoor();
	    	bedDoor3.lockDoor();
	    	bedDoor4.lockDoor();
	    	toiletdoor.lockDoor();
	    	entranceDoor.lockDoor();
	    	kitchenDoor_Garden.lockDoor();
	    	bath1door.lockDoor();
	    	garageDoor1.lockDoor();
	    	garageDoor2.lockDoor();
	    	sideGarageDoor.lockDoor();
	    	cellDoor.lockDoor();
		}
		public boolean checkAlarmStatus() {
			if (masterBedroomDoor.checkDoorStatus() == true &&
	    	    bath2door.checkDoorStatus() == true &&
	    	    bedDoor1.checkDoorStatus() == true &&
	    	    bedDoor2.checkDoorStatus() == true &&
	    	    bedDoor3.checkDoorStatus() == true &&
	    	    bedDoor4.checkDoorStatus() == true &&
	    	    toiletdoor.checkDoorStatus() == true &&
	    	    entranceDoor.checkDoorStatus() == true &&
	    	    kitchenDoor_Garden.checkDoorStatus() == true &&
	    	    bath1door.checkDoorStatus() == true &&
	    	    garageDoor1.checkDoorStatus() == true &&
	    	    garageDoor2.checkDoorStatus() == true &&
	    	    sideGarageDoor.checkDoorStatus() == true &&
	    	    cellDoor.checkDoorStatus() == true && 
	    	    cellWindow1.checkWindowStatus() == true &&
        	    cellWindow2.checkWindowStatus() == true &&
        	    cellWindow3.checkWindowStatus() == true &&
        	    entrenceWindow.checkWindowStatus() == true &&
        	    kitchenWindow1.checkWindowStatus() == true &&
        	    kitchenWindow2.checkWindowStatus() == true &&
        	    diningWindow1.checkWindowStatus() == true &&
        	    diningWindow2.checkWindowStatus() == true &&
        	    diningWindow3.checkWindowStatus() == true &&
        	    diningWindow4.checkWindowStatus() == true &&
        	    livingWindow1.checkWindowStatus() == true &&
        	    livingWindow2.checkWindowStatus() == true &&
        	    livingWindow3.checkWindowStatus() == true &&
        	    famWindow1.checkWindowStatus() == true &&
        	    famWindow2.checkWindowStatus() == true &&
        	    bath1Window.checkWindowStatus() == true &&
        	    garageWindow.checkWindowStatus() == true &&
        	    masterWindow1.checkWindowStatus() == true &&
        	    masterWindow2.checkWindowStatus() == true &&
        	    masterWindow3.checkWindowStatus() == true &&
        	    masterWindow4.checkWindowStatus() == true &&
        	    bedWindow1_1.checkWindowStatus() == true &&
        	    bedWindow1_2.checkWindowStatus() == true &&
        	    bedWindow2_1.checkWindowStatus() == true &&
        	    bedWindow2_2.checkWindowStatus() == true &&
        	    bedWindow3_1.checkWindowStatus() == true &&
        	    bedWindow3_2.checkWindowStatus() == true &&
        	    bedWindow4_1.checkWindowStatus() == true &&
        	    bedWindow4_2.checkWindowStatus() == true &&
        	    toiletWindow.checkWindowStatus() == true) {
				return true;
			}
			else{
				return false;
			}
		}
		public static void intruderBuilder() {
			Intruder intruder = new Intruder(typeOfIntruder.intruderRandom(), typeOfTool.toolRandom(), typeOfRoom.roomRandom(), Temperature.randomTemp());
		}
		public String motionSensor() {
			if (checkAlarmStatus() == false) {
				System.out.println("Motion sensor detected activity:");
				if (Intruder.isHuman() == true && Intruder.isFlammable() == false) {
					return "Who: " + Intruder.intruder + "\nWith: " + Intruder.tool + "\nWhere: " + Intruder.room;
				}
				else if (Intruder.isHuman() == true && Intruder.isFlammable() == true) {
					Intruder.fire();
					return "Who: " + Intruder.intruder + "\nWith: " + Intruder.tool + "\nWhere: " + Intruder.room +"\nTemp: " + Intruder.temperature;
				}
				else {
					return "Who: " + Intruder.intruder + "\nWhere: " + Intruder.room;
				} 
			}
			else if (Intruder.breakIn() == true){
				System.out.println("Motion sensor detected activity:");
				if (Intruder.isHuman() == true && Intruder.isFlammable() == false) {
					return "Who: " + Intruder.intruder + "\nWith: " + Intruder.tool + "\nWhere: " + Intruder.room;
				}
				else {
					return "Who: " + Intruder.intruder + "\nWhere: " + Intruder.room;
				} 
			}
			else {
				return "Intruder could not break in!";
			}
		}
		//LEVEL 1
		Room masterBedroom = new Room(1, 25, typeOfRoom.MASTER_BEDROOM);
		Window masterWindow1 = new Window(1, 2, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
		Window masterWindow2 = new Window(1, 2, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
		Window masterWindow3 = new Window(1, 2, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
		Window masterWindow4 = new Window(1, 2, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
		Door masterBedroomDoor = new Door(1, "Wood", typeOfLock.KEY, typeOfDoor.SLIDING_DOOR, false);
		Room bathroom2 = new Room(1, 10, typeOfRoom.BATHROOM2);
		Window bath2Window = new Window(1, 5, typeOfWindow.TRIPLE_GLAZED, null, false);
		Door bath2door = new Door(1, "wood", typeOfLock.KEY, typeOfDoor.INNER_DOOR, false);
				
		Room bedroom1 = new Room(1, 15, typeOfRoom.BEDROOM1);
		Window bedWindow1_1 = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Window bedWindow1_2 = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Door bedDoor1 = new Door(1, "Wood", typeOfLock.KEY, typeOfDoor.INNER_DOOR, false);
				
		Room bedroom2 = new Room(1, 15, typeOfRoom.BEDROOM2);
		Window bedWindow2_1 = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Window bedWindow2_2 = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Door bedDoor2 = new Door(1, "Wood", typeOfLock.KEY, typeOfDoor.INNER_DOOR, false);
				
		Room bedroom3 = new Room(1, 15, typeOfRoom.BEDROOM3);
		Window bedWindow3_1 = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Window bedWindow3_2 = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Door bedDoor3 = new Door(1, "Wood", typeOfLock.KEY, typeOfDoor.INNER_DOOR, false);
				
		Room bedroom4 = new Room(1, 15, typeOfRoom.BEDROOM4);
		Window bedWindow4_1 = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Window bedWindow4_2 = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Door bedDoor4 = new Door(1, "Wood", typeOfLock.KEY, typeOfDoor.INNER_DOOR, false);
				
		Room toilet = new Room(1, 3, typeOfRoom.TOILET);
		Window toiletWindow = new Window(1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Door toiletdoor = new Door(1, "wood", typeOfLock.KEY, typeOfDoor.INNER_DOOR, false);
				
		//LEVEL 0
		Door entranceDoor = new Door(0, "Wood", typeOfLock.DIGITAL, typeOfDoor.FRONT_DOOR, false);
		Window entrenceWindow = new Window(0, 1, typeOfWindow.TEMPERED_LAMINATED, typeOfLock.LATCH, false);
				
		Room kitchen = new Room(0, 15, typeOfRoom.KITCHEN);
		Window kitchenWindow1 = new Window(0, 1, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
		Window kitchenWindow2 = new Window(0, 1, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
		Window kitchenWindow3 = new Window(0, 6, typeOfWindow.TEMPERED_LAMINATED, null, false);
		Door kitchenDoor_Garden = new Door(1, "Glass", typeOfLock.DIGITAL, typeOfDoor.SLIDING_DOOR, false);
				
		Room diningRoom = new Room(0, 15, typeOfRoom.DININGROOM);
		Window diningWindow1 = new Window(0, 1, typeOfWindow.DOUBLE_GLAZED, typeOfLock.KEY, false);
		Window diningWindow2 = new Window(0, 2, typeOfWindow.TRIPLE_GLAZED, typeOfLock.LATCH, false);
		Window diningWindow3 = new Window(0, 2, typeOfWindow.TRIPLE_GLAZED, typeOfLock.LATCH, false);
		Window diningWindow4 = new Window(0, 1, typeOfWindow.DOUBLE_GLAZED, typeOfLock.KEY, false);

		Room livingRoom = new Room(0, 20, typeOfRoom.LIVINGROOM);
		Window livingWindow1 = new Window(0, 1, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
		Window livingWindow2 = new Window(0, 1, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
		Window livingWindow3 = new Window(0, 1, typeOfWindow.DOUBLE_GLAZED, typeOfLock.LATCH, false);
				
		Room famRoom = new Room(0, 30, typeOfRoom.FAMILYROOM);
		Window famWindow1 = new Window(0, 2, typeOfWindow.TRIPLE_GLAZED, typeOfLock.KEY, false);
		Window famWindow2 = new Window(0, 2, typeOfWindow.TRIPLE_GLAZED, typeOfLock.KEY, false);
				
		Room bathroom1 = new Room(0, 5, typeOfRoom.BATHROOM1);
		Window bath1Window = new Window(0, 1, typeOfWindow.TRIPLE_GLAZED, typeOfLock.LATCH, false);
		Door bath1door = new Door(1, "wood", typeOfLock.KEY, typeOfDoor.INNER_DOOR, false);
		
		Room garage = new Room(-1, 25, typeOfRoom.GARAGE);
		Window garageWindow = new Window(-1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.LATCH, false);
		Door garageDoor1 = new Door(-1, "Steel", typeOfLock.DIGITAL, typeOfDoor.GARAGE_DOOR, false);
		Door garageDoor2 = new Door(-1, "Steel", typeOfLock.DIGITAL, typeOfDoor.GARAGE_DOOR, false);
		Door sideGarageDoor = new Door(-1, "Steel", typeOfLock.KEY, typeOfDoor.INNER_DOOR, false);
				
		Room garden = new Room(0, 100, typeOfRoom.GARDEN);
				
		//LEVEL -1
		Room cellar = new Room(-1, 45, typeOfRoom.CELLAR);
		Window cellWindow1 = new Window(-1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.KEY, false);
		Window cellWindow2 = new Window(-1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.KEY, false);
		Window cellWindow3 = new Window(-1, 1, typeOfWindow.SINGLE_GLAZED, typeOfLock.KEY, false);
		Door cellDoor = new Door(-1, "Fiberglass", typeOfLock.KEY, typeOfDoor.CELLAR_DOOR, false);

		Scene scene1, scene2, scene3;

		public static void callPolice() {
			if (Intruder.alarm() == true) {
				System.out.println("Calling the Police");
			}
		}
		@Override
		public void start(Stage arg0) throws Exception {
			
		}	
}
