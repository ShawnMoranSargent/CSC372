import java.io.Console;

public class RecursiveMultiply {
    public static int RecurseMultiply(int[] n, int i){
        if (i == n.length){
            return 1;
        }
        else{
            return RecurseMultiply(n, i + 1) * n[i];
        }
    }
    public static void main(String[] args){
        Console Console = System.console();
        int[] Numbers = {0,0,0,0,0};
        for(int i = 0; i < 5; i++){
            Numbers[i] = Integer.parseInt(Console.readLine("Enter a number to test: "));
        }
        int product = RecurseMultiply(Numbers, 0);
        System.out.print(product);
    }
}
