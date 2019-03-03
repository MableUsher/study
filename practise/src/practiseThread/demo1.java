package practiseThread;

public class demo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread mt = new myThread();
		mt.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("weixin");
		}
		
	}

}
class myThread extends Thread {
		public void run() {
			for (int i = 0; i < 10200; i++) {
				System.out.println("qq");
			}
		}
	}