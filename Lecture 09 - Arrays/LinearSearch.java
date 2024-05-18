import java.util.Scanner;

public class LinearSearch {

    public static int findIndex(int[] arr, int x) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        int x = s.nextInt();

        System.out.println("Number is present at index: "+ findIndex(arr, x));

        s.close();
    }
}
