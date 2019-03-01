package practise1;

public class Fog extends Dog {

	public Fog(String newSexual, int newWeight) {
		super(newSexual, newWeight);
		// TODO Auto-generated constructor stub
	}
	public void method() {
		System.out.println(super.weight);
	}
@Override
	public String toString() {
		return "Fog [weight=" + weight + "]";
	}
public static void main(String[] args) {
	Fog a = new Fog("NAN",3);
	System.out.println(a.weight);
	a.method();
	System.out.println(a);
}
}
