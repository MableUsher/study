package demo;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a2 = (Audi) new AudiFactory().createCars(); 
		Benz b2 = (Benz) new BenzFactory().createCars();
		a2.speed();
		b2.speed();
	}

}
