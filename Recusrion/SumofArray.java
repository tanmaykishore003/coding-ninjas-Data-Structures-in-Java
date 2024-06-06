import java.util.Scanner;

public class SumofArray {

    public static int findSum(int input[]) {
        if(input.length == 1) {
            return input[0];
        }

        int[] smallInput = new int[input.length - 1];
        for(int i = 0; i < input.length - 1; i++) {
            smallInput[i] = input[i];
        }

        return findSum(smallInput) + input[input.length - 1];
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] input = new int[size];

        for(int i = 0; i < size; i++) {
            input[i] = s.nextInt();
        }

        System.out.println(findSum(input));
        s.close();
    }
}
