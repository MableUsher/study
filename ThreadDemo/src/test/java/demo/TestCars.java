package demo;

public class TestCars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi a = (Audi) CarsFactory.CreatCars("r8");
		Benz b = (Benz) CarsFactory.CreatCars("s600");
		a.speed();
		b.speed();
		Audi a2 = (Audi) new AudiFactory().createCars(); 
		Benz b2 = (Benz) new BenzFactory().createCars();
		a2.speed();
		b2.speed();
	}

}
