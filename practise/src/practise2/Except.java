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
		System.out.println("请输入被除数");
		int a = input.nextInt();
		System.out.println("请输入除数");
		int b = input.nextInt();
		int c = a/b;
	}catch(InputMismatchException e) {
		System.out.println("该输个整数");
	}catch(ArithmeticException e) {
		System.out.println("除数不能为0");
	}finally {
		System.out.println("程序结束");
	}
}


}