package practise2;

public class Circle extends Shape implements Eat{

	@Override
	public double l(double a, double b) {
		// TODO Auto-generated method stub
		
		return 2*a*b;
	}

	@Override
	public double s(double a, double b) {
		// TODO Auto-generated method stub
		
		return a*b*b;
	}

	@Override
	public void chi() {
		// TODO Auto-generated method stub
		System.out.println("©иртЁт");
	}

}
