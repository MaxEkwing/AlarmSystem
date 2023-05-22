package window;

import door.typeOfLock;

public class Window{
	int floor;
	int squareMeter;
	protected boolean isLocked;
	boolean isOpen;
	protected boolean larmed;
	protected typeOfWindow glass;
	protected typeOfLock lock;

	public Window(int floor, int squareMeter, typeOfWindow glass, typeOfLock lock, boolean isLocked) {
		super();
		this.floor = floor;
		this.squareMeter = squareMeter;
		this.glass = glass;
		this.lock = lock;
		this.isLocked = false;
	}

		public void printTypeOfGlass() {
			System.out.println(glass.getLabel());
		}
		public void printTypeOfLock() {
			System.out.println(lock.getLabel());
		}
		
		public void openWindow() {
			if (isLocked == true) {
				System.out.println("Window is locked and cannot be opened");
				isOpen = false;
			}
			else if (isLocked == false) {
				System.out.println("The window is open");
				isOpen = true;
			}
		}
		public void closeWindow() {
			System.out.println("Window is closed");
			isOpen = false;
			
		}
		public void lockWindow() {
			if (isLocked == true) {
				System.out.println("Window is already locked");
			}
			else {
				System.out.println("Window is locked");
				this.isLocked = true;
				this.larmed = true;
			}
		}
		public void unlockWindow() {
			if (isLocked == false) {
				System.out.println("Window is already unlocked");
			}
			else {
				this.isLocked = false;
				this.larmed = false;
				System.out.println("Window is unlocked");
			}
		}
		public boolean checkWindowStatus() {
			if (isLocked == true) {
				this.larmed = true;
			    return true;
			}
			else {
				this.larmed = false;
				return false;
			}
		}
}
