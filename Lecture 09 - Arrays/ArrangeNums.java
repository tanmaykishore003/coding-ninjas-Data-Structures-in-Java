import java.util.Scanner;

public class ArrangeNums {

    public static void printArrangement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int count = 1;

        while(start <= end) {
            arr[start] = count;
            start++;
            count++;

            if(start <= end) {
                arr[end] = count;
                count++;
                end--;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int arr[] = new int[size];
        printArrangement(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        s.close();
    }
}
