import java.util.HashMap;

public class HashExample {
  public static void main(String[] args) {
    HashMap<String,String> cars = new HashMap<>();
    cars.put("Ford", "Mustang");
    cars.put("Chevy", "Camaro");
    cars.put("Dodge", "Challenger");
    
    System.out.println(cars.get("Ford"));
  }
}