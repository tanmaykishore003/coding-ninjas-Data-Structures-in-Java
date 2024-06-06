import java.util.Scanner;

public class CountDigits {
    public static int numOfDigits(int num) {
        if(num == 0) {
            return 0;
        }
        return 1 + numOfDigits(num/10);
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        System.out.println(numOfDigits(num));
        s.close();
    }
}
