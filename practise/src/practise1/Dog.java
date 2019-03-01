package practise1;

public class Dog {
public static void main(String[] args) {
	Dog a = new Dog("woman",100);
	a.setColor("red");
	System.out.println(a.getColor());

	a.goHome();
	a.bite();
	
}	
	public Dog(String newSexual,int newWeight) {
		sexual = newSexual;
		weight = newWeight;		
	}
	int weight;
	private   String color;
	private  String sexual;
	public  void setColor(String Color) {
		this.color = Color;
	}
	public  String getColor() {
		return color;
	}
	void goHome() {
		System.out.println("回家"+weight+"颜色"+color+sexual);
	}
	void bite() {
		System.out.println("咬人");
	}


}