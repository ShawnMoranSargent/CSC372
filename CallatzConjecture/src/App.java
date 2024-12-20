import java.io.Console;

public class App {
    public static boolean isEven(int n){
        return (n % 2 == 0);
    }
    public static int Callatz(int n, int i){
        // Base Case for integer overflow
        // System.out.println("i :" + i + " n : " + n);
        if(n < 0){
            return -1;
        }
        // Base Case of 1
        if(n == 1){
            return i;
        }
        else if(isEven(n)){
            return Callatz(n/2, i + 1);
        }
        else{
            return Callatz( (n * 3) + 1, i + 1);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Console Console = System.console();
        int number = Integer.parseInt(Console.readLine("Enter a number to test: "));
        
        int test = Callatz(number, 1);
        if(test > -1){
            System.out.println("Your Number reaches 1 in " + test + " iterations");
        }
        else{
            System.out.println("Your Number got too big..");
        }
    }

}
