import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class TimerThread extends Thread {

	public void run() {

		for (int i = 0; i < 20; i++) {
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			System.out.println("Thread5:"+dateFormat.format(date));

			try {
				sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}

}