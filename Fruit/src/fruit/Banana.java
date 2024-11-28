package fruit;

public class Banana extends Fruit {
	public Banana() {
		super("Banana", "Sweet", 3, 0);
	}
	public void peel() {
		System.out.println("peeling the Banana");
	}
	
	public void eat() {
		peel();
		System.out.println("Eating the Banana");
	}
}
