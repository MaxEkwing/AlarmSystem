package application;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import intruder.Intruder;
import room.Room;

public class CountdownClock extends HouseBuilder{
  private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
  private long remaining;

  public CountdownClock(long duration) {
    this.remaining = duration;
  }

  public void start() {
    scheduler.scheduleAtFixedRate(new Runnable() {
      public void run() {
        remaining -= 1000; 
        if (remaining <= 0) {
        	while (checkAlarmStatus() == false) {
        		intruderBuilder();
                System.out.println(motionSensor());
                Intruder.alarm();
                if (Intruder.fire() == true) {
                	Room.sprinklers();
                }
                scheduler.shutdown();

                break;
                }
        	}
        else {
          System.out.println("Time until intruder: " + remaining / 1000 + " seconds");
        }
      }
    }, 0, 1, TimeUnit.SECONDS);
  }
}

