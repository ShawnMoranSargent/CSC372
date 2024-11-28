package fruit;

public class Fruit {
	private String Name;
	private String taste;
	private int daysToExpire;
	private int age;
	
	public Fruit() {
		Name = "Fruit";
		taste = "Sweet";
		daysToExpire = 2;
		age = 0;
	}
	
	public Fruit(String fruitName, String newtaste, int newDaysToExpire, int newAge) {
		this.Name = fruitName;
		this.taste = newtaste;
		this.daysToExpire = newDaysToExpire;
		this.age = newAge;
	}
	
	public void eat() {
		if(isExpired()) {
			System.out.println("EW " + this.Name + " Is Expired!");
		}
		else {
			System.out.println("Eating the " + this.Name);
			System.out.println("the " + this.Name + " is " + this.taste);
		}
	}
	public boolean isExpired() {
		if(this.age < this.daysToExpire) {
			return false;
		}else {
			return true;
		}
	}
	
}

