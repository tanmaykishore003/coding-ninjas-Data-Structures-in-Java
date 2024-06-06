import java.util.Scanner;

public class Fibonacci {

    public static int nthFibonacci(int num) {
        if(num == 0 || num == 1) {
            return num;
        }

        return nthFibonacci(num - 1) + nthFibonacci(num - 2);
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println(nthFibonacci(num));
        s.close();
    }
}
