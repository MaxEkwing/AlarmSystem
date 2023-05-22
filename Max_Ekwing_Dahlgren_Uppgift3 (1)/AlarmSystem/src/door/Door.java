package door;

public class Door{
	int floor;
	String material;
	protected boolean isLocked;
	public boolean isOpen;
	protected boolean larmed;
	protected typeOfLock lock;
	protected typeOfDoor door;

	public Door(int floor, String material, typeOfLock lock, typeOfDoor door, boolean isLocked) {
		super();
		this.floor = floor;
		this.material = material;
		this.lock = lock;
		this.door = door;
		this.isLocked = false;
	}
	public void printTypeOfDoor() {
		System.out.println(door.getLabel());
	}
	public void printTypeOfLock() {
		System.out.println(lock.getLabel());
	}
	public void lockDoor() {
		if (isLocked == true) {
			System.out.println("Door is already locked");
		} else {
			System.out.println("Door is locked");
			this.isLocked = true;
			this.larmed = true;
		}
	}
	public void unlockDoor() {
		if (isLocked == false) {
			System.out.println("Door is already unlocked");
		}
		else {
			this.isLocked = false;
			this.larmed = false;
			System.out.println("Door is unlocked");
		}
	}
	//LOCK STATUS
	public boolean checkDoorStatus() {
		if (this.isLocked == true) {
			this.larmed = true;
		    return true;
		}
		else {
			this.larmed = false;
			return false;
		}
	}
	public void openDoor() {
		if (isLocked == true) {
			System.out.println("Door is locked and cannot be opened");
			isOpen = false;
		}
		else if (isLocked == false) {
			System.out.println("The door is open");
			isOpen = true;
		}
	}
	public void closeDoor() {
		System.out.println("Door is closed");
		isOpen = false;
	}
}
