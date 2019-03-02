package demo;

public class Demo {
	public String sayHello() {
		return"Hello maven";
	}
	public static void main(String[] args) {
		
		System.out.println(new Demo().sayHello());
	}

}
