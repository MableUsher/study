package practise2;
import java.util.*;


public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Shape rec = new Rectangle();
Shape cir = new Circle();
Scanner scanner=new Scanner(System.in);
System.out.println("�����볤���εĳ�����");
double a=scanner.nextDouble();
double b=scanner.nextDouble();
System.out.println("�����ε��ܳ�Ϊ"+rec.l(a, b));
System.out.println("�����ε����Ϊ"+rec.s(a, b));
System.out.println("������Բ�εİ뾶��piֵ");
double c=scanner.nextDouble();
double d=scanner.nextDouble();
System.out.println("Բ�ε��ܳ�Ϊ"+rec.l(c, d));
System.out.println("Բ�ε����Ϊ"+rec.s(c, d));*/
		Eat ip1 = new Circle();
		ip1.chi();
		Eat ip2 = new Binzi();
		ip2.chi();
		/*Eat ip3 =*/ new Eat() {
	public void chi() {
		System.out.println("�����ڲ���ʵ�ַ�ʽ");
	}
		}.chi();;
	}

}