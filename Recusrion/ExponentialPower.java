import java.util.Scanner;

public class ExponentialPower {
    
    public static int power(int num, int x) {
        if(x == 0) {
            return 1;
        }
        return num*power(num, x-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int x = s.nextInt();

        System.out.println(power(num, x));
        s.close();
    }
}
