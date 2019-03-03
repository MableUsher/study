package demo;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//匿名内部类的两种多线程方法
		new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("qq");
				}
			}
		}.start();
		
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("weixin");
				}
			}
		}).start();
	}

}
