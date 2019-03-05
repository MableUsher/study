package demo;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo5_Timer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Timer t = new Timer();
		t.schedule(new MyTimerTask(), new Date(119,2,5,12,46,20), 3000);
	
		while(true) {
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}

}
class MyTimerTask extends TimerTask{
	public void run() {
		System.out.println("¸ÃÈ¥°á×©ÁË");
	}
}