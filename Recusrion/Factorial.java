import java.util.Scanner;

public class Factorial {

    public static int fact(int num) {
        if(num == 1) {
            return 1;
        }

        return num * fact(num - 1);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println("Factorial of "+ num + " is: "+ fact(num));
        s.close();
    }
}