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
	
	static int tickets = 100;		//����Ʊ��������100����̬Ϊ���ö���ʹ��ͬһ��ȫ�ֱ���
	//static Object obj= new Object();	
	public TicketSeller() {				//�̳и���Ĺ��췽��
		super();
	}	
	public void run() {				//��дrun����
		while(true) {				//��������ѭ��
			synchronized (TicketSeller.class) {		//ͬ���Է�ֹ����0��-1Ʊ
			if(tickets<=0)
				break;
			try {
				Thread.sleep(100);	//ʹ�������߳���������ϸ��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getName()+"���ǵ�"+tickets--+"��Ʊ");	
			}
			
		}
	}
}