package practise2;
import java.util.*;
public class Except {

public static void main(String[] args) {
	Except a = new Except();
	a.test();
}	
	public void test() {
	Scanner input = new Scanner(System.in);
		try {	
		System.out.println("�����뱻����");
		int a = input.nextInt();
		System.out.println("���������");
		int b = input.nextInt();
		int c = a/b;
	}catch(InputMismatchException e) {
		System.out.println("���������");
	}catch(ArithmeticException e) {
		System.out.println("��������Ϊ0");
	}finally {
		System.out.println("�������");
	}
}


}