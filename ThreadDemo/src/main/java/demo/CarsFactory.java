package demo;

public class CarsFactory {
	public static Cars CreatCars(String name) {
		if("s600".equals(name)) {
			return new Benz();
		}else if("r8".equals(name)) {
			return new Audi();
		}else {
			return null;
		}
	}

}
