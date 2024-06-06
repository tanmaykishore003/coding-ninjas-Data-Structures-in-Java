import java.util.Scanner;

public class SumOfNatural {

    public static int sum(int num) {
        if(num == 1) {
            return 1;
        }

        return num + sum(num - 1);
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println("Sum of "+ num + " natural numbers are: "+ sum(num));
        s.close();
    }
}
