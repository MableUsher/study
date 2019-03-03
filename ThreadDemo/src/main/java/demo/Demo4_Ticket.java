package demo;


public class Demo4_Ticket {
	public static void main(String[] args) {
		new TicketSeller().start();
		new TicketSeller().start();
		new TicketSeller().start();
		new TicketSeller().start();
	}
}
class TicketSeller extends Thread{
	
	static int tickets = 100;		//定义票的张数：100，静态为了让对象使用同一个全局变量
	//static Object obj= new Object();	
	public TicketSeller() {				//继承父类的构造方法
		super();
	}	
	public void run() {				//重写run方法
		while(true) {				//制造无限循环
			synchronized (TicketSeller.class) {		//同步以防止出现0和-1票
			if(tickets<=0)
				break;
			try {
				Thread.sleep(100);	//使用休眠线程来检测程序细节
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName()+"这是第"+tickets--+"号票");	
			}
			
		}
	}
}