package thread;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePrintingThread extends Thread {
 //   static LocalTime currentTime;
    private boolean isCancelled=false;

    @Override
    public void run() {
        while (!isCancelled) {
           // currentTime = LocalTime.now();

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\n"+LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond());
        }
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
