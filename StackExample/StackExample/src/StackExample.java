import java.util.ArrayList;
import java.util.List;

public class StackExample {
    public static void main(String[] args) {
        List<String> Stack = new ArrayList<>();
        Stack.add("action one");
        Stack.add("Action two");
        Stack.add("Action three");

        System.out.println( "Performing " + Stack.remove(Stack.size() - 1));
        System.out.println( "Performing " + Stack.remove(Stack.size() - 1)); 
        System.out.println( "Performing " + Stack.remove(Stack.size() - 1));  

    }
}