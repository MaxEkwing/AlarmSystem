package intruder;

import java.util.Random;

public class Temperature {
	public static int randomTemp() {
		 Random random = new Random();
	     int temperature = random.nextInt(151);
		 return temperature;
		
	}

	
}
