package practise2;
import java.util.*;


public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Shape rec = new Rectangle();
Shape cir = new Circle();
Scanner scanner=new Scanner(System.in);
System.out.println("请输入长方形的长，宽");
double a=scanner.nextDouble();
double b=scanner.nextDouble();
System.out.println("长方形的周长为"+rec.l(a, b));
System.out.println("长方形的面积为"+rec.s(a, b));
System.out.println("请输入圆形的半径，pi值");
double c=scanner.nextDouble();
double d=scanner.nextDouble();
System.out.println("圆形的周长为"+rec.l(c, d));
System.out.println("圆形的面积为"+rec.s(c, d));*/
		Eat ip1 = new Circle();
		ip1.chi();
		Eat ip2 = new Binzi();
		ip2.chi();
		/*Eat ip3 =*/ new Eat() {
	public void chi() {
		System.out.println("匿名内部类实现方式");
	}
		}.chi();;
	}

}
