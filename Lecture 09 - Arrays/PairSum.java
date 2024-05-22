import java.util.Scanner;

public class PairSum {

    public static int findIndex(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();

        System.out.println(findIndex(arr, target));

        s.close();
    }
}
