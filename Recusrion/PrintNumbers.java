import java.util.Scanner;

public class PrintNumbers {

    public static void print(int num) {
        if(num == 0) {
            return;
        }
        print(num - 1);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        print(num);
        s.close();
    }
}
