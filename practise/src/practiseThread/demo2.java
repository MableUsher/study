package practiseThread;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	myRunnable mr = new myRunnable();
	Thread th = new Thread(mr);
	th.start();
	for (int i = 0; i < 1000; i++) {
		System.out.println("weixin");
	}

	}

}
class myRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 10200; i++) {
			System.out.println("qq");
		}
	}
}